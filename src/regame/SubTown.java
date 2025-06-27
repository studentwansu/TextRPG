package regame;

import java.util.Scanner;

public class SubTown {

    private Player p1;

    Scanner sc = new Scanner(System.in);

    public SubTown(Player p1) {
        this.p1 = p1;
    }

    public void enterTown() {
        System.out.println("🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞");
        System.out.println("🌞🌞마을에 입장했습니다. 🌞🌞");
        System.out.println("🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞🌞");
        System.out.println(p1.getInformation());
        System.out.println("1.💤쉬기 2.❌마을떠나기");
        String choice = sc.nextLine();

        if (choice.equals("1")) {
            System.out.println("💤플레이어가 휴식을 취햇습니다. 체력회복++");
            p1.restoreHealth();
        } else {
            System.out.println("❌마을을 떠난다.");
        }
    }
}
