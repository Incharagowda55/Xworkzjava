class SwiggyAccount {
    public static void main(String[] args) {
        createAccount("Inch Vani",9845193194L,"Bangalore");
    }

    static void createAccount(String name, long mobile, String city) {
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("City: " + city);
    }
}
