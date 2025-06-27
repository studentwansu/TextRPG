package regame;

import java.util.Random;

public class Monster {

    private String name;
    private int hp;
    private int atk;
    private int money;
    private int minGold;
    private int maxGold;
    private Random r = new Random();

    public Monster(){};

    public Monster(String name) {
        this.name = name;
    }

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Monster(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public Monster(String name, int hp, int atk, int money) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.money = money;
    }

    public Monster(String name, int hp, int atk, int money, int minGold, int maxGold) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.money = money;
        this.minGold = minGold;
        this.maxGold = maxGold;
    }

    public Monster(String name, int hp, int atk, int minGold, int maxGold) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.minGold = minGold;
        this.maxGold = maxGold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getInformation() {
        return "name" + name + "hp" + hp + "atk" + atk + "money" + money;
    }

    public void attack(Player target) {
        int totalDamage =this.atk;

        System.out.println(name + "이" + target.getName() + "을 공격합니다!");

        target.takeDamage(totalDamage);
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(name + "이 " + damage + "의 피해를 입었습니다! 남은 HP: " + hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getRandomGold() {
        return r.nextInt(maxGold - minGold + 1) + minGold;
    }
}
