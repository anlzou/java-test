import java.util.Scanner;

public class P174_4 {
    void fun(){
        Scanner scanner = new Scanner(System.in);
        double number[] = new double[20];
        int i = 0;
        double sum = 0;
        System.out.println("输入若个个数字成绩：" );

        while (i < 20){
            number[i] = scanner.nextDouble();
            assert number[i]>=0 && number[i]<=100:"非法！数字大于100或小于0。";
        }
//        finally {
//            for (int i1 = 0; i1 < number.length; i1+=2) {
//                sum += number[i1];
//            }
//            System.out.println("和为：" +sum +"平均分为：" +sum/i);
//        }

    }
}
