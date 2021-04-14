package kyu7;

/*
   Your task is to add up letters to one letter.

   The function will be given an array of single character Strings, each one being a letter to add.

   Notes:
   Letters will always be lowercase.
   Letters can overflow (see second to last example of the description)
   If no letters are given, the function should return 'z'
   Examples:
   addLetters("a", "b", "c") = "f"
   addLetters("a", "b") = "c"
   addLetters("z") = "z"
   addLetters("z", "a") = "a"
   addLetters("y", "c", "b") = "d" // notice the letters overflowing
   addLetters() = "z"
*/

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabeticalAddition {
    public static void main(String[] args) {
        alphabeticalAddition("y", "c", "b");
    }

    public static String alphabeticalAddition(String... letters) {
        String[] given = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int resultPosition = given.length;

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < given.length; j++) {

                if (given[j].equals(letters[i])) {

                    resultPosition = resultPosition + j + 1;
                    if (resultPosition > given.length) {
                        resultPosition = resultPosition - given.length;
                    }
                }
            }
        }
        System.out.println(given[resultPosition - 1]);
        return given[resultPosition - 1];
    }

    @Test
    public void fixedTests() {
        assertEquals("f", alphabeticalAddition("a", "b", "c"));
        assertEquals("z", alphabeticalAddition("z"));
        assertEquals("c", alphabeticalAddition("a", "b"));
        assertEquals("c", alphabeticalAddition("c"));
        assertEquals("a", alphabeticalAddition("z", "a"));
        assertEquals("d", alphabeticalAddition("y", "c", "b"));
        assertEquals("z", alphabeticalAddition());
    }
}

