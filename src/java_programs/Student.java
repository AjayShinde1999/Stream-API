package java_programs;

public class Student implements Cloneable {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Ajay",25);
        System.out.println(s1.name+" : "+s1.age);

        Student cloned = (Student)s1.clone();
        System.out.println(cloned.name+" : "+cloned.age);

    }
}
