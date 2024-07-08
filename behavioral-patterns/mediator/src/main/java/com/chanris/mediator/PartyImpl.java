package com.chanris.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public class PartyImpl implements Party{
    private final List<PartyMember> members;

    public PartyImpl() {
        this.members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember member) {
        this.members.add(member);
        member.joinedParty(this);
    }

    // 派对接收到成员发布的消息，广播给参加派对的其他成员
    @Override
    public void act(PartyMember actor, Action action) {
        for (var member : members) {
            if (!member.equals(actor)) {
                member.partyAction(action);
            }
        }
    }
}
