package Solutions.flipanimage;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] array : A) {
            reverse(array);
        }
        for(int[] array : A) {
            invert(array);
        }
        return A;
    }

    private void invert(int[] array) {
        for(int i = 0 ; i < array.length ; i++) {
            array[i] = 1- array[i];
        }
    }

    void reverse(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n/2 ; i++) {
            int swap = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]=swap;
        }
    }
}
