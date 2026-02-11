class Microwave {
    static boolean isHeating;

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
}
