class PhonePeAccount {
    public static void main(String[] args) {
        createAccount("Inch Vani",9845193194L,577204);
    }

    static void createAccount(String name, long mobile, int pincode) {
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Pincode: " + pincode);
    }
}
