class IronBoxRunner {
    public static void main(String[] args) {
        boolean ref = IronBox.switchIron();
        System.out.println("IronBox  is switchedon: " + ref);
		
		IronBox.IncreaseHeat();
		System.out.println("The IronBox heat is Increased");
		IronBox.DecreaseHeat();
		System.out.println("The IronBox heat is Decreased");
		
    }
}