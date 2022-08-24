package Recursia;

public class Fibonacсi {
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fibEffective(10));
        System.out.println(fib2(10));
    }
    public static int fib(int n) {
        if (n == 1 || n == 0) return n;
        return fib(n - 1) + fib(n - 2);
    }
    private static long fibEffective(int n){
        long [] arr=new long[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <=n ; i++)
            arr[i]=arr[i-1]+arr[i-2];
        return arr[n];
    }
    public static long fib2(int n) {
        long[] arr = new long[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];
        return  arr[n];

    }
}
