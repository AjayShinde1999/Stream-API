package java_programs;

public final class Immutable {
    private final String name;
    private final int age;

    private Immutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Immutable obj1 = new Immutable("Ajay", 25);
        Immutable obj2 = new Immutable("Rohan", 26);

        System.out.println(obj1.getName()+" : "+obj1.getAge());
        System.out.println(obj2.getName()+" : "+obj2.getAge());
    }
}
