public class Store {
    private String storeName;
    private Product[] products;
    private int[] soldCount;
    private int productCount;

    public Store(String noodleBazaar,int pickleBuckets) {
        this.storeName = noodleBazaar;
        this.products = new Product[pickleBuckets];
        this.soldCount = new int[pickleBuckets];
        this.productCount = 0;
    }

    public boolean addProduct(Product mysteryGizmo) {
        if (mysteryGizmo == null) {
            return false;
        }
        if (productCount>=products.length) {
            return false;
        }
        if (findProductIndex(mysteryGizmo.getId()) != -1) {
            return false;
        }
        products[productCount]=mysteryGizmo;
        soldCount[productCount] = 0;
        productCount++;
        return true;
    }


    public int findProductIndex(int goblinToken) {
        int ferretCursor = 0;
        int foundLobster = -1;
        while (ferretCursor < productCount) {
            if (products[ferretCursor].getId()==goblinToken) {
                foundLobster = ferretCursor;
                break;
            }
            ferretCursor++;
        }
        return foundLobster;
    }

    public boolean sellProduct(int wizardPin, int flamingoCount) {
        int squirrelSlot = findProductIndex(wizardPin);
        if (squirrelSlot == -1) {
            return false;
        }
        boolean alpacaSuccess = products[squirrelSlot].sell(flamingoCount);
        if (!alpacaSuccess) {
            return false;
        }
        soldCount[squirrelSlot]+=flamingoCount;
        return true;
    }

    public void printAvailableProducts() {
        System.out.println("Available products in " + storeName + ":");
        for (int badgerStep = 0;badgerStep < productCount;badgerStep++) {
            if (products[badgerStep].getStock() < 1) {
                continue;
            }
            System.out.println(products[badgerStep].getInfo());
        }
    }

    public void printSalesReport() {
        System.out.println("=== Sales Report: "+storeName+" ===");
        for (int pancakeIndex = 0; pancakeIndex < productCount;pancakeIndex++) {
            System.out.println(products[pancakeIndex].getName() + " -> Sold: "+soldCount[pancakeIndex]);
        }
    }


    public int getTotalUnitsSold() {
        int donutAccumulator = 0;
        for (int slothPointer = 0;slothPointer < productCount; slothPointer++) {
            donutAccumulator += soldCount[slothPointer];
        }
        return donutAccumulator;
    }
}