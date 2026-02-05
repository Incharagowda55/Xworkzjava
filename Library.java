class Library {
    public static void main(String[] args) {

        String LibraryName = "City Library";
        String Location = "Vinoba Nagar";

        String Librarians[] = {"Ravi", "Suma", "Kiran"};
        String Books[] = {"Java", "Python", "C Programming", "Data Structures"};

        System.out.println("The library name is " + LibraryName);
        System.out.println("The location is " + Location);

        System.out.println("The librarians are");
        for(String person : Librarians){
            System.out.println(person);
        }

        System.out.println("Number of books are " + Books.length);
        System.out.println("The books are");
        for(String book : Books){
            System.out.println(book);
        }
    }
}
