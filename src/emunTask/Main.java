//Enum түзүп 7 областты жазыңыз.
//        Областка жараша барынын
//        өзгөчөлүктөрүн консолго
//        чыгарыңыз.
package emunTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("7 облустан бироосун жазыныз: ");
        switch (scanner.nextLine()){
            case "Жалал абад"->
                System.out.println(KyrgyzstanOblastar.JALAL_ABAD.ozgocholyktory());
            case "Баткен"->{
                System.out.println(KyrgyzstanOblastar.BATKEN.ozgocholyktory());
            }
            case "Талас"->{
                System.out.println(KyrgyzstanOblastar.TALAS.ozgocholyktory());

            }
            case "Нарын"->{
                System.out.println(KyrgyzstanOblastar.NARYN.ozgocholyktory());

            }case "Чуй"->{
                System.out.println(KyrgyzstanOblastar.CHYI);

            }case "Ыссык Кол"->{
                System.out.println(KyrgyzstanOblastar.YSSYK_KOL);

            }case "Ош"->{
                System.out.println(KyrgyzstanOblastar.OSH.ozgocholyktory());

            }
        }

    }
}
