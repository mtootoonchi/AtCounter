/*
 * AtCounter and MyProgram by Matthew Tootoonchi


 * 
 * AtCounter will create a 2D array filled with '@' or '-' randomly with dimensions of user input then
 * find the number of '@' next to each other of user input, then after the user stops the program it will 
 * finally print out the created 2D array.
 * 
 */
import java.util.Scanner;
public class MyProgram 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("AtCounter will create a 2D array filled with \'@\' or \'-\' \nrandomly with dimensions of user input then find the number \nof \'@\' next to each other of user input, then after the \nuser stops the program it will finally print out the \ncreated 2D array.\n\n");
        System.out.print("How many rows do you want in your matrix: ");
        int a=checkInt(scan.next());    //The rows in our 2D array.
        scan.reset();
        System.out.print("\nHow many columns do you want in your matrix: ");
        int b=checkInt(scan.next());    //The columns in our 2D array.
        scan.reset();
        if(a<0||b<0) 
        {
        	System.out.println("\n\nYou have stopped the program or you put an invalid input.\n");
        }
        else
        {
        	matrix num=new matrix(a, b);  //Creates a 2D array filled randomly with '@' or '-' with dimensions of user input
        	int row=0;
        	int col=0;
        	while(true)   //Keeps asking the user where in the 2D array you want to search for '@' until the user stops it.
        	{
        		System.out.print("\n\nWhat is the row you want to look at\nor type \"0\" or lower to stop: ");
        		row=checkInt(scan.next())-1;  //Tells the user which row you want to look at from 1 to a;
        		scan.reset();
        		if(row<0||row>a-1)  //Array out of bounds case and user end.
        		{
        			System.out.println("\n\nYou have stopped the program or you put an invalid input.\nThe matrix looks like this.\n");
        			break;
        		}
        		else
        		{
        			System.out.print("\nWhat is the column you want to look at\nor type \"0\" or lower to stop: ");
        			col=checkInt(scan.next())-1;   //Tells the user which column you want to look at from 1 to b;
        			scan.reset();
        			if(col<0||col>b-1)   //Array out of bounds case and user end.
        			{
        				System.out.println("\n\nYou have stopped the program or you put an invalid input.\nThe matrix looks like this.\n");
        				break;
        			}
        			else
        			{
        				System.out.println("\nYou have "+num.point(row, col)+"@ next to each other.");   //Prints the number of @ together.
        			}
        		}
        	}
        num.printmatrix();   //Prints randomly generated 2D array.
        }
	}
	private static int checkInt(String a)
	{
		try 
        { 
            // checking valid integer using parseInt() method 
            return Integer.parseInt(a); 
        }  
        catch (NumberFormatException e)  
        { 
        	return -1;
        } 
	}
}
