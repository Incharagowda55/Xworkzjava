class GroceryItemExecutor {

    public static void main(String[] args) {

        System.out.println("Brand: " + GroceryItem.getBrand());
        System.out.println("Part Number: " + GroceryItem.getPartNumber());
        System.out.println("Manufacturer: " + GroceryItem.getManufacturer());
        System.out.println("ASIN: " + GroceryItem.getASIN());
        System.out.println("Date First Available: " + GroceryItem.getDateFirstAvailable());
        System.out.println("Package Dimensions: " + GroceryItem.getPackageDimensions());
        System.out.println("Item Weight: " + GroceryItem.getItemWeight());
        System.out.println("Net Quantity: " + GroceryItem.getNetQuantity());
    }
}