class Laptop {
    static boolean isOn;
	static int brightness;
    static int maxBrightness = 10;
    static int minBrightness = 0;

    static boolean powerLaptop() {
        if (!isOn) {
            isOn = true;
            System.out.println("Laptop is ON");
        } else {
            isOn = false;
            System.out.println("Laptop is OFF");
        }
        return isOn;
    }
	static void increaseBrightness() {
        if (isOn) {
            if (brightness < maxBrightness) {
                brightness++;
                System.out.println("Brightness: " + brightness);
            } else
                System.out.println("Maximum brightness reached");
        } else
            System.out.println("Turn on laptop");
    }
	static void decreaseBrightness() {
        if (isOn) {
            if (brightness > minBrightness) {
                brightness--;
                System.out.println("Brightness: " + brightness);
            } else
                System.out.println("Minimum brightness reached");
        } else
            System.out.println("Turn on laptop");
    }
}