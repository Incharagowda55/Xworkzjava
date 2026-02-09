class LinkedInAccount {
    public static void main(String[] args) {
        createAccount("Inch","Vani","vanivani@gmail.com","Student","Inch@123");
    }

    static void createAccount(String firstName, String lastName,
                              String email, String profession, String password) {

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Profession: " + profession);
        System.out.println("Password: " + password);
    }
}
