class Speaker{
	static boolean isConnected;
	 static int CurrentVolume;
	static int MaxVolume=8;
	static int minValue=0;
	
	
	static boolean onOroff(){
	if(isConnected==false){
		isConnected=true;
	    System.out.println("the device is on");
    }
    else if(isConnected==true){
     isConnected=false;
      System.out.println("the speaker is off");
    }
	
	return isConnected;
	

}
  public static void IncreaseVolume(){
	 System.out.println("Invoking Increase volume");
	 System.out.println("no of args:"+0);
	 if(isConnected==true){
		 if(CurrentVolume<MaxVolume){
			 CurrentVolume= CurrentVolume+1;
			 System.out.println("the current colume is:"+CurrentVolume);
		 }
		else
           System.out.println("Max vol reached");
	   	 
	}
	 else
		 System.out.println("turn on the speaker");
			 
}
public static void DecreaseVolume(){
	 System.out.println("Invoking Decrease volume");
	 System.out.println("no of args:"+0);
	 if(isConnected==true){
		 if(CurrentVolume>MaxVolume){
			 CurrentVolume= CurrentVolume-1;
			 System.out.println("the current colume is:"+CurrentVolume);
		 }
		else
           System.out.println("Min vol reached");
	   	 
	}
	 else
		 System.out.println("turn off the speaker");
			 
}
}


	