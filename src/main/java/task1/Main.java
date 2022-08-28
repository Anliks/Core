package task1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        int[][] array = new int[5][5];
        //Заполняем массив числами от 0 до 50.
        main.addElements(array);

        Arrays.stream(array).forEach(arr -> System.out.println(Arrays.toString(arr)));

        int[] result = main.minMaxAvgElement(array);
        System.out.println("Minimum value = " + result[0] + "\n" + "Maximum value = " + result[1] + "\n" + "Average value = " + result[2]);
    }

    public int[][] addElements(int[][] array) {
        CustomRandom customRandom = new CustomRandom(50);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = customRandom.nextInt();
            }
        }
        return array;
    }


    public int[] minMaxAvgElement(int[][] array) {
        int min = array[0][0];
        int max = 0;
        int sum = 0;
        int lengthArray = Stream.of(array).mapToInt(m -> m.length).sum();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                sum += array[i][j];
            }
        }
        return new int[]{min, max, sum / lengthArray};
    }


    //Класс Генерации Случайных чисел
    class CustomRandom {
        private final int max;
        private int last;

        public CustomRandom(int max) {
            this.max = max;
            last = (int) (System.currentTimeMillis() % max);
        }

        public int nextInt() {
            last = (last * 1219 + 3) % 1049;
            return last % max;
        }
    }
}

