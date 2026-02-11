class Light {
    static boolean isGlowing;

    static boolean toggleLight() {
        if (isGlowing==false) {
            isGlowing = true;
            System.out.println("Light is ON");
        } else {
            isGlowing = false;
            System.out.println("Light is OFF");
        }
        return isGlowing;
    }
}