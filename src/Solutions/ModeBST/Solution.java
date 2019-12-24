package Solutions.ModeBST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<>();
        markElementsInTree(root,map);
        int maxFreq = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            maxFreq = Math.max(maxFreq,entry.getValue());
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(maxFreq == entry.getValue())
                arrayList.add(entry.getKey());
        }
        int[] arr = arrayList.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    private void markElementsInTree(TreeNode root, Map<Integer, Integer> map) {
        if(root == null) {
            return;
        }
        markElementsInTree(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        markElementsInTree(root.right,map);
    }
}
