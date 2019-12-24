package Solutions.intersectionarraytwo;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i = 0 ; i < nums1.length ; i++) {
            arr1.add(nums1[i]);
        }
        for(int i = 0 ; i < nums2.length ; i++) {
            arr2.add(nums2[i]);
        }
        Collections.sort(arr1);
        Collections.sort(arr2);
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            }
            else if(arr1.get(i) > arr2.get(j)) {
                j++;

            } else {
                arrayList.add(arr1.get(j));
                i++;
                j++;
            }
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}
