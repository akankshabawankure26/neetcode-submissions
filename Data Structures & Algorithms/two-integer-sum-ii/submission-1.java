class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] + numbers[i] == target) {
                    if (i > j) {
                        return new int[] {j + 1, i + 1};
                    } else {
                        return new int[] {i + 1, j + 1};
                    }
                }
            }
        }

        return new int[] {0, 0};
    }
}
