public class Main {
    public static void main(String[] args) {
        int size = CustomScanner.scanInt();
        int[][] array = new int[size][size];
        int[] mainArray = new int[array.length];
        Filler.filler(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d\t", array[i][j]);
            }
            System.out.println();
        }
        mainArray = Calculate.calculateSum(array);
        int maxValue = Calculate.findMaxVlaueOfArray(mainArray);
        System.out.println(Calculate.findNumOfElemOfArray(mainArray,maxValue));

    }
}