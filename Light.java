class Light {
    static boolean isGlowing;
	static int brightness;
    static int maxBrightness = 5;
    static int minBrightness = 0;

    static boolean toggleLight() {
        if (isGlowing==false) {
            isGlowing = true;
            System.out.println("Light is ON");
        } else {
            isGlowing = false;
            System.out.println("Light is OFF");
        }
        return isGlowing;
    }
	
	static void increaseBrightness() {
        if (isGlowing) {
            if (brightness < maxBrightness) {
                brightness++;
                System.out.println("Brightness: " + brightness);
            } else
                System.out.println("Maximum brightness reached");
        } else
            System.out.println("Turn on the Light");
    }

    static void decreaseBrightness() {
        if (isGlowing) {
            if (brightness > minBrightness) {
                brightness--;
                System.out.println("Brightness: " + brightness);
            } else
                System.out.println("Minimum brightness reached");
        } else
            System.out.println("Turn on the Light");
    }
}