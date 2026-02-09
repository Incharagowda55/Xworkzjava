class NetflixAccount {
    public static void main(String[] args) {
        createAccount("vanivani@gmail.com","Inch@123","Premium");
    }

    static void createAccount(String email, String password, String plan) {
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Plan: " + plan);
    }
}
