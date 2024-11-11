package JAVAOOPS;

public class oops1 {
    public static class Student{
        String name;
        int rollno;
        double percent;
    }
    public static void main(String[]args){
        Student A = new Student();
        A.name = "adarsh";
        A.rollno = 11;
        A.percent = 99.999;
        System.out.println(A.name);
        System.out.println(A.rollno);
        System.out.println(A.percent);
        Student B = new Student();
        B.name="patel";
        B.rollno = 33;
        B.percent = 33;
        System.out.println(B.name);
        System.out.println(B.rollno);
        System.out.println(B.percent);

    }
    
}
