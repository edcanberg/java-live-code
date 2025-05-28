package week_01;

public class task_01 {
    public static void main(String[] args) {

        String sentence = "Java is funny";

        String longestWord = findLongestWordInSentence(sentence);

        System.out.println(longestWord);
    }

    private static String findLongestWordInSentence(String sentence) {

        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String eachWord : words) {

            if (eachWord.length()>longestWord.length()) {
                longestWord=eachWord;
            }


        }

        return longestWord;
    }

}