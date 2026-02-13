class SpeakerRunner{
	public static void main(String[]args){
		boolean ref=Speaker.onOroff();
		System.out.println("the speaker is connected :"+ref);
		
		Speaker.IncreaseVolume();
		System.out.println("the volume is :"+ref);
		
		
		Speaker.DecreaseVolume();
		System.out.println("the volume is :"+ref);
		
		
	}
}                         
