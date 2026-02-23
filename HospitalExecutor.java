class HospitalExecutor{
	public static void main(String[]args){
        System.out.println("Main Started\n");

        String specialization;
        String[] doctors;

        specialization = "General Medicine";
        doctors = Hospital.getDoctorsBySpecialization(specialization);
        Hospital.getDoctors(doctors);

        specialization = "Orthopaedics";
        doctors = Hospital.getDoctorsBySpecialization(specialization);
        Hospital.getDoctors(doctors);

        specialization = "Cardiac Sciences";
        doctors = Hospital.getDoctorsBySpecialization(specialization);
        Hospital.getDoctors(doctors);

        specialization = "Dental Science";
        doctors = Hospital.getDoctorsBySpecialization(specialization);
        Hospital.getDoctors(doctors);

        specialization = "Dermatology";
        doctors = Hospital.getDoctorsBySpecialization(specialization);
        Hospital.getDoctors(doctors);

        specialization = "Nephrology";
        doctors = Hospital.getDoctorsBySpecialization(specialization);
        Hospital.getDoctors(doctors);

        specialization = "Neurology";
        doctors = Hospital.getDoctorsBySpecialization(specialization);
        Hospital.getDoctors(doctors);

        specialization = "Oncology";
        doctors = Hospital.getDoctorsBySpecialization(specialization);
        Hospital.getDoctors(doctors);

        specialization = "Urology";
        doctors = Hospital.getDoctorsBySpecialization(specialization);
        Hospital.getDoctors(doctors);

        specialization = "Nuclear Medicine";
        doctors = Hospital.getDoctorsBySpecialization(specialization);
        Hospital.getDoctors(doctors);

        System.out.println("Main Ended");
    }
}