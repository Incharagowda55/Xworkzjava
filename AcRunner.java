class AcRunner {
    public static void main(String[] args) {
        boolean ref = Ac.powerAC();
        System.out.println("AC status: " + ref);
		
		Ac.increaseTemperature();
		System.out.println("AC Temperature increased");
		Ac.decreaseTemperature();
		System.out.println("AC temp decre");
		
    }
}