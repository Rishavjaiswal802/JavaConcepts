package allAboutThreads;
//Q: Write a function to print a sentence in reverse order word by word, vowels should be removed from the word. For example:
// Input:    	Programming is my passion since childhood
// Output: 	     gnmmrgrP s ym nssp cns dhdlhc
public class Test {
    public static void main(String[] args) {
        String string = "Programming is my passion since childhood";
        reverseWord(string);
    }

    private static void reverseWord(String string) {

        string = string.replaceAll("[AEIOUaeiou]", "");
        String[] strArr = string.split(" ");
        StringBuilder[] stringBuilder = new StringBuilder[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            stringBuilder[i]= new StringBuilder(strArr[i]);
            System.out.print(stringBuilder[i].reverse() + " ");
        }

        


    }
}
