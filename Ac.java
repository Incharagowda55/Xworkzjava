class AC {
    static boolean isCooling;

    static boolean powerAC() {
        if (isCooling==false) {
            isCooling = true;
            System.out.println("AC is ON");
        } else {
            isCooling = false;
            System.out.println("AC is OFF");
        }
        return isCooling;
    }
}


