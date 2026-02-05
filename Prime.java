class Prime{
	public static void main(String[]args){
		
	   String Tamil[]={"vikram","jaibhim","soorarai","master",
	                           "bigil","asuran","kaithi","doctor","beast","thunivu",
				                "viswasam","annathe","don","lovetoday","remo",
	                          "velaikaran","petta","sarkar","maanadu","cobra"};
				

	   String Kannada[]={"kgf","kgf2","kantara","charlie","raajakumara",
				                 "yuvarathnaa","pogaru","robber","ugramm",
								 "tagaru","avane","gandhada","dia","love_mocktail","radhika",
	                           "bellbottom","kotigobba","madhagaja","rama","vikrant"};
			

		String Telugu[]={"rrr","pushpa","alavaikunta","bahubali",
		                   "bahubali2","magadheera","syeraa","rangasthalam","jersey","arjun",
				         "eega","temper","kick","happydays","leader","fidaa","geetha","broche","dearcomrade","svsc"};
				

		String Hindi[]={"3idiots","dangal","pk","lagaan","ghajini","kabir","war","pathaan","jawan","sholay",
		                "ddlj","andhadhun","badla","drishyam","rai","kesari","tanhaji","chhichhore","sultan","baarbaar"};
				

		String Malayalam[]={"drishyam","lucifer","premam","bangalore","kumbalangi",
				             "takeoff","uyare","jallikattu","joji","kurup","bheeshma","hridayam","charlie",
		"android","virus","ambili","kappela","irul","home","brodaddy"};
		
		System.out.println("Tamil Movies:");
        for(String t : Tamil){
            System.out.println(t);
        }

        System.out.println("\nKannada Movies:");
        for(String k : Kannada){
            System.out.println(k);
        }

        System.out.println("\nTelugu Movies:");
        for(String te : Telugu){
            System.out.println(te);
        }

        System.out.println("\nHindi Movies:");
        for(String h : Hindi){
            System.out.println(h);
        }

        System.out.println("\nMalayalam Movies:");
        for(String m : Malayalam){
            System.out.println(m);
        }
    
				
	}
}