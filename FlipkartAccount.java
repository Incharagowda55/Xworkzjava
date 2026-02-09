class FlipkartAccount {
    public static void main(String[] args) {
        createAccount("vanivani@gmail.com",9845193194L,"Inch@123");
    }

    static void createAccount(String email, long mobile, String password) {
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Password: " + password);
    }
}
