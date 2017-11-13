import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class checkForVirus{
	//public String stringToCheck = "X5O!P%@AP[4\\PZX54(P^)7CC)7}$EICAR-STANDARD-ANTIVIRUS-TEST-FILE!$H+H*";
	public static void main (String fileName){
		String stringToCheck = "X5O!P%@AP[4\\PZX54(P^)7CC)7}$EICAR-STANDARD-ANTIVIRUS-TEST-FILE!$H+H*";
		String line = null;
		try{
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		while ((line = bufferedReader.readLine() ) != null){
			if (line == stringToCheck){
				System.out.println("VIRUS");
			}
			else {
				System.out.println("No VIRUS");
			}
		}
		bufferedReader.close();
		}

		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		catch(IOException ex){
			System.out.println("Error Reading File");
		}
		}
		}
/*		//try{
			//Scanner read = new Scanner(new File(args[0]));
			BufferedReader inputReader = new BufferedReader(new FileReader("virus.txt"));
//			while (inputReader.readLine() != null){
				String line = inputReader.readLine();
				if (line.equals(stringToCheck)){
						System.out.println("VIRUS");
						}
				else{
						System.out.println("No virus");
				}
//			}
			//}
			//catch (FileNotFoundException e1) {
			//	e1.printStackTrace();
			//}
			//catch (IOException ep){
			//	p.printStackTrace();
			//}
		}
	}
	*/