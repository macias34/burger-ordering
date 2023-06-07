public class Drink extends Product {
    private String size;

    public Drink(String type, String size) {
        super(type, -1);
        setSize(size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        char sizeChar = size.toUpperCase().charAt(0);

        switch (sizeChar) {
            case 'S' -> setPrice(5.50);
            case 'M' -> setPrice(7.00);
            case 'L' -> setPrice(8.00);
            default -> setPrice(-1);
        }

    }

}
