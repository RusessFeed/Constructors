public class Constructors {
    public static void main(String[] args) {
        Human human = new Human("pepe", 18);
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        System.out.println("Привет из первого конструктора!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}