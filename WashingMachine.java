class WashingMachine {
    static boolean isRunning;

    static boolean startStop() {
        if (isRunning==false) {
            isRunning = true;
            System.out.println("Washing Machine Started");
        } else {
            isRunning = false;
            System.out.println("Washing Machine Stopped");
        }
        return isRunning;
    }
}
