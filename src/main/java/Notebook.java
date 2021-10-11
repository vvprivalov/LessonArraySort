import java.math.BigDecimal;

public class Notebook implements Comparable<Notebook> {
    private BigDecimal price;
    private int memory;
    private Manufacturer manufacturer;

    public Notebook(BigDecimal price, int memory, Manufacturer manufacturer) {
        this.price = price;
        this.memory = memory;
        this.manufacturer = manufacturer;
    }

    public enum Manufacturer {
        LENUVO, ASOS, MACNOTE, ESER, XAMIOU
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public Manufacturer getName() {
        return manufacturer;
    }

    @Override
    public int compareTo(Notebook otherNotebook) {
        int result = price.compareTo(otherNotebook.price);
        if (result == 0) {
            result = Integer.compare(memory, otherNotebook.memory);
            if (result == 0) {
                return manufacturer.compareTo(otherNotebook.manufacturer);
            }
            return result;
        }
        return result;
    }
}
