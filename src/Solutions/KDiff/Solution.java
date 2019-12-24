package Solutions.KDiff;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0)
            return  0;
        Arrays.sort(nums);
        if(k == 0) {
            int ans = 0;
            for(int i = 0 ; i-1 < nums.length ;) {
                int j = i;
                while(j+1 < nums.length && nums[j] == nums[j+1]) {
                    j++;
                }
                if(i != j) {
                    ans++;
                }
                i=(j+1);
            }
            return ans;
        }
        else {
            Set<Integer> hash_Set = new HashSet<Integer>();
            for(Integer num:nums) {
                hash_Set.add(num);
            }
            int n = hash_Set.size();
            int arr[] = new int[n];
            int i = 0;
            for(Integer inte : hash_Set) {
                arr[i++] = inte;
            }
            Arrays.sort(arr);
            int first = 0;
            int second = 1;
            int count = 0;
            while(first < arr.length && second < arr.length) {
                int diff =  arr[second] - arr[first];
                if(diff > k) {
                    first++;
                }
                else if(diff == k ) {
                    count++;
                    second++;
                }
                else {
                    second++;
                }
            }
            return count;

        }
    }
}
