class Yeti {

	public static final char MACHO='M';
	public static final char HEMBRA='H';
	private char color = 'B';
	private char sexo = 'M';
	private boolean hambriento = true;
	
	//Constructores
	
	public Yeti() {}
	
	public Yeti(char sexo) {
		if(sexo=='H' || sexo=='h'){
			this.sexo='H';
		}
	}
	
	public Yeti(boolean hambriento){
		this.hambriento=hambriento;
	}
	
};