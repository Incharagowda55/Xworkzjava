class TV {
    static boolean isOn;
	static int volume;
    static int maxVolume = 20;
    static int minVolume = 0;
	
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
	static void increaseVolume() {
        if (isOn) {
            if (volume < maxVolume) {
                volume++;
                System.out.println("Volume: " + volume);
            } else
                System.out.println("Maximum volume reached");
        } else
            System.out.println("Turn on TV");
    }

    static void decreaseVolume() {
        if (isOn) {
            if (volume > minVolume) {
                volume--;
                System.out.println("Volume: " + volume);
            } else
                System.out.println("Minimum volume reached");
        } else
            System.out.println("Turn on TV");
    }
}

