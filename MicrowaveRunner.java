class MicrowaveRunner {
    public static void main(String[] args) {
        boolean ref = Microwave.startStop();
        System.out.println("Microwave is switchedon: " + ref);
		Microwave.IncreaseTemperature();
		System.out.println("Microwave is heated");
		Microwave.DecreaseTemperature();
		System.out.println("Microwave heat decreased");
    }
}