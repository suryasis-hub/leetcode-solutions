package Solutions.reversewords;

public class Solution {
    public String reverseWords(String s) {
       String[] arrayOfWords = s.split("\\s+");
       StringBuilder stringBuilder = new StringBuilder();
       for(int i = arrayOfWords.length-1 ; i >=0 ; i--) {
           stringBuilder.append(arrayOfWords[i]);
           stringBuilder.append(" ");
       }
       stringBuilder.deleteCharAt(stringBuilder.length()-1);
       return stringBuilder.toString();
    }
}
