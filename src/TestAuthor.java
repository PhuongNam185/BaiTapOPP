public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        System.out.println(ahTeck);  // toString()
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println(ahTeck);  // toString()
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}

