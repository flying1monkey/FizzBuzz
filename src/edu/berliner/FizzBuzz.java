package edu.berliner;

public class FizzBuzz {
	public static void main(String[] args) {
		boolean hit;
		
		for(int i=1; i<101; i++)
		{
			hit=false;
			//System.out.println(i);
			if(i%3==0)
			{
				System.out.print("Fizz");
				hit=true;
			}
			if(i%5==0)
			{
				System.out.print("Buzz");
				hit=true;
			}
			if(hit)
			{
				System.out.println("");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
