package com.chanris.command;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public abstract class Target {
    private Size size;
    private Visibility visibility;

    public void printStatus() {
        System.out.printf("%s, [size=%s] [visibility=%s]\n", this, getSize(), getVisibility());
    }

    /**
     * 改变目标的尺寸
     */
    public void changeSize() {
        var oldSize = getSize() == Size.NORMAL ? Size.SMALL : Size.NORMAL;
        setSize(oldSize);
    }

    /**
     * 改变目标的可见性
     */
    public void changeVisibility() {
        var visible = getVisibility() == Visibility.VISIBLE
                ? Visibility.INVISIBLE : Visibility.VISIBLE;
        setVisibility(visible);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }
}
