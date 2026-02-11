class Refrigerator {
    static boolean isWorking;

    static boolean powerFridge() {
        if (!isWorking) {
            isWorking = true;
            System.out.println("Refrigerator is ON");
        } else {
            isWorking = false;
            System.out.println("Refrigerator is OFF");
        }
        return isWorking;
    }
}

