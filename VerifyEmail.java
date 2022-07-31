import java.util.*;
public class VerifyEmail {
	public static void main(String args[]) {
		 String[] emails = { "realAnna68@yahoo.ca",
			        "cleverAna83@live.ca",
			        "exuberantBradley86@zonnet.nl",
			        "Mayrasuper@yahoo.com.br",
			        "carefulPaula@sympatico.ca",
			        "Tonifoolish@qq.com",
			        "Victorhilarious@mail.ru",
			        "brightTyler63@yahoo.co.in",
			        "helplessKatelyn@yahoo.co.id",
			        "annoyedJuan95@rediffmail.com",
			        "medapatisivani@gmail.com",
			        "excitedBrenda@frontiernet.net",
			        "cleanLouis@windstream.net",
			        "mushyClinton@bigpond.com",
			        "cooperativeSteven@earthlink.net",
			        "Victorperfect@ig.com.br",
			        "Desireesore@ymail.com",
			        "fierceJoanna@yahoo.co.in",
			        "Sergiojealous@yahoo.co.id",
			        "mushyMarco@mac.com",
			        "hurtElizabeth@yahoo.co.uk",
			        "wanderingVictoria36@live.it",
			        "aggressiveFernando31@hetnet.nl",
			        "stupidTonya@bellsouth.net",
			        "impossibleJessie30@yahoo.ca",
			        "attractiveSummer98@wanadoo.fr",
			        "zanyRuben@aim.com",
			        "Briannafrantic@terra.com.br",
			        "clumsyJohn@mac.com",
			        "drabMichael@bellsouth.net",
			        "Wesleyclear@live.it",
			        "Derrickadventurous@yahoo.com.sg",
			        "perfectHaley@hetnet.nl",
			        "obnoxiousJonathon67@aliceadsl.fr",
			        "smilingJaime@verizon.net",
			        "tameTanya44@telenet.be",
			        "proudSavannah55@hotmail.de",
			        "Dylanfaithful@freenet.de",
			        "illBenjamin@yahoo.com",
			        "naughtyPhilip@skynet.be",
			        "Randiadventurous@neuf.fr",
			        "handsomeDerek65@live.co.uk",
			        "Wendyhorrible@hetnet.nl" };

			    Scanner scanner = new Scanner(System.in);
			    System.out.println("Enter Email");
			    String text = scanner.nextLine();
			    boolean isthere = false;
			    for (String email : emails) {
			      if (email.contains(text)) {
			        isthere = true;
			        break;
			      }
			    }
			    if (isthere) {
			      System.out.println("Email found!!!" + text);
			    } else {
			      System.out.println("Email cannot found!!!" + text);
			    }


	}
}
