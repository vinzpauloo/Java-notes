public class StaticKeyword {
    public static void statickeyword(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member

        Friend friend = new Friend("Evita");
        Friend friend2 = new Friend("Vincent");
        Friend friend3 = new Friend("Margaux");
        Friend friend4 = new Friend("Chanel");

//        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }
}