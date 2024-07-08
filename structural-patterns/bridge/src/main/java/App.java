/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description 桥接将抽象和实现分离，以便二者可以独立变化
 * 桥接模式是一个更推荐组合而不是继承的模式。将实现细节从一个层次结构推送到具有单独层次结构的另一个对象。
 *
 * 参考：https://refactoringguru.cn/design-patterns/bridge
 */
public class App {
    public static void main(String[] args) {
        Sword enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();
//        The sword is wielded.
//        The item spreads bloodlust.
//        The sword is swinged.
//        The item eats the soul of enemies.
//        The sword is unwielded.

        Hammer enchantedHammer = new Hammer(new FlyingEnchantment());
        enchantedHammer.wield();
        enchantedHammer.swing();
        enchantedHammer.unwield();
    }
}
