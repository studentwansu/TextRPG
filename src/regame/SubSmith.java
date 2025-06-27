package regame;

import java.util.Scanner;

public class SubSmith {

    private Player p1;

    Scanner sc = new Scanner(System.in);

    public SubSmith(Player p1) {
        this.p1 = p1;
    }

    public void enterSmith() {
        System.out.println("🔨🔨🔨🔨🔨🔨🔨🔨🔨🔨");
        System.out.println("🔨🔨대장간에 들어왔다🔨🔨");
        System.out.println("🔨🔨🔨🔨🔨🔨🔨🔨🔨🔨");
        boolean a = true;
        while(a) {
            System.out.println("1.🔨무기강화 100원 2. ❌대장간을 나간다.");
            String chpice = sc.nextLine();
            System.out.println("===================================================");
            if (chpice.equals("1")) {
                if (p1.getMoney() >= 100) {
                    p1.payMoney(100);
                    p1.getWp().upgrade();
                } else {
                    System.out.println("🧔거지가 강화를?? 당장 나가!!");
                }
            } else {
                System.out.println("❌대장간을 나간다.");
                a = false;
            }
        }
    }
}
