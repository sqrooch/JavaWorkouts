/*
Написать метод, который разбивает верблюжий регистр, с помощью пробелов.
Например:
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
 */

package usr.sqrooch.year2023;

public class BreakCamelCase
{
    /**
     * Разбивает верблюжий регистр, с помощью пробелов.
     * Например:
     * "camelCasing"  =>  "camel Casing"
     * @param input входящая строка.
     * @return возвращает строку, разбитую пробелами.
     */
    public static String camelCase(String input)
    {
        if (input.length() > 0)
        {
            StringBuilder resultStr = new StringBuilder();
            resultStr.append(input.charAt(0));
            for (int i = 1; i < input.length(); i++)
            {
                if (Character.isUpperCase(input.charAt(i)) && (input.charAt(i-1) != ' ')) resultStr.append(' ');
                resultStr.append(input.charAt(i));
            }
            return resultStr.toString();
        }else return "";
    }

    /*
    Best practice:
    public static String camelCase(String input)
     {
         return input.replaceAll("([A-Z])", " $1");
     }
    */
}
