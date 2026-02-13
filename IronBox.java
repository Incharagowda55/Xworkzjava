class IronBox {
    static boolean isHot;
	static int MaxHeat=3;
	static int CurrentHeat;
	static int MinHeat=0;

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
	
	 public static void IncreaseHeat(){
		 System.out.println("Invoking IncreaseHeat");
		 if(isHot==true){
			 if(CurrentHeat<MaxHeat){
				 CurrentHeat=CurrentHeat+1;
			 }
			 else{
				 System.out.println("max reached");
			 }
		 }
			 
		else{
		System.out.println("plzz turn on the iron box");
		}		
		 
		 }
		 
		 public static void DecreaseHeat(){
		 System.out.println("Invoking DecreaseHeat");
		 if(isHot==true){
			 if(CurrentHeat>MaxHeat){
				 CurrentHeat=CurrentHeat-1;;
			 }
			 else{
				 System.out.println("minimum reaches");
			 }
		 }
			 
		else{
		System.out.println("plzz turn on the iron box");
		}		
		 
		
	}
}