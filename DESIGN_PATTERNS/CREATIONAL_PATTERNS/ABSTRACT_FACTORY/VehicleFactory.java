package DESIGN_PATTERNS.CREATIONAL_PATTERNS.ABSTRACT_FACTORY;

public class VehicleFactory {
    public static BrandFactory getBrandFactory(BrandName brandName) {
        if (BrandName.HUNDAI.equals(brandName))
            return new HundaiFactory();
        else if (BrandName.TOYOTA.equals(brandName))
            return new ToyotaFactory();
        return null;
    }
}
