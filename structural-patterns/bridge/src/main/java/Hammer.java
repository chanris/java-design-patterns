/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public class Hammer implements Weapon{
    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The hammer is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("The hammer is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("The hammer is unwielded.");
        enchantment.onDeactivate();
    }
}
