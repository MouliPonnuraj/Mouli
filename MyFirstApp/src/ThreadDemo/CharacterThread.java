package ThreadDemo;

public class CharacterThread extends Thread {
	public void printChar(){
		for( char c='A';c<='Z';++c){
			System.out.print(c);
		}
	}
	public void run(){
		printChar();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
