class BusStand {
    public static void main(String[] args) {

        String StandName = "City Bus Stand";
        String Area = "Shimoga";

        String Drivers[] = {"Raju", "Kiran", "Prakash"};
        String Routes[] = {"Bangalore", "Mysore", "Udupi"};

        System.out.println("Bus stand name is " + StandName);
        System.out.println("Area is " + Area);

        System.out.println("Drivers are");
        for(String d : Drivers){
            System.out.println(d);
        }

        System.out.println("Routes count " + Routes.length);
        System.out.println("Routes are");
        for(String r : Routes){
            System.out.println(r);
        }
    }
}
