class WashingMachineRunner {
    public static void main(String[] args) {
        boolean ref = WashingMachine.startStop();
        System.out.println("Washing Machine status: " + ref);
    }
}