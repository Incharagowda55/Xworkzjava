class WatchExecutor {

    public static void main(String[] args) {

        System.out.println("Model Number: " + Watch.getModelNumber());
        System.out.println("Manufacturer: " + Watch.getManufacturer());
        System.out.println("Manufacturer Address: " + Watch.getManufacturerAddress());
        System.out.println("Importer: " + Watch.getImporter());
        System.out.println("Country of Origin: " + Watch.getCountryOfOrigin());
        System.out.println("Department: " + Watch.getDepartment());
        System.out.println("ASIN: " + Watch.getASIN());
        System.out.println("Date First Available: " + Watch.getDateFirstAvailable());
        System.out.println("Product Dimensions: " + Watch.getProductDimensions());
        System.out.println("Item Weight: " + Watch.getItemWeight());
        System.out.println("Battery Info: " + Watch.getBatteryInfo());
        System.out.println("Discontinued: " + Watch.isDiscontinued());
        System.out.println("Language: " + Watch.getLanguage());
    }
}