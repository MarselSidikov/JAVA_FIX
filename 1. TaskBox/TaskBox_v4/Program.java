import ru.ivmiit.CostCalculator;

class Program {
	public static void main(String[] args) {
		Table table = new Table(3, 4);
		Table bigTable = new Table(10, 20);
		CostCalculator costCalculator = new CostCalculator(500, 20);

		double cost1 = costCalculator.calcCost(table, 30);
		double cost2 = costCalculator.calcCost(bigTable, 30);

		System.out.println(cost1);
		System.out.println(cost2);
	}
}