import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String A, B, C, D, F;
        String yes;
        int grade;
        grade =0;

        Scanner keyboard = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Student Grade");
            grade = keyboard.nextInt();

            if (grade >= 97 && grade <= 100) {
                System.out.println("Good job. Your grade is A+.");
            } else if (grade >= 94 && grade <= 96) {
                System.out.println("Good job. Your grade is A.");
            } else if (grade >= 90 && grade <= 93) {
                System.out.println("Good job. Your grade is A-.");
            } else if (grade >= 87 && grade <= 89) {
                System.out.println("Good job. Your grade is B+.");
            } else if (grade >= 84 && grade <= 86) {
                System.out.println("Good job. Your grade is B.");
            } else if (grade >= 80 && grade <= 83) {
                System.out.println("Good job. Your grade is B-.");
            } else if (grade >= 77 && grade <= 79) {
                System.out.println("Good job. Your grade is C+.");
            } else if (grade >= 74 && grade <= 76) {
                System.out.println("Good job. Your grade is C.");
            } else if (grade >= 70 && grade <= 73) {
                System.out.println("Good job. Your grade is C-.");
            } else if (grade >= 60 && grade <= 69) {
                System.out.println("Please do well the next time . Your grade is D.");
            } else // if(grade <60)
            {
                System.out.println("Go back to school. Your grade is below 60.");
            }

            System.out.println("Do you want to enter another score (Y/N)?");
            yes = keyboard.next();
            if (yes.equalsIgnoreCase("n")){
                break;
            }


        }
















    }
}
