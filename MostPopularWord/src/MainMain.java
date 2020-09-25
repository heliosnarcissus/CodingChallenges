import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "1st day of F##king Christma$ red red red blue blue";
		String celebrity =  getPopularWord(sentence);
		System.out.println("the popular word is:" +  celebrity);
	}
	
	private static String getPopularWord(String str) {
		
		/** 1.use String split() to convert sentence into an array which contains words by using 'white spaces' to define 'what a word is',
			\\s+ is regex for 'white space'. Here we say, anything between a 'white space' is a word. **/
		String[] words = str.split("\\s+"); 
		
		/** 2. String[] 'words' now contains an array of words. Now we dont want any word that contains 'special characters' and 'numbers'
		 * So, we create a boolean function to enforce that. We'll call it isValidWord(String str) **/
		List<String> validWords = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {		
			 if(isValidWord(words[i])) {
				 validWords.add(words[i]);
			 }	
		}
		
		/** 3. Time to count the number of occurrences to determine the most popular word. For this, we use HashMaps. The map get(key) function
		 * 	   asks you to provide the key, so it can return the value. If there is no current mapping for the 'key', it returns NULL.
		 * 	   Also, duplicate keys are not allowed in Java Maps, hence perfect for counting number of occurrences (thru values).**/
		Map<String, Integer> occurrences = new HashMap<>();
		for(String word: validWords) {
			Integer ctr = occurrences.get(word);
			if(ctr == null) {
				ctr = 0;
			}
				
			
			occurrences.put(word, ++ctr);
		}
		
		System.out.println(occurrences);
		
		/** 4. Now, our map named 'occurrences' contains the words (key) and the number of times they were used (value) in a format like 'Key = red, Value = 10'.
		 * 	   Time to fetch the most popular word by comparing the keys and their corresponding values. To do this, we need to traverse the Java Map.
		 * 	   The easiest way to do this is to use entrySet().**/
		Integer maxCount = 0;
		Integer valueOfKey = 0;
		String  popularWord = "";
		for(Map.Entry<String, Integer> entry: occurrences.entrySet()) {
			
			valueOfKey = occurrences.get(entry.getKey());
			if(valueOfKey > maxCount){
				maxCount = valueOfKey;
				popularWord = entry.getKey(); 
			}
		}
		
		return popularWord;
	}
	//We only want word with lowercase or uppercase letters
	private static boolean isValidWord(String str) {
		return str.matches("^[a-zA-Z]*$");
	}

}
