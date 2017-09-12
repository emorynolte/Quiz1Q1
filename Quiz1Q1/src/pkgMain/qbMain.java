package pkgMain;
import java.util.Scanner; 


public class qbMain {

	public static void main(String[] args) {
		
		
		System.out.println("Enter number of TD's: ");
		Scanner td_scanner = new Scanner(System.in);
		double td = td_scanner.nextInt();
		
		System.out.println("Enter number of yards: ");
		Scanner yards_scanner = new Scanner(System.in);
		double yards = yards_scanner.nextInt();
		
		System.out.println("Enter number of interceptions: ");
		Scanner ints_scanner = new Scanner(System.in);
		double ints = ints_scanner.nextInt();
		
		System.out.println("Enter number of completions: ");
		Scanner comp_scanner = new Scanner(System.in);
		double comp = comp_scanner.nextInt();
		
		System.out.println("Enter number of attempts: ");
		Scanner att_scanner = new Scanner(System.in);
		double att = att_scanner.nextInt();
		
		
		double rating = calcRating(td, yards, ints, comp, att);
		System.out.println(rating);
	}
	
	public static double calcRating(double td, double yards, double ints, double comp, double att) {
		
		double a = ((comp/att)-.3)*5;
		double b = ((yards/att)-3)*.25;
		double c = ((td/att)*20);
		double d = 2.375-((ints/att)*25);
		
		//probably not the best way to check
		
		if (a > 2.375) {
			a =  2.375;
		}
		else if (a < 0) {
			a = 0;
		}
		
		if (b > 2.375) {
			b =  2.375;
		}
		else if (b < 0) {
			b = 0;
		}
		
		if (c > 2.375) {
			c =  2.375;
		}
		else if (c < 0) {
			c = 0;
		}
		
		if (d > 2.375) {
			d =  2.375;
		}
		else if (d < 0) {
			d = 0;
		}
		
		
		
		
		
		return ((a+b+c+d)/6)*100;
	}
	
}

