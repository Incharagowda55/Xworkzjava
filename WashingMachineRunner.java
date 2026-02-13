class WashingMachineRunner {
    public static void main(String[] args) {
        boolean ref = WashingMachine.startStop();
        System.out.println("Washing Machine status: " + ref);
		
		WashingMachine.increaseWaterLevel();
		 System.out.println("Washing Machine waterlevel has increased");
		
		WashingMachine.decreaseWaterLevel();
		 System.out.println("Washing Machine waterlvel has decreased");
		
		
    }
}