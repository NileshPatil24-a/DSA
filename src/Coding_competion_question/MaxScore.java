package Coding_competion_question;

public class MaxScore {
    public static void main(String[] args) {
        int a [] = {100,95,102,120};
        String name [] = {"Peter","John","Alice","Joe"};
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
                index = i;
            }
        }
        System.out.println(name[index]);
    }
}
