package com.chanris.abstractfactory;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/7
 * @description
 */
public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
