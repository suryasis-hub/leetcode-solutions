package Solutions.OneBitTwoBit;
/*
Since the string of bits is always valid, if bits[index] == 0 it means that the next digit is 1 and we sort of delegate this to the next index by incrementing by 1.
if bits[i] == 1 then this has to be a two bit character so increment by 2.
Check if we have to process the last bit.
 */
public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
         int index = 0;
         while(index < bits.length-1) {
             if(bits[index] == 0)
                 index++;
             else
                 index+=2;
         }
         return (index == bits.length -1);
    }
}
