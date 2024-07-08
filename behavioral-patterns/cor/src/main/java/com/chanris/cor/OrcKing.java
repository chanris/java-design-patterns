package com.chanris.cor;

import java.util.Comparator;
import java.util.List;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description OrcKing发出由链处理的请求。
 */
public class OrcKing {
    private List<RequestHandler> handlers;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        this.handlers = List.of(
                new OrcCommander(),
                new OrcOfficer(),
                new OrcSolider()
        );
    }

    /**
     * 按链式顺序执行
     * @param req
     */
    public void makeRequest(Request req) {
        handlers
                .stream()
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                .filter(handler -> handler.canHandleRequest(req))
//                .forEach(handler -> {
//                    handler.handle(req);
//                });
                .findFirst() // 找出流的第一个元素进行处理，其他就不管了
                .ifPresent(handler -> handler.handle(req));
    }

}
