class Fan {
    static boolean isRunning;
	static int speed;
    static int maxSpeed = 5;
    static int minSpeed = 0;


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
	static void increaseSpeed() {
        if (isRunning) {
            if (speed < maxSpeed) {
                speed++;
                System.out.println("Speed: " + speed);
            } else
                System.out.println("Maximum speed reached");
        } else
            System.out.println("Turn on fan");
    }
	static void decreaseSpeed() {
        if (isRunning) {
            if (speed > minSpeed) {
                speed--;
                System.out.println("Speed: " + speed);
            } else
                System.out.println("Minimum speed reached");
        } else
            System.out.println("Turn on fan");
    }
	
}