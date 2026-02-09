class GoogleDriveAccount {
    public static void main(String[] args) {
        createAccount("vanivani@gmail.com","Inch@123","15GB");
    }

    static void createAccount(String email, String password, String storage) {
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Storage: " + storage);
    }
}
