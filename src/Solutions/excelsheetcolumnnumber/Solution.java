package Solutions.excelsheetcolumnnumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int titleToNumber(String s) {
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        for(int i = 0 ; i <26 ;++i ) {
            char ch = (char) ('A' + i);
            characterIntegerMap.put(ch,i+1);
        }
        int columnNumber = 0;
        for (int i = 0 ; i < s.length() ; ++i) {
            columnNumber = columnNumber*26 + characterIntegerMap.get(s.charAt(i));
        }
        return columnNumber;
    }
}
