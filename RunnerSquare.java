public class RunnerSquare{
	public RunnerSquare(){

		Perfect_Square sqRoot = (double n) -> Math.sqrt(n)%1 == 0;

		System.out.println(sqRoot.detectSquare(25));


	}

	public static void main(String[] args)
	{
		RunnerSquare app = new RunnerSquare();
	}

}