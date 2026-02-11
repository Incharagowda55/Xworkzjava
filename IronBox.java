class IronBox {
    static boolean isHot;

    static boolean switchIron() {
        if (isHot==false) {
            isHot = true;
            System.out.println("Iron Box is ON");
        } else {
            isHot = false;
            System.out.println("Iron Box is OFF");
        }
        return isHot;
    }
}