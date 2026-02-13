class SoapExecutor {

    public static void main(String[] args) {

        System.out.println("Brand: " + Soap.getBrand());
        System.out.println("Model Number: " + Soap.getModelNumber());
        System.out.println("Manufacturer: " + Soap.getManufacturer());
        System.out.println("Country of Origin: " + Soap.getCountryOfOrigin());
        System.out.println("ASIN: " + Soap.getASIN());
        System.out.println("Product Dimensions: " + Soap.getProductDimensions());
        System.out.println("Item Weight: " + Soap.getItemWeight());
    }
}