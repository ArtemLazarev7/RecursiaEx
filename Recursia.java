package Recursia;

public class Recursia {
    public static void main(String[] args) {
       // counter(3);
       // System.out.println(factorial(4));
        System.out.println(fact(3));

    }
    private static void counter(int n){
        int res1=1;
        if (n==0)
            return;

        System.out.println(n);
        counter((n-1));
        res1*=n;
        System.out.println(res1);
    }
    public static int factorial(int x){
        int res=1;
        for (int i = x; i>0 ; i--) {
            res*=i;

        }
        return res;
    }
    public static int fact(int n){
        if (n==1)
            return 1;
        return  n*fact(n-1);
    }
}
