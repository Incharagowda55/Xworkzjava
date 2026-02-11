class Speaker{
	static boolean isConnected;
	
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
}


	