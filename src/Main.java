public class Main {
    public static void main(String[] args) {
        Store quirkyMart = new Store("Quirky Mart",3);

        Product itemAlpha = new Product("Notebook", 12.5,3);
        Product itemBeta = new Product("Pen",4.0, 2);
        Product itemGamma = new Product("Bottle", 30.0,0);


        boolean addedAlpha = quirkyMart.addProduct(itemAlpha);
        boolean addedBeta = quirkyMart.addProduct(itemBeta);
        boolean addedGamma = quirkyMart.addProduct(itemGamma);
        System.out.println("Add Notebook: " + addedAlpha + ", Add Pen: "+addedBeta+", Add Bottle: " + addedGamma);

        Product itemDelta = new Product("Stapler",15.0, 5);
        boolean addedDelta = quirkyMart.addProduct(itemDelta);
        System.out.println("Add 4th product (Stapler) when full: "+addedDelta);

        boolean soldNotebookTwo = quirkyMart.sellProduct(itemAlpha.getId(),2);
        System.out.println("Sell 2 units of Notebook: " + soldNotebookTwo);

        boolean soldPenThree = quirkyMart.sellProduct(itemBeta.getId(),3);
        System.out.println("Sell 3 units of Pen (should fail): "+soldPenThree);


        boolean soldPenTwo = quirkyMart.sellProduct(itemBeta.getId(),2);
        System.out.println("Sell 2 units of Pen: " + soldPenTwo);

        boolean priceChangeResult = itemAlpha.setPrice(-5);
        System.out.println("Set Notebook price to -5: "+priceChangeResult+" | Current price: " + itemAlpha.getPrice());

        quirkyMart.printAvailableProducts();

        quirkyMart.printSalesReport();
        System.out.println("Total units sold: "+quirkyMart.getTotalUnitsSold());

        System.out.println("Product IDs -> Notebook: " + itemAlpha.getId()
                + ", Pen: "+itemBeta.getId()
                + ", Bottle: " + itemGamma.getId()
                +", Stapler: " + itemDelta.getId());
        System.out.println("Next ID to be assigned: "+Product.getNextId());
    }
}