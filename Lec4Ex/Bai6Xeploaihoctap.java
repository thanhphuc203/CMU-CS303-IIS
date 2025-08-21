
package Lec4Ex;
    import java.util.Scanner;
public class Bai6Xeploaihoctap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your average score (0 - 10): ");
        double score = scanner.nextDouble();
        String grade;
        if (score >= 9.0 && score <= 10) {
            grade = "Excellent";
        } else if (score >= 8.0 && score <= 8.9) {
            grade = "Good";
        } else if (score >= 6.5 && score <= 7.9) {
            grade = "Fair";
        } else if (score >= 5.0 && score <= 6.4) {
            grade = "Average";
        } else if (score >= 0 && score < 5.0) {
            grade = "Fail";
        } else {
            grade = "Invalid score (must be between 0 and 10)";
        }
        System.out.println(grade);

    }
}

