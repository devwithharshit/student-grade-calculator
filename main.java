import java.util.*;

class grade_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");

        System.out.print("Java: ");
        int java = sc.nextInt();

        System.out.print("Maths: ");
        int maths = sc.nextInt();

        System.out.print("English: ");
        int english = sc.nextInt();

        int total = java + maths + english;
        double percentage = total / 3.0;

        System.out.println("\nTotal = " + total);
        System.out.println("Percentage = " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade = A");
        }
        else if (percentage >= 75) {
            System.out.println("Grade = B");
        }
        else if (percentage >= 60) {
            System.out.println("Grade = C");
        }
        else if (percentage >= 40) {
            System.out.println("Grade = D");
        }
        else {
            System.out.println("Grade = F");
        }
    }
}