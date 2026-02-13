class LightRunner {
    public static void main(String[] args) {
        boolean ref = Light.toggleLight();
        System.out.println("Light status: " + ref);
		
		Light.increaseBrightness();
		System.out.println("Light level has increased");
		
		Light.decreaseBrightness();
		System.out.println("Light level decreased");
		
		
    }
}