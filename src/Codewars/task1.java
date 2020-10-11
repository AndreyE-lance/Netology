package Codewars;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class task1 {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        StringBuilder stringBuilder = new StringBuilder();
        switch (names.length) {
            case 0:
                stringBuilder.append("no one likes this");
                break;
            case 1:
                stringBuilder.append(names[0]).append(" likes this");
                break;
            case 2:
                stringBuilder.append(names[0]).append(" and ").append(names[1]).append(" like this");
                break;
            case 3:
                stringBuilder.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2]).append(" like this");
                break;
            default:
                stringBuilder.append(names[0]).append(", ").append(names[1]).append(" and ").append(names.length - 2).append(" others like this");
                break;
        }

        return stringBuilder.toString();
    }

    @Test
    public static void main(String[] args) {
        System.out.println(task1.whoLikesIt());
        System.out.println(task1.whoLikesIt("Peter"));
        System.out.println(task1.whoLikesIt("Jacob", "Alex"));
        System.out.println(task1.whoLikesIt("Max", "John", "Mark"));
        System.out.println(task1.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
