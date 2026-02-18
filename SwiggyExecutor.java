class SwiggyExecutor{
	public static void main(String[] args){
		String FoodName="Masala Dosa";
		double ref=Swiggy.search(FoodName);
		System.out.println("The Price of "+FoodName+" "+"is" +" "+ref);
	}
}