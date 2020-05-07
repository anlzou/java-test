import java.util.StringTokenizer;

public class P220_6 {
    void fun(String string){
        double sum = 0;
        double ave = 0;
        String number[];
        String regex = "[^0-9|.]+";
        string = string.replaceAll(regex,"#");
        StringTokenizer fenxi = new StringTokenizer(string,"#");

        int amount = fenxi.countTokens();

        while (fenxi.hasMoreElements()){
            String item = fenxi.nextToken();
            double price = Double.parseDouble(item);
            sum += price;
        }

        ave = sum/amount;
        System.out.println("sum = " + sum + "\nave = " + ave);
    }
}
