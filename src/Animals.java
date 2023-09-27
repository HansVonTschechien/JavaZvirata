public class Animals {
    String Name;
    int age;

    public Animals(String name, int age) {
        Name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
