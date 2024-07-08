package com.chanris.cor;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description 通过给多个对象一个处理请求的机会，避免请求的发送者和他的接受者耦合。
 * 串联接收对象并在链条中传递请求直到一个对象处理它。
 *
 * Java中的责任链模式:构建健壮的请求处理机制
 */
public class App {
    public static void main(String[] args) {
        var king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
    }
}
