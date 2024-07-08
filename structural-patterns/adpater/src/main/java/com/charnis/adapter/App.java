package com.charnis.adapter;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 适配器模式能够让你可以把不兼容的对象包在适配器中，让其兼容其他类
 *
 * 使用适配器模式当
 *
 * 你想使用一个已有类，但是它的接口不能和你需要的所匹配
 * 你需要创建一个可重用类，该类与不相关或不可预见的类进行协作，即不一定具有兼容接口的类
 * 你需要使用一些现有的子类，但是子类化他们每一个的子类来进行接口的适配是不现实的。一个对象适配器可以适配他们父类的接口。
 * 大多数使用第三方类库的应用使用适配器作为一个在应用和第三方类库间的中间层来使应用和类库解耦。如果必须使用另一个库，
 * 则只需使用一个新库的适配器而无需改变应用程序的代码。
 */
public class App {
    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
