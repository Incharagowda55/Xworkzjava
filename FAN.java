class Fan {
    static boolean isRunning;

    static boolean switchFan() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Fan is ON");
        } else {
            isRunning = false;
            System.out.println("Fan is OFF");
        }
        return isRunning;
    }
}