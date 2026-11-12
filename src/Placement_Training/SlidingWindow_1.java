package Placement_Training;
//Fixed Window Size
public class SlidingWindow_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -5, 6, -9, 3, 10, 4, 5, 9};
        int k = 3;
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0; i < k; i++) {
            curr += arr[i];
        }
        max = curr;
        for(int i = k; i < arr.length; i++) {
            curr += arr[i] - arr[i - k];
            max = Math.max(curr, max);
        }
        System.out.println(max);
    }
}

/*
arr = [1, 2, -5, 6, -9, 3, 10, 4, 5, 9]
k = 3
max = float(-inf)
for i in range(0, len(arr)):
    curr = curr + arr[i]
max = curr
for i in range(k, len(arr)):
    curr = curr + arr[i] - arr[i - k]
    max = max(curr, max)
print(max)
*/
