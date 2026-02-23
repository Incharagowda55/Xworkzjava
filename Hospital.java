class Hospital {

    static String hospitalName = "Fortis";

    public static String[] getDoctorsBySpecialization(String specialization) {

        if ("General Medicine".equals(specialization)) {
            return new String[]{"Dr.Inchara","Dr.Likhitha","Dr.Ramesh"};
        }

        else if ("Orthopaedics".equals(specialization)) {
            return new String[]{"Dr.Prashanth","Dr.Amrutha","Dr.Rajeev"};
        }

        else if ("Cardiac Sciences".equals(specialization)) {
            return new String[]{"Dr.Ajay","Dr.Kiran","Dr.Varun"};
        }

        else if ("Dental Science".equals(specialization)) {
            return new String[]{"Dr.Asha","Dr.Kavya","Dr.Sindhu"};
        }

        else if ("Dermatology".equals(specialization)) {
            return new String[]{"Dr.Sneha","Dr.Priya","Dr.Rekha"};
        }

        else if ("Nephrology".equals(specialization)) {
            return new String[]{"Dr.Ravi","Dr.Mohan","Dr.Girish"};
        }

        else if ("Neurology".equals(specialization)) {
            return new String[]{"Dr.Narayan","Dr.Sudhir","Dr.Sanjay"};
        }

        else if ("Oncology".equals(specialization)) {
            return new String[]{"Dr.Ramesh","Dr.Anil","Dr.Kiran"};
        }

        else if ("Urology".equals(specialization)) {
            return new String[]{"Dr.Ravi","Dr.Karthik","Dr.Hemant"};
        }

        else if ("Nuclear Medicine".equals(specialization)) {
            return new String[]{"Dr.Sharma","Dr.Joshi","Dr.Bansal"};
        }

        else {
            System.out.println(specialization + " not found here");
            return null;
        }
    }

    public static void getDoctors(String[] doctors) {

        if (doctors == null) {
            System.out.println("No doctors available.\n");
            return;
        }

        System.out.println("Fetching doctors...");
        System.out.println("---------------------------");

        for (String doctor : doctors) {
            System.out.println(doctor);
        }

        System.out.println("Above are the doctors list");
        System.out.println("---------------------------\n");
    }
}