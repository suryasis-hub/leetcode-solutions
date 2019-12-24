package Solutions.EvenDigits;
/*
     (Math.log10(num)+1) gives the number of digits in an integer. Iterate over each number and add.
 */

public class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            if(getNumberOfDigitsEven(num))
                sum++;
        }
        return  sum;
    }
    boolean getNumberOfDigitsEven(int num) {
        int lengthOfDigit = (int) (Math.log10(num)+1);
        return (lengthOfDigit %2 ==0);
    }
}
