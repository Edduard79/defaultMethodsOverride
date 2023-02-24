import java.util.Objects;

public class SmartphonePrice implements Cloneable{
    private String priceType;
    private double priceInEuros;

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {

        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice)super.clone();
        return clonedSmartphonePrice;

    }
    public SmartphonePrice(String type, double price) {

        this.priceType = type;
        this.priceInEuros = price;
    }

    @Override
    public String toString(){
        return this.priceType + " price is " + this.priceInEuros + " euros";
    }

    public boolean equals(Object phone){
        if (this == phone){
            return true;
        }else if (phone != null && this.getClass() == phone.getClass()) {
            SmartphonePrice that = (SmartphonePrice) phone;
            return Double.compare(that.priceInEuros, this.priceInEuros) == 0 && Objects.equals(this.priceType, that.priceType);
        }else{
            return false;
        }
    }

    public int hashCode(){
        return Objects.hash(new Object[]{this.priceType, this.priceInEuros});
    }
}
