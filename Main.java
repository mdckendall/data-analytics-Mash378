import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
    int number=0;
    do{
      System.out.println("Press 1 to get whether");
      System.out.println("Press 2 to get politics");
      System.out.println("Press 3 to get sports");
      System.out.println("Press 4 to get names of Party Members");
      System.out.println("Press 5 to exit");
      Scanner code= new Scanner(System.in);
      number= code.nextInt();
  		FileReader fr = new FileReader("names.txt");
  		Scanner fileScanner = new Scanner(fr);
      
      switch(number){
        case 1:
          System.out.println("Today will be sunny");
          break;
        case 2:
          System.out.println("Senator involved in a scandal");
          break;
        case 3:
          System.out.println("MLS is not a retirement league says David Beckham");
          break;
        case 4:
          while (fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
          }
      }
    } while (number!=5);
		
	}
}