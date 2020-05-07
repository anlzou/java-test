public class P220_4 {
    void fun(){
        double a[] = new double[20];
        //a = Math.abs(-12/3);

        a[0] = Math.ulp (1);
        a[1] = Math.ulp(2);
        a[2] = Math.atan(Math.PI/2);
        a[3] = Math.hypot(2,0);
        //System.out.println("a[0] = " + a[0] + "    a[1] = " + a[1]);
        //System.out.println("a[2] = " + a[2]);
        //System.out.println("a[3] = " + a[3]);
    }
}
