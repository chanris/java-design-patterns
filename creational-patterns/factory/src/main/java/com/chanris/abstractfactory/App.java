package com.chanris.abstractfactory;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description 抽象工厂
 * 提供一个用于创建相关对象家族（一系列的对象）的接口，而不需指定具体的类。
 *
 * 例子：要创建一个王国，我们需要具有共同主题的对象。精灵王国需要精灵国王、精灵城堡和精灵军队，而兽人王国需要
 * 兽人王国、兽人城堡和兽人军队。王国中的对象之间存在依赖关系。
 * 俗话说抽象工厂是工厂的工厂； 一个将单个但相关/从属的工厂分组在一起而没有指定其具体类别的工厂。
 */
public class App {

    public static class FactoryMaker {
        public enum KingdomType {
            ELF, ORC
        }

        public static KingdomFactory makeFactory(KingdomType type) {
            return switch (type) {
                case ELF -> new ElfKingdomFactory();
                case ORC -> new OrcKingdomFactory();
                default ->  throw new IllegalArgumentException("KingdomType not supported.");
            };
        }
    }

    private Army army;
    private Castle castle;
    private King king;

    public static void main(String[] args) {
        App app = new App();

        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF));
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public void setKing(King king) {
        this.king = king;
    }

    public Army getArmy() {
        return army;
    }

    public Castle getCastle() {
        return castle;
    }

    public King getKing() {
        return king;
    }

    public void createKingdom(KingdomFactory kingdomFactory) {
        this.army = kingdomFactory.createArmy();
        this.castle = kingdomFactory.createCastle();
        this.king = kingdomFactory.createKing();
    }
}
