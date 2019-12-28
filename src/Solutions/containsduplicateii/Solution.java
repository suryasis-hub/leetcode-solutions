package Solutions.containsduplicateii;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        int i = 0;
        for(int num:nums) {
            if(hashMap.containsKey(num) && hashMap.get(num).intValue() >= i-k) {
                return true;
            }
            else {
                hashMap.put(num,i);
            }
            i++;
        }
        return  false;
    }
}
