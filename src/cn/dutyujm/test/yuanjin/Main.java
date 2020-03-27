package cn.dutyujm.test.yuanjin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            students.add(new Student(sc.nextInt(),sc.nextInt()));
        }

        Collections.sort(students,(o1,o2)->{
            if (o1.grade>o2.grade){
                return 1;
            }else if (o1.grade==o2.grade&&o1.num>=o2.num){
                return 1;
            }else {
                return -1;
            }

        });
        for (int i = 0; i <n ; i++) {
            System.out.println(students.get(i).getNum()+" "+students.get(i).grade);
        }
    }

    public static  class Student{
        int num;
        int grade;

        @Override
        public String toString() {
            return "Student{" +
                    "grade=" + grade +
                    ", num=" + num +
                    '}';
        }

        public Student(int num, int grade) {
            this.grade = grade;
            this.num = num;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
