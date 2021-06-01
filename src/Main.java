public class Main {
    public static void main(String[] args) {
        User user1 = new DebtNumbers(new UserImpl());

        User user2 = new DebtNumbers(
                new DebtNumbers(new DebtNumbers(new UserImpl())));
        System.out.println("User 1: " + user1.decorate() + " User 2: " + user2.decorate());
    }
}
