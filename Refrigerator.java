class Refrigerator {
    static boolean isWorking;
	 static int coolingLevel;
    static int maxLevel = 5;
    static int minLevel = 1;

    static boolean powerFridge() {
        if (isWorking==false) {
            isWorking = true;
            System.out.println("Refrigerator is ON");
        } else {
            isWorking = false;
            System.out.println("Refrigerator is OFF");
        }
        return isWorking;
    }
	
	static void increaseCooling() {
        if (isWorking) {
            if (coolingLevel < maxLevel) {
                coolingLevel++;
                System.out.println("Cooling Level: " + coolingLevel);
            } else
                System.out.println("Maximum cooling level reached");
        } else
            System.out.println("Turn on refrigerator");
    }

    static void decreaseCooling() {
        if (isWorking) {
            if (coolingLevel > minLevel) {
                coolingLevel--;
                System.out.println("Cooling Level: " + coolingLevel);
            } else
                System.out.println("Minimum cooling level reached");
        } else
            System.out.println("Turn on refrigerator");
    }
}

