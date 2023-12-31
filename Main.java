import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
     Scanner code= new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<>();
    int number=0;
    do{
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");
     
      number= code.nextInt();
  		FileReader fr = new FileReader("names.txt");
  		Scanner fileScanner = new Scanner(fr);
      // feedback
      switch(number){
        case 1:
          System.out.println("$98,345 average salary in South Florida!");
          break;
        case 2:
          System.out.println("US News - 100 Best Jobs!");
          break;
        case 3:
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;
        case 4:
          System.out.println("Current Students:");
          while (fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
          }
      }

    } while (number!=5);
		code.close();
	}
}