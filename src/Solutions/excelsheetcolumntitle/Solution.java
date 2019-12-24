package Solutions.excelsheetcolumntitle;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String convertToTitle(int n) {
        String title = "";
        Map<Integer,Character> integerCharacterMap = new HashMap<>();
        for(int i = 0 ; i < 26 ; i++) {
            char ch = (char) ('A' + i);
            integerCharacterMap.put(i,ch);
        }
        while (n > 0) {
            int dig = n%26;
            dig = (26 + dig -1)%26;
            title = integerCharacterMap.get(dig) + title;
            n=(n-1)/26;
        }
        return  title;
    }
}
