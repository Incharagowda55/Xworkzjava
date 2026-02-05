class RoyalMart{
	public static void main(String[]args)
	{
		String Stationaries[]={"Books","Pencils","Pen","Markers","Paint",
								"Stickynotes","Clay","HighLighter","Steplers",
								"GeometryBox","Book","PunchingMachine","Scissors",
								"Paperclip","Colourspaper","PapperCutter","CardBoard",
								"Pouch","Calculators","GlueStick","Tape","SketchPen",
								"Bind","Eraser","Sharpner","Scale","Crayons"};
								
		String Fruits[]={"Apple","Orange","Pineapple","CustardApple","Strawberry",
								"Bannana","Kiwi","ButterFruit","Dragon","blueberry","grapes","Raspberry",
								"Mango","Papaya","WaterMelon","Litchi","Chiku","Pear",
								"plum","JackFruit","Peach","Guava"};
		
		String Groceries[] = {"Rice","Wheat","Sugar","salt","Turmeric",
							"Chilli","Tea","coffee","Oil",
							"ghee","KetchUp","Flour","Chaocos","Poha","Oats",
							"Dal","Chana","Jam","Peanuts","Jaggery",
							"Mustard Seeds","Cumin","Coriander","Garam Masala","Vermicelli"};
		
		String Vegetables[] = {"Potato","tomato","Onion","Carrot","Beans",
								"Brinjal","Cabbage","Cauliflower","chilli",
							"beetroot","raadish","Cucumber","capsicum","Peas",
							"Pumpkin","Bottlegourd","Bittergurd","Drumstick","Sweetcorn",
							"Lady Finger","Broccoli","Mushroom","Garlic","Ginger","Pumpkin" };	
		
        String FoodItems[]={"Chips","Juice","Chocolates","Milkshake","Biscuit",
							 "Jam","Bread","Cake","Sweets","Rolls",
							"Kellogs","Namkins","Icecream","Honey",
							"Waffers","Rusk","Noodles","Pickles","Fries","PizzaBase","Paratha",
							"Soda","Pasta"};
							
		String Beverages[] = {"Milk","curd","butterMilk","Softdrink","Fruitjuice",
							"Energydrink","Lassi","Coldcoffee","Greentea",
							 "Blacktea","Lemonjuice","Coconutwater","Milkshake",
							 "Badammilk", "Rosemilk","Hot Chocolate","Iced Tea","Apple Juice",
							  "Orange Juice","Mango Shake","Mineral Water","Soda",
							"Protein Drink","Herbal Tea"};
							
		String Cosmetics[]={"Lipstick","Kajal","Mascara","Foundation","Compact",
							 "Blush","Highlighter","NailPolish","MakeupRemover",
							 "FacePrimer","BBcream","Concealer","Eyeshadow","Eyeliner",
							 "LipGloss","Faceserum","Sheetmask","Facepack","Moisturez","Serum","Lipbalm",
							"Makeupbrush","BeautyBlender","HairSerum","SettingSpray",
							"BodyMist","Perfume"};

		String Health[]={"Proteinpowder","Multivitamin","Calcium","IronTablets",
						"ORS","FirstAidKit","Bandage","Thermometer","Glucometer","BPMonitor",
						"PainReliefSpray","HotWaterBag","HeatingPad","DigitalScale",
						"HandSanitizer","FaceMask","VitaminC","Omega3","HerbalTea",
							"AntisepticLiquid","CoughDrops","MuscleGel","EyeDrops","NasalSpray"};

		String Clothes[]={
							"TShirt","Shirt","Jeans","Leggings","Kurti",
							"Saree","Dupatta","Shorts","TrackPant",
							"Sweater","Jacket","NightDress","InnerWear","Socks","Scarf",
							"Cap","Gloves","RainCoat","Belt","shorts","leggin",
							"Tie","Skirt","Top","Palazzo","Hoodie","Pyjamas"};

		String Kitchen[]={"Plates","Bowls","Spoons","Forks","Knives",
							"PressureCooker","FryingPan","Tawa",
							"MixerGrinder","GasLighter","LunchBox","WaterBottle","ChoppingBoard","Peeler","Grater",
							"Strainer","MeasuringCups","RollingPin","StorageBoxes","Spatula",
		               "TeaKettle","RiceCooker","IdliStand","CoffeeMug","Thermos"};
							

		String BabyCare[]={"BabyDiapers","Wipes","Soap","BabyShampoo","BabyOil",
							"BabyPowder","FeedingBottle","BabyCream","BabyLotion",
							"BabyTowel","BabyClothes","BabyBlanket","BabyComb",
							"BabyNailCutter","BabyBib","BabyFood","BabySpoon","BabyPlate","BabyWalker",
		"BabyCarrier","BabyMonitor","BabyToothbrush","BabyTeether","BabyBathTub"};
							

		String PetCare[]={"DogFood","CatFood","PetBiscuits","PetShampoo","PetSoap","Petclotgh",
						"PetBrush","PetComb","PetCollar","PetLeash","PetBed",
						"PetBowl","PetToy","PetTreat","Petvitamin","PetDiapers","PetCarrier",
						"PetCage","PetSpray","PetTowel",
		                  "PetDentalStick","PetHarness","PetRaincoat","PetMat","PetWaterBottle"};

		String Meat[]={"Chicken","Mutton","Fish","Prawns","Crab",
						"Turkey","Duck","Quail","Bacon",
						"Salami","ChickenWings","ChickenLegs","ChickenBreast","MincedMeat",
						"FishFillet","PrawnCutlets","MeatBalls","ChickenNuggets","FishFingers",
		                   "SmokedChicken","SmokedFish","LambChops","BeefSteak","PepperChicken"};
				
		String Toiletries[]={"Shampoo","Conditioner","BodyWash","Soap","FaceWash",
							"Toothpaste","ToothBrush","MouthWash","Deodorant","Perfume",
							 "ShavingCream","Razor","HandWash","SanitaryPads",
							 "Tissues","WetWipes","Cotton","EarBuds","FootCream","HairOil",
		                  "FaceCream","Sunscreen","AfterShave","LipBalm","BathSponge"};
						 
		String Plastic[]={"bottle","bucket","mug","chair","table",
				           "basket","box","plate","spoon","fork",
				         "dustbin","tray","container","hanger","stool",
				             "lunchbox","jar","strainer","soapcase","comb",
		                     "crate","mat","file","toy","watercan"};
			

		String SteelItems[]={"plate","bowl","glass","spoon","fork",
				         "knife","tiffin","jug","tray","bucket",
				         "mug","container","lunchbox","pan","pot",
				           "kettle","rack","strainer","dustbin","chargerplate","cooker",
		                 "flask","ladle","storagebox","colander"};
				

		String Accessories[]={"hairclip","hairband","watch","bracelet",
		                   "necklace","earring","ring","anklet","sunglass","wallet",
				            "purse","keychain","belt","cap","scarf","handbag","bag","phonecover","brooch","nosepin",
		                       "bangle","tie","makeuppouch","cufflink","chain"};
			

		String Gifts[]={"teddy","card","flowers","giftbox","photoframe","chocolate","cup",
		              "showpiece","keyholder","clock","softtoy","perfume","candle","diary","penset",
		               "plant","lamp","cushion","puzzle","basket","musicbox","decor","snowball","cupprint","wrapper"};
						

		String Goditems[]={"agarbatti","dhoop","camphor","diya","bell","plate","kalash"
		                      ,"cotton","thread","kumku","chandan","vibhuti","flowers","lamp","photo",
							"frame","book","rudraksha","mala","conch","panchapatra","ghee","cloth","mat","oil"};
				

		String appliances[]={"mixer","ricecooker","kettle","induction","microwave","fridge",
		                    "washingmachine","iron","vacuum","purifier","toaster","blender","juicer",
							"coffeemaker","sandwichmaker","airfryer","heater","fan","tablefan","hairdryer",
		                    "chopper","dishwasher","handmixer","electricstove","eggboiler"};
							
					System.out.println("\nStationaries:");
					for(String s : Stationaries){
						System.out.println(s);
					}

					System.out.println("\nFruits:");
					for(String f : Fruits){
						System.out.println(f);
					}

					System.out.println("\nGroceries:");
					for(String g : Groceries){
						System.out.println(g);
					}

					System.out.println("\nVegetables:");
					for(String v : Vegetables){
						System.out.println(v);
					}

					System.out.println("\nFood Items:");
					for(String fi : FoodItems){
						System.out.println(fi);
					}

					System.out.println("\nBeverages:");
					for(String b : Beverages){
						System.out.println(b);
					}

					System.out.println("\nCosmetics:");
					for(String c : Cosmetics){
						System.out.println(c);
					}

					System.out.println("\nHealth:");
					for(String h : Health){
						System.out.println(h);
					}

					System.out.println("\nClothes:");
					for(String cl : Clothes){
						System.out.println(cl);
					}

					System.out.println("\nKitchen:");
					for(String k : Kitchen){
						System.out.println(k);
					}

					System.out.println("\nBaby Care:");
					for(String bc : BabyCare){
						System.out.println(bc);
					}

					System.out.println("\nPet Care:");
					for(String p : PetCare){
						System.out.println(p);
					}

					System.out.println("\nMeat:");
					for(String m : Meat){
						System.out.println(m);
					}

					System.out.println("\nToiletries:");
					for(String t : Toiletries){
						System.out.println(t);
					}

					System.out.println("\nPlastic:");
					for(String pl : Plastic){
						System.out.println(pl);
					}

					System.out.println("\nSteel Items:");
					for(String st : SteelItems){
						System.out.println(st);
					}

					System.out.println("\nAccessories:");
					for(String a : Accessories){
						System.out.println(a);
					}

					System.out.println("\nGifts:");
					for(String gi : Gifts){
						System.out.println(gi);
					}

					System.out.println("\nGod Items:");
					for(String go : Goditems){
						System.out.println(go);
					}

					System.out.println("\nAppliances:");
						for(String ap : appliances){
							System.out.println(ap);
						}
	}
}
		
											 
										 
						  
										
																						
										
							
							

				
							
		