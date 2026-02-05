class Songs {
    public static void main(String[] args) {

        String SongNames[] = {"Otha","vada","Maula","neene","taratara",
                              "munbeba","oru kanna","En kadahal solla","Vizhi modd"};

        String munbeba = SongNames[5];
        String taratara = SongNames[4];

        int size = SongNames.length;

        System.out.println("The number of songs available are " + size);
        System.out.println("The selected songs are:");

        System.out.println(munbeba + " " + taratara);
		System.out.println("the list of all somgs using for each");
		for(String song:SongNames){
		System.out.println(song);
		}
    }
}