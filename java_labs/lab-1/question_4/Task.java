class Task {
	public static void main(String[] args){
		int rand;	

		do{
			rand = getRandomNumber(3,-3);
			System.out.println(rand);
		}while(rand != 0);
	
	}

	 public static int getRandomNumber(int max,int min) {
                        return (int)((Math.random() * (max - (min))) + (min));
                }
}

