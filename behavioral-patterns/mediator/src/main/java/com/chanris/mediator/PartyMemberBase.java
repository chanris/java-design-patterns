package com.chanris.mediator;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public abstract class PartyMemberBase implements PartyMember{
    protected Party party;

    @Override
    public void joinedParty(Party party) {
        System.out.println(this + " joins the party");
        this.party = party;
    }

    // 成员被派对通知执行的动作
    @Override
    public void partyAction(Action action) {
        System.out.println(this + " " + action.getDescription());
    }

    // 成员发起的动作, 把这个信息转给party，party再去通知其他的派对成员
    @Override
    public void act(Action action) {
        if (party != null) {
            System.out.println(this + " " + action);
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}
