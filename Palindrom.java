package Recursia;

public class Palindrom {
    public static void main(String[] args) {
        String s = "avAva";
        System.out.println(s.replaceAll("\\W", ""));


        System.out.println(isPalindrom(s) ? "YES" : "NO");
        System.out.println(isPalindrom1(s) ? "YES" : "NO");
        System.out.println(isPalindrom2(s) ? "YES" : "NO");
        System.out.println(isPalindrom3(s) ? "YES" : "NO");
    }

    public static boolean isPalindrom(String s) {
        if (s.length() == 1 || s.length() == 0)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrom(s.substring(1, s.length() - 1));

        return false;
    }
    public static boolean isPalindrom1(String s) {
       int forward=0;
       int backward=s.length()-1;

       while (backward>forward){
           char forwardChar=s.charAt(forward++);
           char backwardChars=s.charAt(backward--);
           if (forwardChar!=backwardChars)
               return false;
       }
       return true;
    }

    public static boolean isPalindrom2(String s) {
        return s.equals(new StringBuilder(s)
                .reverse().toString());

    }
    public static boolean isPalindrom3(String s){
        for (int i = 0; i < s.length()-1-i; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;

        }
        return true;
    }


}
