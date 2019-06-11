public class Runner{
	public Runner(){

		Perfect_Square sqRoot = (double n) -> Math.sqrt(n)%1 == 0;
		System.out.println(sqRoot.detectSquare(25));

		float a = (float)(Math.random()*10)+0;
		float b = (float)(Math.random()*10)+0;
		DecimalFormat df = new DecimalFormat("0.000");
		PrintQuotientInterface quot = (float x, float y) -> System.out.printf("The quotient of %s and %s is %s.%n", df.format(a), df.format(b), df.format(a/b));
		quot.printQuot(a, b);

	}

	public static void main(String[] args)
	{
		Runner app = new Runner();
	}

}