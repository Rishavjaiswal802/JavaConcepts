package allAboutArrays;

class ModifiedCaesarCipher {

    public static String performOperations(String input, int[][] operations) {
        char[] chars = input.toCharArray();

        for (int[] operation : operations) {
            int type = operation[0];
            int i = operation[1] - 1;
            int j = operation[2] - 1;

            if (type == 1) {
                rollForward(chars, i, j);
            } else if (type == 2) {
                rollBackward(chars, i, j);
            }
        }

        return new String(chars);
    }

    private static void rollForward(char[] chars, int start, int end) {
        for (int i = start; i <= end; i++) {
            chars[i] = (char) ((chars[i] - 'a' + 1) % 26 + 'a');
        }
    }

    private static void rollBackward(char[] chars, int start, int end) {
        for (int i = start; i <= end; i++) {
            chars[i] = (char) ((chars[i] - 'a' - 1 + 26) % 26 + 'a');
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        int[][] operations = {
                {1, 1, 2},
                {2, 1, 2}
        };

        String result = performOperations(input, operations);
        System.out.println(result);
    }
}