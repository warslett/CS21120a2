package sorting2014;
import java.io.*;

/**
 * @author Richard Shipman <rcs@aber.ac.uk>
 */
public class MakeDataFile {


	public static void main(String[] args) {
		if (args.length == 2) {
			makeFile(args[0],Integer.parseInt(args[1]));
		} else {
			System.out.println("Creating lots of files, please wait... dots will get faster");
			for (int i = 6; i>2; i--) {
				System.out.print(".");
				makeFile("test"+String.valueOf(i)+".dat", (int)Math.pow(10,i));
				System.out.print(".");
				makeFile("test"+String.valueOf(i)+"a"+".dat", (int)Math.pow(10,i)*2);
				System.out.print(".");
				makeFile("test"+String.valueOf(i)+"b"+".dat", (int)Math.pow(10,i)*5);
			}
			System.out.println("done");
		}
	}
		
	public static void makeFile(String name, int numbers)
	{
		BufferedWriter writer=null;
		try {
			writer = new BufferedWriter(new FileWriter(name));
		} catch (IOException ex) {
		}

		int number=0;
		
		for (int i = 0; i<numbers; i++)
		{
			number=(int)(1000000+(Math.random()*8999999));
			try {
				writer.write(number+"\n");
			} catch (IOException e)
			{}
		}

		try {
			writer.close();
		} catch (IOException ex) {
		}
	}
	
	
	
	
}