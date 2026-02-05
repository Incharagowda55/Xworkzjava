class Temple {
    public static void main(String[] args) {

        String TempleName = "Ganesh Temple";
        String Place = "Shimoga";

        String Poojari[] = {"Ramesh", "Mahesh"};
        String Timings[] = {"Morning", "Evening"};

        System.out.println("Temple name is " + TempleName);
        System.out.println("Place is " + Place);

        System.out.println("Poojari names");
        for(String p : Poojari){
            System.out.println(p);
        }

        System.out.println("Timings count " + Timings.length);
        System.out.println("Timings are");
        for(String t : Timings){
            System.out.println(t);
        }
    }
}
