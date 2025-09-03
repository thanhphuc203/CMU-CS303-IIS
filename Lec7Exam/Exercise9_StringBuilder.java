
package Lec7Exam;
    import java.util.Scanner;

public class Exercise9_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine().trim();
        StringBuilder sb = new StringBuilder(number);
        int count = 0;
        for (int i = sb.length() - 1; i > 0; i--) {
            count++;
            if (count % 3 == 0) {
                sb.insert(i, ",");
            }
        }
        System.out.println(sb.toString());
    }
}

