public class TypeSort {


    // метод осуществляющий сортировку массива ноутбуков пузырьком
    public static void bubbleSort(Notebook[] array) {
        boolean sorted = false;
        Notebook temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    // метод осуществляющий сортировку массива ноутбуков вставкой
    public static void insertionSort(Notebook[] array) {
        for (int i = 1; i < array.length; i++) {
            Notebook current = array[i];
            int j = i - 1;
            while (j >= 0 && current.compareTo(array[j]) < 0 ) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    // метод осуществляющий сортировку массива ноутбуков выбором
    public static void selectionSort(Notebook[] array) {
        for (int i = 0; i < array.length; i++) {
            Notebook min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] < min) {
                if (array[j].compareTo(min) < 0) {
                    min = array[j];
                    minId = j;
                }
            }
            Notebook temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}
