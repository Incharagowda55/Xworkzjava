class Hospital {
    public static void main(String[] args) {

        String HospitalName = "Life Care";
        String Area = "Rajajinagar";

        String Doctors[] = {"Anil", "Meena", "Suresh"};
        String Departments[] = {"Cardiology", "ENT", "Orthopedic"};

        System.out.println("Hospital name is " + HospitalName);
        System.out.println("Area is " + Area);

        System.out.println("Doctors are");
        for(String doc : Doctors){
            System.out.println(doc);
        }

        System.out.println("Departments count " + Departments.length);
        System.out.println("Departments are");
        for(String dept : Departments){
            System.out.println(dept);
        }
    }
}
