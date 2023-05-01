public class Polymorphism {
    public static void polymorphism(String[] args) {

        // polymorphism =   greek word for poly-"many", morph-"form"
        //                  The ability of an object to identify as more than one type

        ChestWorkout chest = new ChestWorkout();
        ArmWorkout arm = new ArmWorkout();
        ShoulderWorkout shoulder = new ShoulderWorkout();

        Exercise[] clients = {chest, arm, shoulder};

//        chest.go();
//        arm.go();
//        shoulder.go();

        for(Exercise x: clients){
            x.go();
        }
    }
}