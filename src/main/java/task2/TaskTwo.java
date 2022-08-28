package task2;

import java.util.Arrays;

public class TaskTwo {
    private int[] array = {5, 6, 3, 2, 5, 1, 4, 9};

    public static void main(String[] args) {
        TaskTwo taskOne = new TaskTwo();
        TaskTwo taskTwo = new TaskTwo();
        TaskTwo taskThree = new TaskTwo();


        taskOne.insertionSort(taskOne.array);

        System.out.println(Arrays.toString(taskOne.array) + " " + " insertionSort");

        taskTwo.bubbleSort(taskTwo.array);

        System.out.println(Arrays.toString(taskTwo.array) + " " + " bubbleSort");

        taskThree.selectionSort(taskThree.array);

        System.out.println(Arrays.toString(taskThree.array) + " " + " selectionSort");

    }

    /*
     * Соритровка вставками
     * устойчивый(Stable) "дубли на местах"
     * O(N²) квадратичная
     * in-place алгоритм
     *  */
    public void insertionSort(int[] array) {
        for (int index = 1; index < array.length; index++) {
            int unsorted = array[index];
            int i = 0;
            for (i = index; i > 0 && array[i - 1] > unsorted; i--) {
                array[i] = array[i - 1];
            }
            array[i] = unsorted;
        }
    }

    /*
     * Соритровка пузырьком
     * устойчивый(Stable) "дубли на местах"
     * O(N²) квадратичная
     * in-place алгоритм
     *  */
    public void bubbleSort(int[] array) {
        for (int index = array.length - 1; index > 0; index--) {
            for (int i = 0; i < index; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    /*
     * Соритровка выборкой
     * Нестабильный
     * O(N²) квадратичная
     * in-place алгоритм
     *  */
    public void selectionSort(int[] array) {
        for (int index = array.length - 1; index > 0; index--) {
            int maxElement = 0;
            for (int i = 1; i <= index; i++) {
                if (array[i] > array[maxElement]) {
                    maxElement = i;
                }
            }
            swap(array, maxElement, index);
        }
    }

    public void swap(int[] array, int i, int j) {
        if (i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
