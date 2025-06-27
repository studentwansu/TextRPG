package regame;

public class Player {

    private String name;
    private int hp;
    private int atk;
    private int money;
    private Weapon wp;

    public Player(){};

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Player(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public Player(String name, int hp, int atk, int money) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.money = money;
    }

    public Player(String name, int hp, int atk, int money, Weapon wp){
        this(name, hp, atk, money);
        this.wp = wp;
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

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public String getInformation() {
        return  name +"의" + " 체력 : " + hp + ", 공격력 : " + totalAtk() + ", 자금 : " + money;
    }

    public int restoreHealth() {
        return hp++;
    }

    public int potion() {
        return hp = hp + 10;
    }


    public void attack(Monster target) {
        int totalDamage =this.atk + wp.getTotalAttackPower();

        System.out.println(name + "이" + target.getName() + "을 공격합니다!");

        wp.specialEffect();

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

    public void addMoney(int amount) {
        money += amount;
        System.out.println(name + "이" + amount + "원을 획득했습니다! 현재잔액은 : " + money + " 원");
    }

    public boolean payMoney(int amount) {
        if (money >= amount) {
            money -= amount;
            System.out.println(name + "이" + amount + "원을 사용했습니다. 남은 돈 : " + money + " 원");
            return true;
        } else {
            System.out.println(" 돈 없는데? 현재 잔액 : " + money + " 원");
            return false;
        }
    }

    public int totalAtk() {
        return atk + wp.getTotalAttackPower();
    }
}
