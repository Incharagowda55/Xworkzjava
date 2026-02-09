class AmazonAccount {
    public static void main(String[] args) {
        createAccount("Inch Vani",9845193194L,"Inch@123");
    }

    static void createAccount(String name, long mobile, String password) {
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Password: " + password);
    }
}
