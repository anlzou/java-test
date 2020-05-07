import java.util.Scanner;

public class P220_2 {
    Scanner scanner = new Scanner(System.in);
    void fun(){
        char c[] = new char[2];
        System.out.println("输入字符串：");
        String string = scanner.nextLine();
        c[0] = string.charAt(0);    //0到length-1
        c[1] = string.charAt(string.length()-1);

        System.out.println("首字符：" +c[0] +"尾字符：" +c[1]);
    }
}
