package Solutions.specialequivalent;

import java.util.*;

public class Solution {
    private  String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public int numSpecialEquivGroups(String[] A) {
        Set<String> stringSet = new HashSet<>();
        for(String string : A) {
            StringBuilder oddStringBuilder = new StringBuilder();
            StringBuilder evenStringBuilder = new StringBuilder();
            String odd = "";
            String even = "";
            for(int i = 0 ; i < string.length(); ++i) {
                if(i%2 == 0)
                    oddStringBuilder.append(string.charAt(i));
                else
                    evenStringBuilder.append(string.charAt(i));
                odd = sortString(oddStringBuilder.toString());
                even = sortString(evenStringBuilder.toString());
            }
            String result = odd + ":" + even;
            stringSet.add(result);
        }
        return stringSet.size();
    }
}
