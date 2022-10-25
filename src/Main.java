import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 프로그램 시작 ==");
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("명령어) ");
            String cmd = sc.nextLine();

            if(cmd.equals("ruls")){
                System.out.println("규칙\n1. 소란스럽지 않게 하기\n2. 퇴실시 뒷정리 깔끔히하기\n3. 입, 퇴실 등록 잘하기");
            }else if(cmd.equals("price"))
                System.out.println("Price\n1. 24시간 = 33,000\n2. 55시간 = 70,000\n3. 100시간 = 120,000\n4. 200시간 = 220,000\n");
            if(cmd.equals("exit")){
                break;
            }
        }
        System.out.println("== 프로그램 종료 ==");
    }
}
