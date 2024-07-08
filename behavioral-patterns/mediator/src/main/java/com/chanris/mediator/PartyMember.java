package com.chanris.mediator;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public interface PartyMember {
    void joinedParty(Party party);
    void partyAction(Action action);
    void act(Action action);
}
