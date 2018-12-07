package com.shibofu.spring.model;

/**
 * @author potter.fu
 * @date 2018-12-07 15:27
 */
public class Money {
    private int basic;
    private int reward;
    private int punishment;

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getPunishment() {
        return punishment;
    }

    public void setPunishment(int punishment) {
        this.punishment = punishment;
    }
}
