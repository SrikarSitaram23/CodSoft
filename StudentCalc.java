import java.util.*;
public class StudentCalc
{
    public static void main(String arhs[])
    {
        int total_marks=0;
        int i,n;
        int subject_marks[]= new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        n = sc.nextInt();
        for(i=0 ; i<n ; i++)
        {
            System.out.println("Enter subject-"+(i+1)+" "+"marks");
            subject_marks[i]= sc.nextInt();
            total_marks+=subject_marks[i];
        }
        double percentage = (double) total_marks / (n * 100) * 100;
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total marks : "+ total_marks);
        System.out.println("Average percentage : " +percentage);
        System.out.println("Grade achieved : " +grade);
    }
}
