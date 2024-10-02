public class Main {
    public static void main(String[] args) {
        ContentPublisher publisher = new ContentPublisher();
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        publisher.addObserver(user1);
        publisher.addObserver(user2);

        publisher.uploadContent("New Video Available");
    }
}
