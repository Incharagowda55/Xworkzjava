class RefrigeratorRunner {
    public static void main(String[] args) {
        boolean ref = Refrigerator.powerFridge();
        System.out.println("Refrigerator status: " + ref);
		
		Refrigerator.increaseCooling();
		System.out.println("cooling has increased");		
		Refrigerator.decreaseCooling();
		System.out.println("cooling has decreased");
	
		
    }
}
