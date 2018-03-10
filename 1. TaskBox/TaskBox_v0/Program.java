import java.util.Scanner;
public class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		double weight = scanner.nextDouble();
		
		int km = scanner.nextInt();
		
		double cost = 30 * km + 500 * weight;
		
		System.out.println(cost);
	}
}