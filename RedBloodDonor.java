class RedBloodDonor{
	public static void main(String[]args)
	{
		//invoke DonorAcc
		createDonorAccount("vanivani@gmail.com","Inch",1234,"15/06/2004",577204,984,"Inch@123","Inch@123");
		
	}

	
		
		 static void createDonorAccount(String emailId,String Name,int DonorId, String dateofbirth,int Zipcode,int MNumber,String Password,String ConfirmPassword){
			System.out.println("the donor email is:"+" "+emailId);
			System.out.println("the donor Name is:"+" "+Name);
			System.out.println("the donor Date Of Birth is:"+" "+dateofbirth);
			System.out.println("the donor Id is:"+" "+DonorId);
			System.out.println("the donor zipcode is:"+" "+Zipcode);
			System.out.println("the donor Mobilenumber is:"+" "+MNumber);
			System.out.println("the donor password is:"+" "+Password);
			System.out.println("the donor cPassword is:"+" "+ConfirmPassword);
		 }
}
	

			
			
