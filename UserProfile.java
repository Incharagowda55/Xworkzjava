class UserProfile{
	static int Username;
	public static void main(String[]args){
		String Username="baba"; //in methods same variable can be dclred only once but we can user variable name many times
		UserProfile.Username=78; // when we want to print integer no which is int we shld extrct static variable where static dtatype is int
		System.out.println(Username);
		System.out.println(UserProfile.Username);
	}
}
	

 