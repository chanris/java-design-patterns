package com.chanris.cor;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class OrcCommander implements RequestHandler{

    @Override
    public boolean canHandleRequest(Request req) {
        // 如果请求类型为 DEFEND_CASTLE，则可以处理此请求
        return req.getRequestType() == RequestType.DEFEND_CASTLE;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.printf("%s handling request :{%s}", name(), req);
    }

    @Override
    public String name() {
        return "Orc commander";
    }
}
