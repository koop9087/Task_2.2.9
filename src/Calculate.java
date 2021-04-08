public class Calculate {
    public static int[] calculateSum(int[][] array) {
        int count = 0;
        int[] mas = new int[array.length];
        int k = 0;
        for(int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                count = count + array[i][j];
            }
            mas[k] = count;
            count = 0;
            k++;
        }
        return mas;
    }

    public static int findMaxVlaueOfArray(int[] mas) {
        int maxValue = mas[0];
        for(int i = 0, k = 0; i < mas.length && k < mas.length; i++) {
            if(mas[k] > maxValue) {
                maxValue = mas[i];
            }
            k++;
        }
        return maxValue;
    }

    public static int findNumOfElemOfArray(int[] mas, int maxValue) {
        int searchedElem = 0;
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] == maxValue) {
                searchedElem = i + 1;
            }
        }
        return searchedElem;
    }
}
