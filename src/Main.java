import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // for-each =   traversing technique to iterate through the elements in an array/collection
        //              less steps, more readable
        //              less flexible

        //String[] animals = {"cat","dog","cat","bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
//
//        for(String i: animals) {
//            System.out.println(i);
//        }

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
     }
}