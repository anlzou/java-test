public class P220_5 {
    void fun(String string){
        String regex = "[^0-9]+";
        String number[];
        number = string.split(regex);

        System.out.println("字符串中的数字有：");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
