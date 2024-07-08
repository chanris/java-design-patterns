package com.chanris.cor;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class OrcSolider implements RequestHandler{
    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.COLLECT_TAX;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.printf("%s handling request: {%s}", name(), req);
    }

    @Override
    public String name() {
        return "Orc solider";
    }
}
