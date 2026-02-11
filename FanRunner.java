class FanRunner {
    public static void main(String[] args) {
        boolean ref = Fan.switchFan();
        System.out.println("Fan status: " + ref);
    }
}