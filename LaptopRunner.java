class LaptopRunner {
    public static void main(String[] args) {
        boolean ref = Laptop.powerLaptop();
        System.out.println("Laptop is turned: " + ref);
		Laptop.increaseBrightness();
		System.out.println("laptop brigtness increse");
		
		Laptop.decreaseBrightness();
		System.out.println("laptop brightness is decreased ");
    }
}