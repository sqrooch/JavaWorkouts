package usr.sqrooch.year2022;

public class SpinWords
{
    /**
     * Takes in a string of one or more words, and returns the same string,
     * but with all five or more letter words reversed.
     * Strings passed in will consist of only letters and spaces.
     * Spaces will be included only when more than one word is present.
     *
     * @param sentence input sentence.
     * @return String, with all five or more letter words reversed.
     */
    public String spinWords(String sentence)
    {
        String[] wordsBox = sentence.split(" ");
        for (int i = 0; i < wordsBox.length; i++)
        {
            if (wordsBox[i].length() >= 5)
            {
                wordsBox[i] = new StringBuilder(wordsBox[i]).reverse().toString();
            }
        }
        return String.join(" ", wordsBox);
    }
}
