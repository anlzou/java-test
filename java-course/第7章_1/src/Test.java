import java.util.*;

public class Test {
    void fun(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        int i = 1;
        double x;
        while(i <= 100){
            try {
                x = scanner.nextDouble();
                if (x<0 || x>100) throw new Exception();
            }catch (Exception e){
                System.out.printf("成绩应该在范围（0 <= x <= 100）中。");
                return;
            }

            m += 1;
            sum = sum + x;
            i++;
        }
        System.out.printf("%d个数的和为%f\n",m,sum);
        System.out.printf("%d个数的平均值是%f\n",m,sum/m);
    }

}
