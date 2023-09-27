import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> AnimalList = new ArrayList<>();
Animals animals1 = new Animals("Kňááááá", 90);
Animals animals2 = new Animals("Buuuuuu", 60);
Animals animals3 = new Animals("Krááááá", 30);


AnimalList.add(AnimalType.Cat + " - " + animals1.toString());
AnimalList.add(AnimalType.Cow + " - " + animals2.toString());
AnimalList.add(AnimalType.Crow + " - " + animals3.toString());

        System.out.println(AnimalList);


    }
}