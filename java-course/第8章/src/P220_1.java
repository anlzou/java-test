import java.util.Scanner;

public class P220_1 {
    Scanner scanner = new Scanner(System.in);

    void funToUpperCase(){
        System.out.println("输入字符串1：");
        String string = scanner.nextLine();
        string = string.toUpperCase();   //小写变成大写
        System.out.println(string);
    }

    void funToLowerCase(){
        System.out.println("输入字符串2：");
        String string = scanner.nextLine();
        string = string.toLowerCase();
        System.out.println(string);
    }
}
