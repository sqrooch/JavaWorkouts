package usr.sqrooch.year2022;

public class Vowels
{
    /**
     * Принимает строку и возвращает из неё массив гласных ASCII.
     *
     * @param str входящая строка.
     * @return Возвращает массив гласных ASCII.
     */
    public char[] vowelsFromString(String str)
    {
        StringBuilder strBox = new StringBuilder(str);
        StringBuilder vowels = new StringBuilder();

        for (int i = 0; i < strBox.length(); i++)
        {
            if (strBox.substring(i, i + 1).matches("[aeiouyAEIOUY]"))
            {
                vowels.append(strBox.substring(i, i + 1));
            }
        }
        return vowels.toString().toCharArray();
    }
}
