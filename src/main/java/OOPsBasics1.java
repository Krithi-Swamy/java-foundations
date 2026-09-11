public class OOPsBasics1 {
    static class Student {
        String name;
        int[] scores;

        public Student (String name, int[] scores) {
            if(scores.length == 0) {
                throw new IllegalArgumentException("Scores can't be empty");
            }
            this.name = name;
            this.scores = scores;
        }
    }

    static class PrintStudent {
        public void printStudentMethod(Student s) {
            System.out.println(s.name);
            for(int score: s.scores) {
                System.out.print(score + "\t");
            }
            System.out.println();
        }
    }

    static class Task {
        String name;
        String priority;
        boolean isDone;

        public Task(String name) {
           this(name, "Medium");
        }

        public Task(String name, String priority) {
            this.name = name;
            this.priority = priority;
            this.isDone = false;
        }
    }

    static class PrintTask {
        public void printTaskMethod(Task t) {
            System.out.print(t.name + "\t-\t" + t.priority + "\t-\t" + t.isDone);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] scores1 = {98, 99, 96, 95};
        int[] scores2 = {78, 88, 94, 74};
        Student s1 = new Student("Krithi", scores1);
        Student s2 = new Student("Karthik", scores2);
        PrintStudent p1 = new PrintStudent();
        p1.printStudentMethod(s1);
        p1.printStudentMethod(s2);

        Task t1 = new Task("Work for 2.5 hours");
        Task t2 = new Task("Sleep for 5.5 hours", "High");
        PrintTask p2 = new PrintTask();
        p2.printTaskMethod(t1);
        p2.printTaskMethod(t2);

    }
}
