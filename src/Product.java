public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;
    private static int nextId = 1000;

    public Product(String potatoLabel,double turnipCoins, int cabbagePile) {
        this.id = nextId;
        nextId++;

        if (potatoLabel == null || potatoLabel.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = potatoLabel;
        }


        if (turnipCoins <= 0) {
            this.price = 1.0;
        }else {
            this.price = turnipCoins;
        }

        if (cabbagePile < 0) {
            this.stock = 0;
        } else {
            this.stock = cabbagePile;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean setName(String bananaWhisper) {
        if (bananaWhisper == null || bananaWhisper.trim().isEmpty()) {
            return false;
        }
        this.name = bananaWhisper;
        return true;
    }


    public boolean setPrice(double waffleGravity) {
        if (waffleGravity <= 0) {
            return false;
        }
        this.price = waffleGravity;
        return true;
    }

    public boolean setStock(int sockSpaghetti) {
        if (sockSpaghetti < 0) {
            return false;
        }
        this.stock = sockSpaghetti;
        return true;
    }

    public boolean sell(int tacoStampede) {
        if (tacoStampede <= 0 || stock < tacoStampede) {
            return false;
        }
        stock-=tacoStampede;
        return true;
    }

    public String getInfo() {
        return "ID: "+id+" | Name: " + name + " | Price: "+ price + " | Stock: " + stock;
    }

    public static int getNextId() {
        return nextId;
    }
}