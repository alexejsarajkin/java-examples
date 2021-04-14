package com.ocp.host.igor.stage3;

public class Problem96 {
    public static void main(String[] args) {
        ExamTaker et1 = new ExamTaker("Alice", "Adams");
        ExamTaker et2 = new ExamTaker("Bob", "Barry");
        ExamTaker et3 = new ExamTaker("Chuck", "Collins");
        ExamTaker et4 = new ExamTaker("Doug", "Dowson");
        et4 = null;
        et3 = et2;
        System.out.println(ExamTaker.getCount());
    }

    static class ExamTaker {

        private String fName;
        private String lName;
        private static int count;

        public ExamTaker(String first, String last) {
            fName = first;
            lName = last;
            ++count;
        }

        static {
            count = 0;
        }

        public static int getCount() {
            return count;
        }
    }
}

