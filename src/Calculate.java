public class Calculate {
    public static int[] calculateSum(int[][] array) {
        int[] mas = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            int sum = 0;
            for (int i = 0; i < array[j].length; i++) {
                sum = sum + array[i][j];
            }
            mas[j] = sum;
        }
        return mas;
    }

    public static int findMaxValueOfArray(int[] mas) {
        int maxValue = mas[0];
        for (int i = 0, k = 0; i < mas.length && k < mas.length; i++, k++) {
            if (mas[k] > maxValue) {
                maxValue = mas[i];
            }
        }
        return maxValue;
    }

    public static int findIndexOfElementOfArray(int[] mas, int maxValue) {
        int searchedElemIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == maxValue) {
                searchedElemIndex = i + 1;
                break;
            }
        }
        return searchedElemIndex;
    }
}
