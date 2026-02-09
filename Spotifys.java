class SpotifyAccount {
    public static void main(String[] args) {
        createAccount("Inch Vani","vanivani@gmail.com","Female","Inch@123");
    }

    static void createAccount(String name, String email,String gender, String password) {

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Password: " + password);
    }
}
