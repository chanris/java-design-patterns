package com.chanris.state;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description Java 中的状态模式： 利用状态封装增强行为动态性
 * 使对象能够在其内部状态发生变化时动态改变其行为，从而优化 Java 应用程序的响应速度。
 */
public class App {
    public static void main(String[] args) {
        var mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
    }
}
