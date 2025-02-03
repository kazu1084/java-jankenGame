import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userHand;
        int computerHand;
        String name;
        System.out.println("あなたの名前を教えて下さい：");
        name = scan.next();
        if(name.isEmpty()) {
            name = "ゲスト";
        };
        
        System.out.println("こんにちは" + name + "さん");
        System.out.println("次のうちから一つ選択して数字を入力してください(１.グー、２.チョキ、３.パー)：");
          userHand = scan.nextInt();
          Random random = new Random();
        switch (userHand) {
            case 1:
                System.out.println(name + "さんが出したのはグーです。");
                break;
            case 2:
                System.out.println(name +"さんが出したのはチョキです。");
                break;
            case 3:
                System.out.println(name +"さんが出したのはパーです。");
                break;
            default:
                System.out.println("最初から入力してください。");
        };
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
        {System.out.println(name + "さんの勝ちです！！");
        }else{
            System.out.println(name + "さんの負けです…");
        }
    }
}