class TV {
    static boolean isOn;
    static boolean power() {
        if (isOn==false) {
            isOn = true;
            System.out.println("TV is ON");
        } else {
            isOn = false;
            System.out.println("TV is OFF");
        }
        return isOn;
    }
}

