import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;

public class WPMProjectgithub1 {
	
	static String words[]= {"elephant", "mouse","ant","monkey","dolphin","dog", "cat", "parrot","lion","snake"}; 
	//the word static makes it accessible to all instances of the class

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		Random random=new Random();//creating the random number generator
		
		for (int i=0;i<10;i++) {
			
		System.out.print(words[random.nextInt(9)]+ " ");
		}
		System.out.println();
		
		double start =LocalTime.now().toNanoOfDay();
		
		Scanner scanner=new Scanner(System.in);
		String typedWords=scanner.nextLine();
		
		//System.out.println(typedWords);
		double end=LocalTime.now().toNanoOfDay();
		
		double elapsedTime=end-start;
		double seconds=elapsedTime/1000000000.0; //since it was in nanosec
		int numChar=typedWords.length();
		
		//words per minute formula
		//wpm= (all typed words/5)/time(min)
		int wpm =(int) (((numChar/5.0)/seconds)*60);
		System.out.println("Your wpm: "+wpm);
		
		
		
		
		
	}

}
