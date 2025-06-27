package regame;

import java.util.Scanner;

public class Subshop {

    private Player p1;

    Scanner sc = new Scanner(System.in);

    public Subshop(Player p1) {
        this.p1 = p1;
    }

    public void enterShop() {
        System.out.println("🎁🎁🎁🎁🎁🎁🎁🎁🎁🎁🎁🎁");
        System.out.println("🎁🎁상점에 들어왔습니다.🎁🎁");
        System.out.println("🎁🎁🎁🎁🎁🎁🎁🎁🎁🎁🎁🎁");
        System.out.println("1.🩸포션구매 200원 2.❌상점 나가기 ");
        String choice = sc.nextLine();

        if (choice.equals("1")) {
            if (p1.getMoney() >= 200) {
                p1.payMoney(200);
                System.out.println("🩸포션을 구매했습니다!");
                p1.potion();
            }else {
                System.out.println("🧔너 거지야??");
            }
        } else {
            System.out.println("❌상점을 나갑니다.");
        }
    }
}
