import java.math.BigDecimal;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {

        Notebook[] arrayNoteBook = createArrayNotebook();


    }

    private static Notebook[] createArrayNotebook() {
        Notebook[] arrayNotebook = new Notebook[5000];

        for (int i = 0; i < arrayNotebook.length; i++) {
            arrayNotebook[i] = createNotebook();
        }
        return arrayNotebook;
    }

    private static Notebook createNotebook() {
        Random random = new Random();
        BigDecimal price = BigDecimal.valueOf(random.nextInt(26) * 100 +500);
        int memory = (random.nextInt(4) + 1) * 4;
        int manufactorerCount = Notebook.Manufacturer.values().length;
        Notebook.Manufacturer manufacturer = Notebook.Manufacturer.values()[random.nextInt(manufactorerCount+1)];

        return new Notebook(price, memory, manufacturer);
    }


}
