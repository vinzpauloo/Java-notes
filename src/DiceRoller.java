import java.util.Random;

public class DiceRoller {

    // First way to write:
    // Pass as arguments

//    DiceRoller(){
//        Random random = new Random();
//        int number = 0;
//        roll(random, number);
//    }
//
//    void roll(Random random, int number){
//         number = random.nextInt(6)+1;
//        System.out.println(number);
//    }

    // 2nd way to write:
    // Global way

    Random random;
    int number;

    DiceRoller(){
        random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
