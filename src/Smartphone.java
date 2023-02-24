import java.util.Objects;

public class Smartphone implements Cloneable{
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    @Override
    public String toString(){
        return "\nDetails: \nName: " + this.brandName + "\nModel: " + this.modelName + "\nBattery: " + this.batterymAh + "mAh" + "\nProd. Price: " + this.producerPrice + " euros" + "\nRetail Price: "+ retailPrice +" euros";
    }

    @Override
    public boolean equals(Object phone){

        if(this == phone){
            return true;

        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){

        return Objects.hash(this.brandName,this.modelName,this.batterymAh,this.producerPrice,this.retailPrice);

    }

     @Override
    public Smartphone clone() throws CloneNotSupportedException {

        Smartphone clonedSmartphone = (Smartphone)super.clone();
        clonedSmartphone.producerPrice = this.producerPrice.clone();
        clonedSmartphone.retailPrice = this.retailPrice.clone();

        return clonedSmartphone;
     }

     public Smartphone(String brand, String model, int battery, SmartphonePrice prodPrice, SmartphonePrice retPrice){
         this.brandName = brand;
         this.modelName = model;
         this.batterymAh = battery;
         this.producerPrice = prodPrice;
         this.retailPrice = retPrice;
     }




}
