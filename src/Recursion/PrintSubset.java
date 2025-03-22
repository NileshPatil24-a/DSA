package Recursion;

import java.util.ArrayList;

public class PrintSubset {
    static ArrayList<String> arr = new ArrayList<>();
    public static void printsubset(int i, String str,String ans ){
        if(i==str.length()){
            arr.add(ans);
            return;
        }
        char ch =str.charAt(i);
        printsubset(i+1,str,ans);    //not take
        printsubset(i+1,str,ans+ch); //take

    }
    public static void main(String[] args) {
        arr = new ArrayList<>(); //reset arralist
        String str = "abc";
        printsubset(0,str,"");
        System.out.println(arr);
    }
}
