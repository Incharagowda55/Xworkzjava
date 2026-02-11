class Refrigerator {
    static boolean isWorking;

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
}

