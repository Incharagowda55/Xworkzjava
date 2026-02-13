class MobileRunner {
    public static void main(String[] args) {
        boolean ref = Mobile.powerMobile();
        System.out.println("Mobile is switchedon: " + ref);
		Mobile.increaseVolume();
		System.out.println("Mobile vol increased");
		
		Mobile.decreaseVolume();
		System.out.println("Mobile vol decreased");
		
    }
}