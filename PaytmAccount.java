class PaytmAccount {
    public static void main(String[] args) {
        createAccount(9845193194L,"Inch@123");
    }

    static void createAccount(long mobile, String password) {
        System.out.println("Mobile: " + mobile);
        System.out.println("Password: " + password);
    }
}
