package sort;

public class BubbleSort implements Sorter {
    private static int[] numberArray;

    @Override
    public int[] sortArray(int[] inputArray) {
        BubbleSort.numberArray = inputArray;

        boolean booleanFlag = true;
        int loopEnd = inputArray.length - 1;

        if (inputArray == null || inputArray.length == 0) {
            throw new IllegalArgumentException("why u passing me an empty array, are u done out?");
        }
        whileLoop:
        while (booleanFlag) {
            for (int i = 0; i < loopEnd; i++) {
                if (BubbleSort.numberArray[i] > BubbleSort.numberArray[i + 1]) {
                    booleanFlag = false;
                    swapElements(i);
                }
            }
            if (booleanFlag = true) {
                break whileLoop;
            }
            loopEnd--;
        }
        return numberArray;
    }

    private static void swapElements(int index) {
        int temp = BubbleSort.numberArray[index];
        BubbleSort.numberArray[index] = BubbleSort.numberArray[index + 1];
        BubbleSort.numberArray[index + 1] = temp;

    }



}
