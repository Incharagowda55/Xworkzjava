class IRCTCAccount {
    public static void main(String[] args) {
        createAccount("InchVani","Inch Vani","vanivani@gmail.com",
                      9845193194L,"Female","15/06/2004","Inch@123","Inch@123");
    }

    static void createAccount(String username, String fullName, String email,long mobile, String gender, String dob,String password, String confirmPassword) {

        System.out.println("Username: " + username);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}
