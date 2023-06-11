package StudentNameGuessing;

public class StudentGameNMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath="C:\\Users\\santa\\OneDrive\\Desktop\\sucharita\\STUDENTNAME.txt";
		StudentNameGuessingGameN game=new StudentNameGuessingGameN(filePath);
		game.displayRandomName();
game.play();
	}

}
