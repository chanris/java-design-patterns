package com.charnis.composite;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description 组合模式：将对象组合成树结构以表示整体层次结构。组合可以使客户端统一对待单个对象和组合对象。
 * 组合模式使客户端能够以统一的方式对待各个对象。
 */
public class App {
    public static void main(String[] args) {
        var orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();
//        var elfComposite = new Messenger().messageFromElves();
//        elfComposite.print();
    }
}
