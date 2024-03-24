import java.util.*;
import java.io.*;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Random rand = new Random();
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		
		for(int i=0;i<numbers.length;i++)
		    //random.nextInt(max - min + 1) + min
		    numbers[i]=rand.nextInt(10)+1;
		    
		for(int element:numbers)
		    System.out.print(element+" ");
		    
		sc.nextInt();
	}
}
