class McDonaldsExecutor{
	public static void main(String[] args){
		String FoodName="McAloo Tikki";
		double ref=McDonalds.search(FoodName);
		System.out.println("The Price of "+FoodName+" "+"is" +" "+ref);
	}
}