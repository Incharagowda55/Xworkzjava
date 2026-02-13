class WashingMachine {
    static boolean isRunning;
	static int waterLevel;
    static int maxLevel = 5;
    static int minLevel = 1;

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
	static void increaseWaterLevel() {
        if (isRunning) {
            if (waterLevel < maxLevel) {
                waterLevel++;
                System.out.println("Water Level: " + waterLevel);
            } else
                System.out.println("Maximum water level reached");
        } else
            System.out.println("Turn on the Washing Machine");
    }

    static void decreaseWaterLevel() {
        if (isRunning) {
            if (waterLevel > minLevel) {
                waterLevel--;
                System.out.println("Water Level: " + waterLevel);
            } else
                System.out.println("Minimum water level reached");
        } else
            System.out.println("Turn on the Washing Machine");
    }
}
