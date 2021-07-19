package Gradecalculation;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter average of your marks (less than 100)::");
        int average = sc.nextInt();
        char grade;

        if(average>=90){
            grade = 'A';
        }else if(average>=70 && average<90){
            grade = 'B';
        }
        else if(average>=40 && average<70){
            grade = 'C';
        }
        else if(average>=35 && average<=40) {
            grade = 'D';
        }
        else if (average>=1 && average<35) {
            grade = 'F';
        }
        else {
            grade = 'G';
        }

        switch(grade) {
            case 'A' :
                System.out.println("out standing");
                break;
            case 'B' :
                System.out.println("Excellent!");
                break;
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
                break;
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("invalid values");

        }
        System.out.println("Your grade is " + grade);
    }

}
