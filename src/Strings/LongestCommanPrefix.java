package Strings;

import java.util.Scanner;

public class LongestCommanPrefix {
    public static String Comman(String s1, String s2){
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1==ch2){
                sb.append(ch1);
            }
            else break;
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] str = {"carjf","carkjjefn"};
        String s = str[0];
        for(int i=1; i< str.length; i++){
            s = Comman(s,str[i]);
        }
        System.out.println(s);

    }
}
