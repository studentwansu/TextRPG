package regame;

import java.util.Scanner;

public class SubDungeon {

    private Player p1;
    private Monster m1;

    Scanner sc = new Scanner(System.in);

    public SubDungeon(Player p1) {
        this.p1 = p1;
    }

    public SubDungeon(Player p1, Monster m1) {
        this.p1 = p1;
        this.m1 = m1;
    }

    public void enterDungeon() {
        System.out.println("🛕던전에 입장했습니다. 🙎‍강사님이 출현했습니다!");
        System.out.println("1.🏹전투시작 2.🏴도망가기");
        String choice = sc.nextLine();

        if (choice.equals("1")) {
            startBattle();
        } else {
            System.out.println("🏴도망갑니다~");
        }
    }

    public void startBattle() {
        while (p1.isAlive() && m1.isAlive()) {
            System.out.println("현재상태 : " + p1.getName() + "HP : " + p1.getHp() + " | " + m1.getName() + "HP : " + m1.getHp());

            System.out.println("1.🏹싸운다. 2.🏴도망간다.");
            String choice = sc.nextLine();
            System.out.println("===================================================");
            if (choice.equals("1")) {
                p1.attack(m1);
                if (!m1.isAlive()) {
                    int reward = m1.getRandomGold();
                    System.out.println("🙎‍♀️‍강사님을 처치했습니다!" + reward +"골드 획득!");
                    p1.addMoney(reward);

                    System.out.println("❗❗새로운 몬스터가 등장합니다❗❗");
                    m1 = new Monster("🧟강력한 강사님", 200, 50, 500, 1000);
                    continue;
                }
                m1.attack(p1);
            } else {
                System.out.println("너무 강력하다!");
                return;
            }

            if (!p1.isAlive()) {
                System.out.println("💀학생이 쓰러졌습니다. 게임 오버💀");
                System.out.println("🙎‍♀️강사님 : 노력해라. ");
                System.exit(0);
            }
        }
    }
}
