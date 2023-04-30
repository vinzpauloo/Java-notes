import java.util.ArrayList;

public class ForEachLoop {
    public static void ForEachLoop(String[] args) {

        // for-each =   traversing technique to iterate through the elements in an array/collection
        //              less steps, more readable
        //              less flexible

        //String[] animals = {"cat","dog","cat","bird"};

        // Collection
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i: animals) {
            System.out.println("test"+ i);
        }

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }
}