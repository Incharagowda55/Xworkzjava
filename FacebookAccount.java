class FacebookAccount {
    public static void main(String[] args) {
        createAccount("Inch","Vani","15/06/2004","Female",9845193194L,"Inch@123");
    }

    static void createAccount(String firstName, String lastName,String dob, String gender, long mobile, String password) {

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("DOB: " + dob);
        System.out.println("Gender: " + gender);
        System.out.println("Mobile: " + mobile);
        System.out.println("Password: " + password);
    }
}
