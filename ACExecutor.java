class ACExecutor {

    public static void main(String[] args) {

        System.out.println("Brand: " + AC.getBrand());
        System.out.println("Model: " + AC.getModel());
        System.out.println("Energy Efficiency: " + AC.getEnergyEfficiency());
        System.out.println("Capacity: " + AC.getCapacity());
        System.out.println("Annual Energy Consumption: " + AC.getAnnualEnergyConsumption() + " Watts");
        System.out.println("Noise Level: " + AC.getNoiseLevel() + " dB");
        System.out.println("Installation Type: " + AC.getInstallationType());
        System.out.println("Form Factor: " + AC.getFormFactor());
        System.out.println("Special Features: " + AC.getSpecialFeatures());
        System.out.println("Colour: " + AC.getColour());
        System.out.println("Control Console: " + AC.getControlConsole());
        System.out.println("Voltage: " + AC.getVoltage() + " Volts");
        System.out.println("Wattage: " + AC.getWattage() + " Watts");
        System.out.println("Certification: " + AC.getCertification());
        System.out.println("Material: " + AC.getMaterial());
        System.out.println("Manufacturer: " + AC.getManufacturer());
    }
}
