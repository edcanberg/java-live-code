package week_01;

public class task_01 {
    public static void main(String[] args) {
        
         /*This program is designed to find the longest word in a sentence.
        Given sentence: "Java is funny"
        Goal: Find the longest word in that sentence (in this case, "funny").
         */

        String sentence = "Java is funny";

        String longestWord = findLongestWordInSentence(sentence);

        System.out.println(longestWord);
        /*
        A variable sentence is created and assigned the value "Java is funny".
        The method findLongestWordInSentence(sentence) is called and given the sentence.
        This method finds and returns the longest word (but right now it doesn't print it).
         */
    }

    private static String findLongestWordInSentence(String sentence) {

        String[] words = sentence.split(" ");
        /*
        String[] words = sentence.split(" "); -----> This line splits the sentence into individual words.
        "Java is funny" becomes ["Java", "is", "funny"]  
        */
        String longestWord = "";
        //This variable will hold the longest word found so far.
        //Initially set to an empty string.
        for (String eachWord : words) {

            if (eachWord.length()>longestWord.length()) {
                longestWord=eachWord;
            }


        }

        return longestWord;
    }
        //test
}

