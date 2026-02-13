class FanRunner {
    public static void main(String[] args) {
        boolean ref = Fan.switchFan();
        System.out.println("Fan status: " + ref);
		Fan.increaseSpeed();
		System.out.println("Fan speed is increased");
		Fan.decreaseSpeed();
		System.out.println("Fan speed is decreased");
		
    }
}