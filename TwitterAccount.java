class TwitterAccount {
    public static void main(String[] args) {
        createAccount("InchVani","vanivani@gmail.com","Inch@123");
    }

    static void createAccount(String username, String email, String password) {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
