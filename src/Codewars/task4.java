package Codewars;

import java.math.BigDecimal;

public class task4 {
    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double res = 0;
        double dwn=1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res += 1;
            } else {
                dwn+=3;
                res = res + 1 / (dwn);
            }
        }


        BigDecimal result = new BigDecimal(res);
        return String.valueOf(result.setScale(2,BigDecimal.ROUND_HALF_UP));
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }

}
