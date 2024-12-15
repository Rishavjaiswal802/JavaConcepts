package allAboutArrays;

public class Temp {
        // Method to remove vowels from a word
        public static String removeVowels(String word) {
            return word.replaceAll("[AEIOUaeiou]", "");
        }

        // Method to reverse the sentence and remove vowels
        public static void reverseSentence(String sentence) {
            // Split the sentence into words
            String[] words = sentence.split(" ");

            // Traverse the words array in reverse order
            for (int i = words.length - 1; i >= 0; i--) {
                // Remove vowels from the current word and print it
                System.out.print(removeVowels(words[i]) + " ");
            }
        }

        public static void main(String[] args) {
            String input = "Programming is my passion since childhood";
            reverseSentence(input);  // Output: gnmmrgrP s ym nssp cns dhdlhc
        }
    }


//    private static String reverse(String str) {
//
//        String[] strArr = str.split(" ");//[Programming is my passion since childhood]
//        String temp = "";
//        String reversed = null;
//        for (int i = 0; i < strArr.length; i++) {
//            for (int j =strArr[i].length() ; j>=0; j--)
//                if (strArr[i].charAt(j) == 'A' || strArr[i].charAt(j) == 'A' || strArr[i].charAt(j) == 'E' || strArr[i].charAt(j) == 'I' || strArr[i].charAt(j) == 'O' || strArr[i].charAt(j) == 'U' || strArr[i].charAt(j) == 'a' || strArr[i].charAt(j) == 'e' || strArr[i].charAt(j) == 'i' || strArr[i].charAt(j) == 'o' || strArr[i].charAt(j) == 'u') {
//                    continue;
//                } else {
//                    temp += strArr[i].charAt(j);
//
//                }
////            StringBuilder sb = new StringBuilder(temp);
////            reversed = sb.reverse().toString();
//
//
//        }
//        return temp;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(reverse("Programming is my passion since childhood"));
//
//
//    }
//gnmmrgrP s ym nssp cns dhdlhc