package VendingMachine.impl;

public enum EPackage {
    PLASTIC("пластик"), GLASS("стекло"), PAPER("бумага");

    private final String material;

    EPackage(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
