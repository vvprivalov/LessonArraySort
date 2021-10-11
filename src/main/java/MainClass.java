import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        int start;

        Notebook[] arrayNoteBook = createArrayNotebook();

        start = (int) System.currentTimeMillis();
        Arrays.sort(arrayNoteBook);
//        TypeSort.insertionSort(arrayNoteBook);
//        TypeSort.bubbleSort(arrayNoteBook);
//        TypeSort.selectionSort(arrayNoteBook);

        System.out.println((int)System.currentTimeMillis() - start);

        // В общем, сортировка пузырьком в данном случае оказалась самой медленной!!! 11 секунд.
        // Встроенная самая быстрая!!!!!!!!!! 62 милисекунды

//        for (int i = 0; i < arrayNoteBook.length; i++) {
//            System.out.println(arrayNoteBook[i]);
//        }

    }

    private static Notebook[] createArrayNotebook() {
        Notebook[] arrayNotebook = new Notebook[10000];

        for (int i = 0; i < arrayNotebook.length; i++) {
            arrayNotebook[i] = createNotebook();
        }
        return arrayNotebook;
    }

    private static Notebook createNotebook() {
        Random random = new Random();
        BigDecimal price = BigDecimal.valueOf(random.nextInt(31) * 50 + 500);
        int memory = (random.nextInt(6) + 1) * 4;
        int manufactorerCount = Notebook.Manufacturer.values().length;
        Notebook.Manufacturer manufacturer = Notebook.Manufacturer.values()[random.nextInt(manufactorerCount)];

        return new Notebook(price, memory, manufacturer);
    }


}
