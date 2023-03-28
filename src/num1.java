//Напишите метод, который принимает на вход строку (String)
//         и определяет является ли строка палиндромом (возвращает boolean значение).

import java.util.Scanner;
public class num1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter to string");
        String string = in.next();
        System.out.println(isPalindrome(string) + " String is palindrome");
        in.close();
    }
    public static boolean isPalindrome(String string){
        return string.equals((new StringBuilder(string)).reverse().toString());
    }

}
