class Mobile {
    static boolean isOn;

    static boolean powerMobile() {
        if (isOn==false) {
            isOn = true;
            System.out.println("Mobile is ON");
        } else {
            isOn = false;
            System.out.println("Mobile is OFF");
        }
        return isOn;
    }
}