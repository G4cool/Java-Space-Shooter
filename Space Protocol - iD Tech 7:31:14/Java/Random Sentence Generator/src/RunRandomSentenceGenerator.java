import java.util.Random;

public class RunRandomSentenceGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Random rand  = new Random();
			String sentences[] = new String[20];
			
			sentences[0] = "Hello.";
			sentences[1] = "Goodbye.";
			sentences[2] = "I'm awesome.";
			sentences[3] = "Roses are red, I'm on my phone.  No one is texting me, forever alone.";
			sentences[4] = "Chuck Norris can cut a knife with butter.";
			sentences[5] = "Chuck Norris doesn't win.  He simply allows you to lose.";
			sentences[6] = "Chuck Norris doesn't dodge bullets.  They dodge him.";
			sentences[7] = "When Chuck Norris does pushups, he doesn't push himself up, he pushes the floor down.";
			sentences[8] = "";
			sentences[9] = "";
			sentences[10] = "";
			
			int randomNum = rand.nextInt(8);
			System.out.println(sentences[randomNum]);
		
	}

}
