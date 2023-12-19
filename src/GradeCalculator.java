import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter Number Of Subjects: ");
        int noOfSubjects = sc.nextInt();

        int[] marks = new int[noOfSubjects];
        int totalMarks = 0;
        for (int i = 0; i < noOfSubjects ; i++) {
            System.out.print("Enter marks obtained in subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        double avgPercentObtained = ((double) totalMarks / noOfSubjects);

        String gradeObtained;
        if (avgPercentObtained == 100) {
            gradeObtained = "O";
        } else if (avgPercentObtained >= 90) {
            gradeObtained = "A+";
        } else if (avgPercentObtained >= 80) {
            gradeObtained = "A";
        } else if (avgPercentObtained >= 70) {
            gradeObtained = "B+";
        } else if (avgPercentObtained >= 60){
            gradeObtained = "B";
        } else if (avgPercentObtained >= 50) {
            gradeObtained = "C";
        } else if (avgPercentObtained >= 40) {
            gradeObtained = "D";
        } else {
            gradeObtained = "F";
        }

        System.out.println("Obtained Marks: " + totalMarks + "/" + noOfSubjects * 100);
        System.out.printf("Average Percentage: %.2f%%\n", avgPercentObtained);
        System.out.println("Grade: " + gradeObtained);

    }
}