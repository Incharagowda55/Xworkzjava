class ZeptoExecutor{
	public static void main(String[] args){
		String FoodName="Papad Pack";
		double ref=Zepto.search(FoodName);
		System.out.println("The Price of "+FoodName+" "+"is" +" "+ref);
	}
}