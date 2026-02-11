class LightRunner {
    public static void main(String[] args) {
        boolean ref = Light.toggleLight();
        System.out.println("Light status: " + ref);
    }
}