class Microwave {
    static boolean isHeating;
	static int Currenttemperature;
    static int maxTemp = 200;
    static int minTemp = 0;

    static boolean startStop() {
        if (isHeating==false) {
            isHeating = true;
            System.out.println("Microwave Started");
        } else {
            isHeating = false;
            System.out.println("Microwave Stopped");
        }
        return isHeating;
    }
	static void IncreaseTemperature() {
        if (isHeating==true) {
            if (Currenttemperature < maxTemp) {
                Currenttemperature += 10;
                System.out.println("Temperature: " + Currenttemperature);
            } else
                System.out.println("Maximum temperature reached");
        } else
            System.out.println("Turn on microwave");
    }

    static void DecreaseTemperature() {
        if (isHeating==true) {
            if (Currenttemperature > minTemp) {
                Currenttemperature -= 10;
                System.out.println("Temperature: " + Currenttemperature);
            } else
                System.out.println("Minimum temperature reached");
        } else
            System.out.println("Turn on microwave");
    }
}

