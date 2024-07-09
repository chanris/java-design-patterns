package com.charnis.visitor;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description 访问者接口
 */
public interface UnitVisitor {
    void visit(Soldier soldier);
    void visit(Sergeant sergeant);
    void visit(Commander commander);
}
