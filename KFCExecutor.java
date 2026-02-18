class KFCExecutor{
	public static void main(String[] args){
		String FoodName="BBQ Rice Bowl";
		double ref=KFC.search(FoodName);
		System.out.println("The Price of "+FoodName+" "+"is" +" "+ref);
	}
}