package calculatorProject;

public class Calculator {
	
	/**********************************************************************
	 * TODO: Split up into separate methods
	 * Add functionality for subtract, divide.
	 * Decimals? Think this might be tricky
	 * Also add some unit tests
	 * Negative numbers? This is a problem for input, not output (i.e 2-9 is ok, but -1 + 5 is not.
	 * 
	 */
	
	public static void main (String[] args) //once done this, match on first element to
	{										//find the word 'add' or similar :)
		if(checkInput(args))
		{
			chooseMethod(args);
		}
		else
			System.out.println("Incorrect input. Please enter integer values only.");

	}
	
	
	public static int add (String[] args)	//addition
	{
		int result = 0;
		for (int i = 1; i < args.length; i++)
		{
			result += Integer.parseInt(args[i]);	//adding all the numbers together and storing in result
		}
		return result;
	}
	
	public static int multiply (String[] args)	//multiplication
	{
		int result = 1;
		for (int i = 1; i < args.length; i++)
		{
			result *= Integer.parseInt(args[i]);	//multiplying all the numbers together and storing in result
		}
		return result;
	}
	
	public static int subtract (String[] args)	//subtraction
	{
		if(args.length > 3)
		{
			System.out.println("Please enter a maximum of two numbers");
			return 0;														//this isn't very elegant. need to improve it.
		}			
		else
		{
			int a = Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]);
			return a-b;
		}
	}
	
	
	public static void chooseMethod (String[] args)	//selecting correct method for given operator
	{
		if(args[0].equals("add"))
		{
			int result = add(args);
			System.out.println(result);
		}
		else
			if(args[0].equals("multiply"))
			{
				int result = multiply(args);
				System.out.println(result);
			}
			else
				if(args[0].equals("subtract"))
				{
					int result = subtract(args);
					System.out.println(result);
				}
		else
			System.out.println("Enter a valid operator (i.e. 'add' followed by some numbers");
	}
	
	
	public static Boolean checkInput(String[] args)		//checking input is in accepted format
	{
		String regex = "[0-9]+";
		for (int i = 1; i < args.length; i++)	//checking all values in input are numbers (need to figure out decimals at some point)
		{
			if (!(args[i]).matches(regex))
				return false;					//else return error
		}
		return true;
	}
	
	}
