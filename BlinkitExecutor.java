class BlinkitExecutor{
	public static void main(String[] args){
		String FoodName="Lays Classic";
		double ref=Blinkit.search(FoodName);
		System.out.println("The Price of "+FoodName+" "+"is" +" "+ref);
	}
}