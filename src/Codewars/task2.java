package Codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static int sortDesc(final int num) {
        //Your code
        int len = String.valueOf(Math.abs(num)).length();
        int[] arrayInt =new int[len];
        int number = num;
        if(len==1) {
            arrayInt[0] =num;
        } else {
            for(int i=len-1; i >= 0; i--){
                arrayInt[i] = number % 10;
                number /= 10;
            }
        }
        Arrays.sort(arrayInt);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=arrayInt.length-1;i>=0;i--){
            stringBuilder.append(arrayInt[i]);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(15));
    }
}
