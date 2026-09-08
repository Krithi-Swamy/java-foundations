public class Build3_StudentGradeSystem {

    public static double averageMarks(int[] marks) {
        int sum = 0;
        for(int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        double avg = sum / marks.length;
        return avg;
    }

    public static String assignGrade(double mark) {
        if(mark >= 90) {
            return "A";
        } else if (mark >= 80) {
            return "B";
        } else if (mark >= 70) {
            return "C";
        } else if (mark >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void printStudent(String name, double mark, String grade) {
        System.out.print(name + "\t\t" + mark + "\t\t" + grade + "\n");
    }

    public static void printTopStudent(double mark1, double mark2, String name1, String name2) {
        double top = mark1;
        String top_name = name1;
        if(top < mark2) {
            top = mark2;
            top_name = name2;
        }
        System.out.println("Top student is " + top_name);
    }

    public static void printBottomStudent(double mark1, double mark2, String name1, String name2) {
        double bottom = mark1;
        String bottom_name = name1;
        if(bottom > mark2) {
            bottom = mark2;
            bottom_name = name2;
        }
        System.out.println("Bottom student is " + bottom_name);
    }

    public static void main(String[] args) {
        String student1_name = "Krithi";
        String student2_name = "Karthik";
        int[] student1_marks = {99, 96, 98};
        int[] student2_marks = {76, 66, 88};
        double student1_avg = averageMarks(student1_marks);
        double student2_avg = averageMarks(student2_marks);
        String student1_grade = assignGrade(student1_avg);
        String student2_grade = assignGrade(student2_avg);
        System.out.print("Name" + "\t\t" + "Mark" + "\t\t" + "Grade" + "\n");
        printStudent(student1_name, student1_avg, student1_grade);
        printStudent(student2_name, student2_avg, student2_grade);
        printTopStudent(student1_avg, student2_avg, student1_name, student2_name);
        printBottomStudent(student1_avg, student2_avg, student1_name, student2_name);
    }
}
