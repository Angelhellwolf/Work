package com.angelhell.work4;

public class RoleSetting {
    private String userName;
    private double HP;
    private double attackPower;

    public RoleSetting() {
    }

    public RoleSetting(String userName, double HP, double attackPower) {
        this.userName = userName;
        this.HP = HP;
        this.attackPower = attackPower;
    }

    /**
     * 获取
     *
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     *
     * @return HP
     */
    public double getHP() {
        return HP;
    }

    /**
     * 设置
     *
     * @param HP
     */
    public void setHP(double HP) {
        this.HP = HP;
    }

    /**
     * 获取
     *
     * @return attackPower
     */
    public double getAttackPower() {
        return attackPower;
    }

    /**
     * 设置
     *
     * @param attackPower
     */
    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public String toString() {
        return "RoleSetting{userName = " + userName + ", HP = " + HP + ", attackPower = " + attackPower + "}";
    }
}
