public class Animals {
    String Name;
    int Age;
    AnimalType Type;

    public Animals(String name, int age, AnimalType type) {
        Name = name;
        Age = age;
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public AnimalType getType() {
        return Type;
    }

    public void setType(AnimalType type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Type=" + Type +
                '}';
    }
}
