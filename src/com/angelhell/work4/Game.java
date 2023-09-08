package com.angelhell.work4;

public class Game {
    public static void main(String[] args) {
        RoleSetting role1 = new RoleSetting("雷神", 100, 5);
        RoleSetting role2 = new RoleSetting("火神", 50, 12);
        String role1Name = role1.getUserName();
        String role2Name = role2.getUserName();
        double role1HP = role1.getHP();
        double role2HP = role2.getHP();
        double role1attackPower = role1.getAttackPower();
        double role2attackPower = role2.getAttackPower();
        String win = war(role1Name,role2Name,role1HP,role2HP,role1attackPower,role2attackPower);
        System.out.println(" ");
        System.out.println(win + "赢得冠军！");
    }
    public static String war(String role1Name,String role2Name,double role1HP,double role2HP,double role1attackPower,double role2attackPower){
        double tempRole1HP = role1HP;
        System.out.println(tempRole1HP);
        double tempRole2HP = role2HP;
        System.out.println(tempRole2HP);
        String win;
        for(;;) {
            tempRole1HP = tempRole1HP - role2attackPower;
            System.out.println(role2Name + "打了一下" + role1Name + "造成了" + role1attackPower + "伤害" + "剩余生命值" + tempRole1HP);
            tempRole2HP = tempRole2HP - role1attackPower;
            System.out.println(role1Name + "打了一下" + role2Name + "造成了" + role1attackPower + "伤害" + "剩余生命值" + tempRole2HP);
            if(tempRole1HP <=0){
                break;
            }
            if(tempRole2HP <=0){
                break;
            }
        }
        if (tempRole1HP > tempRole2HP){
            System.out.println(role1Name + "获胜");
            win = role1Name;
        }else{
            System.out.println(role2Name + "获胜");
            win = role2Name;
            //Test
        }
        return win;
    }
}
