class MicrowaveRunner {
    public static void main(String[] args) {
        boolean ref = Microwave.startStop();
        System.out.println("Microwave is switchedon: " + ref);
    }
}