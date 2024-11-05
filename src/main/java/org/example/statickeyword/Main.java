package org.example.statickeyword;

public class Main {
    public static void main(String[] args) {
        Student st=new Student();
        st.age=34;
        st.name="Ramana";
        st.university="Andhra university";
        Student.university="Andhra university";
        System.out.println(Student.university);
        st.printAge();
        Student.print();
    }
}
