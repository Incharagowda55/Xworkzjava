class Mobile {
    static boolean isOn;
	static int volume;
    static int maxVolume = 10;
    static int minVolume = 0;


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
	static void increaseVolume() {
        if (isOn) {
            if (volume < maxVolume) {
                volume++;
                System.out.println("Volume: " + volume);
            } else
                System.out.println("Maximum volume reached");
        } else
            System.out.println("Turn on the Mobile");
    }

    static void decreaseVolume() {
        if (isOn) {
            if (volume > minVolume) {
                volume--;
                System.out.println("Volume: " + volume);
            } else
                System.out.println("Minimum volume reached");
        } else
            System.out.println("Turn on the Mobile");
    }
}