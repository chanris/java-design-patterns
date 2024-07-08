package com.chanris.memento;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 * Star使用“备忘录”来存储和恢复状态。
 */
public class Star {
    private StarType type;
    private int ageYears;
    private int massTons;
    public Star(StarType startType, int startAge, int startMass) {
        this.type = startType;
        this.ageYears = startAge;
        this.massTons = startMass;
    }

    // 让时间流逝
    public void timePasses() {
        ageYears *= 2;
        massTons *= 8;
        switch (type) {
            case SUN -> type = StarType.RED_GIANT;
            case RED_GIANT -> type = StarType.WHITE_DWARF;
            case WHITE_DWARF -> type = StarType.SUPERNOVA;
            case SUPERNOVA -> type = StarType.DEAD;
            case DEAD -> {
                ageYears *= 2;
                massTons = 0;
            }
            default -> {}
        }
    }

    StarMemento getMemento() {
        var state = new StarMementoInternal();
        state.setAgeYears(ageYears);
        state.setMassTons(massTons);
        state.setType(type);
        return state;
    }

    void setMemento(StarMemento memento) {
        var state = (StarMementoInternal)memento;
        this.type = state.getType();
        this.ageYears = state.getAgeYears();
        this.massTons = state.getMassTons();
    }

    @Override
    public String toString() {
        return "Star{" +
                "type=" + type +
                ", ageYears=" + ageYears +
                ", massTons=" + massTons +
                '}';
    }

    /**
     * 行星（状态）备忘录实现
     */
    private static class StarMementoInternal implements StarMemento {
        private StarType type;
        private int ageYears;
        private int massTons;

        public StarType getType() {
            return type;
        }

        public void setType(StarType type) {
            this.type = type;
        }

        public int getAgeYears() {
            return ageYears;
        }

        public void setAgeYears(int ageYears) {
            this.ageYears = ageYears;
        }

        public int getMassTons() {
            return massTons;
        }

        public void setMassTons(int massTons) {
            this.massTons = massTons;
        }
    }
}
