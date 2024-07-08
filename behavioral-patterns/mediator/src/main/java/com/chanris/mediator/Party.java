package com.chanris.mediator;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public interface Party {
    void addMember(PartyMember member);
    void act(PartyMember actor, Action action);
}
