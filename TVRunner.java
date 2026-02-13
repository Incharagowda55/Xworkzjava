class TVRunner {
    public static void main(String[] args) {
        boolean ref = TV.power();
        System.out.println("TV status: " + ref);
		TV.increaseVolume();
		System.out.println("Tv volume incresed");
		TV.decreaseVolume();
		System.out.println("Tv volume decresed");
		
    }
}