package regame;

import java.util.Random;

public abstract class Weapon {

    private String name;
    private int baseAtk;
    private int extraAtk;
    private int upgradeLevel;
    private Random random = new Random();

    public Weapon() {
    }



    public Weapon(String name) {
        this.name = name;
    }

    public Weapon(String name, int baseAtk) {
        this.name = name;
        this.baseAtk = baseAtk;
        this.extraAtk = 0;
        this.upgradeLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAtk(int atk) {
        this.baseAtk = atk;
    }

    public int getTotalAttackPower() {
        return baseAtk + extraAtk;
    }

    public int getUpgradeLevel() {
        return upgradeLevel;
    }


    public abstract void specialEffect();

    public void upgrade() {

        if (upgradeLevel >= 20) {
            System.out.println("🎈이미 최대 강화 단계(20강)입니다! 더 이상 강화할 수 없습니다.");
            return;
        }

        int successChance;
        if (upgradeLevel < 5) {
            successChance = 70;
        } else if (upgradeLevel < 10) {
            successChance = 50;
        } else if (upgradeLevel < 15) {
            successChance = 30;
        } else {
            successChance = 15;
        }

        int roll = random.nextInt(100);
        if (roll < successChance) {
            upgradeLevel++;
            extraAtk += 5;
            System.out.println("✨ 강화 성공! 무기의 현재 공격력: " + getTotalAttackPower() + " | 강화 단계: +" + upgradeLevel);
            if (upgradeLevel >= 20) {
                System.out.println("🎉 축하합니다! 무기가 최대 강화 단계(20강)에 도달했습니다.");
                System.out.println("🎉 전설의 무기가 완성되었습니다. 게임을 종료합니다. 🎉");
                System.exit(0);
            }
        }else {
            System.out.println("❌ 강화 실패! 무기가 손상되지 않았습니다.");
        }

    }
}
