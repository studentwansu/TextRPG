package regame;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("💀🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥💀");
        System.out.println("🔥🔥지옥에 온걸 환영한다.🔥🔥");
        System.out.println("💀🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥💀");
        Scanner sc = new Scanner(System.in);
        System.out.println("🎇무기를 고르시오 1.🔪검 2.🦯지팡이");
        String a = sc.nextLine();

        Weapon w1;
        if (a.equals("1")) {
             w1 = new Sword();
            System.out.println("🔪검을 선택하셨습니다.");
        } else {
             w1 = new Staff();
            System.out.println("🦯지팡이를 선택하셨습니다.");
        }

        Player p1 = new Player("🤵학생", 1000000, 30, 3000, w1);
        Monster m1 = new Monster("🙎‍♀️️강사님", 80, 10, 30, 70);

        SubTown t1 = new SubTown(p1);
        Subshop sh1 = new Subshop(p1);
        SubSmith sm1 = new SubSmith(p1);
        SubDungeon d1 = new SubDungeon(p1, m1);

        while (true) {
            System.out.println("=================== 플레이어 =======================");
            System.out.println(p1.getInformation());
            System.out.println("===================================================");
            System.out.println("어디로 가시겠습니까?");
            System.out.println("1.🏤마을 2.🛕던전 3.🏥상점 4.🏬대장간 5.❌게임 종료");
            String choice = sc.nextLine();

            switch (choice) {
                case "1" :
                    t1.enterTown();
                    break;
                case "2" :
                    d1.enterDungeon();
                    break;
                case "3" :
                    sh1.enterShop();
                    break;
                case "4" :
                    sm1.enterSmith();
                    break;
                case "5" :
                    System.out.println("❌게임을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("❗❗❗잘못된 입력입니다. 다시 선택하세요.❗❗❗");
            }
        }
    }
}
