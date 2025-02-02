import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int userHand;
        int computerHand;
        System.out.println("次のうちから一つ選択して数字を入力してください(１.グー、２.チョキ、３.パー)：");
        Scanner scan = new Scanner(System.in);
          userHand = scan.nextInt();
          Random random = new Random();
        switch (userHand) {
            case 1:
                System.out.println("あなたが出したのはグーです。");
                break;
            case 2:
                System.out.println("あなたが出したのはチョキです。");
                break;
            case 3:
                System.out.println("あなたが出したのはパーです。");
                break;
            default:
                System.out.println("最初から入力してください。");
        };
        System.out.println("結果が分かりました！！");
        System.out.println("じゃんけんの結果を見るにはEnterキーを押してください。");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
        computerHand = random.nextInt(3) +1;
        switch (computerHand) {
            case 1:
                System.out.println("コンピューターが出したのはグーです。");
                break;
            case 2:
                System.out.println("コンピューターが出したのはチョキです。");
                break;
            case 3:
                System.out.println("コンピューターが出したのはパーです。");
                break;
        };
        
        if (userHand == computerHand){
          System.out.println("引き分け！！");
        }else if
         ((userHand == 1 && computerHand == 2) ||
            (userHand == 2 && computerHand == 3) ||
            (userHand == 3 && computerHand == 1) )
        {System.out.println("あなたの勝ちです！！");
        }else{
            System.out.println("あなたの負けです…");
        }
    }
}