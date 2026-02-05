class SuperMarket {
    public static void main(String[] args) {

        String MarketName = "Fresh Mart";
        String Location = "Vinoba Nagar";

        String Workers[] = {"Ajay", "Kavya", "Manoj"};
        String Items[] = {"Rice", "Oil", "Milk", "Sugar"};

        System.out.println("The market name is " + MarketName);
        System.out.println("The location is " + Location);

        System.out.println("Workers are");
        for(String w : Workers){
            System.out.println(w);
        }

        System.out.println("Number of items " + Items.length);
        System.out.println("Items are");
        for(String i : Items){
            System.out.println(i);
        }
    }
}
