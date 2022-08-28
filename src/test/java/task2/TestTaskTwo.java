package task2;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;



public class TestTaskTwo {
    TaskTwo taskTwo = new TaskTwo();

    private int[][] samplesArrays() {
        int[][] samples = new int[8][];
        samples[0] = new int[]{1};
        samples[1] = new int[]{2, 1};
        samples[2] = new int[]{1, 1, 1};
        samples[3] = new int[]{2, -1, 3, 3};
        samples[4] = new int[]{4, -5, 3, 3};
        samples[5] = new int[]{0, -5, 3, 0};
        samples[6] = new int[]{3, 2, 5, 5, 5, 1};
        samples[7] = new int[]{5, 6, 3, 2, 5, 1, 4, 9};

        return samples;
    }

    public void printTest(int[] array) {
        System.out.println(Arrays.toString(array) + "\n" + "----------");
    }

    @Test
    public void insertionSortTest() {
        System.out.println("---------------Вывод--------------");
        for (var sample : samplesArrays()) {
            int[] actual = sample.clone();
            Arrays.sort(actual);
            printTest(actual);
            taskTwo.insertionSort(sample);
            printTest(sample);
            System.out.println("\n");
            assertArrayEquals(sample, actual);

        }
    }

    @Test
    public void bubbleSortTest() {
        System.out.println("---------------Вывод--------------");
        for (var sample : samplesArrays()) {
            int[] actual = sample.clone();
            Arrays.sort(actual);
            printTest(actual);
            taskTwo.bubbleSort(sample);
            printTest(sample);
            System.out.println("\n");
            assertArrayEquals(sample, actual);
        }
    }

    @Test
    public void selectionsSortTest() {
        System.out.println("---------------Вывод--------------");
        for (var sample : samplesArrays()) {
            int[] actual = sample.clone();
            Arrays.sort(actual);
            printTest(actual);
            taskTwo.selectionSort(sample);
            printTest(sample);
            System.out.println("\n");
            assertArrayEquals(sample, actual);
        }
    }
}
