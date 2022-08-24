package Recursia;

public class Task1 {
    static int count=0;
    public static void main(String[] args) {
        String s="ABC";
        int n=4;
        rec(s,n,"");
    }
    public static void rec(String s,int n,String curr){
        if (curr.length()==n){
            count++;
            System.out.println(count+" "+ curr);
            return;
        }


        for (int i=0;i<s.length();i++){
            rec(s,n,curr+s.charAt(i));
        }

    }
}
