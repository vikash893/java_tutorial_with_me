import java.util.ArrayList;

public class Student {
    String Name;
    Integer RollNumber;

    Student(String Name, Integer RollNumber) {
        this.Name = Name;
        this.RollNumber = RollNumber;
    }

    @Override
    public String toString(){
        return "{name : " + Name + " , ROLLNumber : " + RollNumber + "} ";
    }

    public static void main(String[] args) {
        ArrayList<Student> s_al = new ArrayList<>();
        Student s1 = new Student("vikash", 42);
        Student s2 = new Student("vikash", 43);
        Student s3 = new Student("vikash", 44);
        s_al.add(s1);
        s_al.add(s2);
        s_al.add(s3);
        System.out.println(s_al);
    }
}
