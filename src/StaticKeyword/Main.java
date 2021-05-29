package StaticKeyword;

public class Main {
    public static void main(String[] args) {
        /**
         * static = modifier. A single copy of a variable/method is created and shared.
         *          The class "owns" the static member.
         */
        Friend friend1 = new Friend("Rovan");
        Friend friend2 = new Friend("Yovi");
        Friend friend3 = new Friend("Ilham");
        Friend friend4 = new Friend("Wishnu");

        Friend.displayFriends();
    }
}
