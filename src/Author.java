public class Author {
    // private instance variables
    private String name;
    private String email;
    private char gender;   // 'm', 'f', or 'u' for unknown

    // Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // public getters and setters for private variables
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }

    // toString method
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}

