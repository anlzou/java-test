import java.util.Calendar;
import java.util.Scanner;

public class P220_3 {
    long days;
    long time1,time2;
    int a[] = new int[12];
    Scanner scanner = new Scanner(System.in);
    Calendar calendar1 = Calendar.getInstance();
    Calendar calendar2 = Calendar.getInstance();

    void fun(){
        System.out.println("输入日期：");

        for (int i = 0; i < 12; i++) {  //部分要吞掉空格和回车
            a[i] = scanner.nextInt();
            i += 1;
        }

        calendar1.set(a[0],a[2],a[4]);
        calendar2.set(a[6],a[8],a[10]);

        time1 = calendar1.getTimeInMillis();    //转换成秒
        time2 = calendar2.getTimeInMillis();
        days = (time1-time2)/(1000*60*60*24);

        System.out.println("相差天数为： = " + days);
    }
}
