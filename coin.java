
public class Coin {

    // Doesn't work yet
    static boolean repeated(int value, int k) {
        return (k % value == 0);
    }

    static boolean checkCompliment(int[] arr, int idx, int k) {
        int sum = arr[idx];
        for (int i = idx + 1; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                return true;
            } else if (sum > k) {
                return false;
            } else {
                continue;
            }
        }
        return false;
    }

    static int findCombinations(int[] coinArr, int k) {
        int nCombinations = 0;
        for (int i = 0; i < coinArr.length; i++) {
            if (repeated(coinArr[i], k)) {
                nCombinations += 1;
            }
            if (checkCompliment(coinArr, i, k) == true) {
                nCombinations += 1;
            }
        }
        return nCombinations;
    }

    public static void main(String[] args) {
        int[] coinArr = {1, 2, 3};
        System.out.println(findCombinations(coinArr, 6));
    }
}
