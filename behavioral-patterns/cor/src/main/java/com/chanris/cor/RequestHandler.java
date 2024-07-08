package com.chanris.cor;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public interface RequestHandler {
    boolean canHandleRequest(Request req);
    int getPriority();
    void handle(Request req);
    String name();
}
