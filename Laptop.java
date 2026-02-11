class Laptop {
    static boolean isOn;

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
}