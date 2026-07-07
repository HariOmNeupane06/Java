public class CountBS {
    public static void main(String[] args) {
        // Binary Search using recursive call

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 80;

        int ans = search(arr, target, 0, arr.length - 1);

        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return search(arr, target, s, mid - 1);
        }

        return search(arr, target, mid + 1, e);
    }
}