package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

    

    public Application() {

        System.out.println ("Inside Application");

    }

	public void greet()
	{
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		greetings.add("Hello*o&o*o&o*o....!");
		
		for(String str: greetings){
			System.out.println("Greetings: " + str);
		}
	}
	
	public int countWords(String words){
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null)? 0 : separateWords.length;
	}
	
	
    // method main(): ALWAYS the APPLICATION entry point

    public static void main (String[] args) {

    	System.out.println ("Starting Application");

		Application app = new Application();
		app.greet();
		String testString = "I have four words";
		System.out.println("Word count of '" + testString + "' is " + app.countWords(testString));
    }

}