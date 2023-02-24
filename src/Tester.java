import java.sql.SQLOutput;

public class Tester {
    public Tester(){
    }

    public static void main(String[] args){

        SmartphonePrice prodPrice1 = new SmartphonePrice("Producer", 120.50);
        SmartphonePrice prodPrice2 = new SmartphonePrice("Producer", 370.70);
        SmartphonePrice retPrice1 = new SmartphonePrice("Retail", 279.99);
        SmartphonePrice retPrice2 = new SmartphonePrice("Retail", 1299.99);
        //------------------------------------
        Smartphone phone1 = new Smartphone("Xiaomi", "Redmi Note7", 2750, prodPrice1, retPrice1);
        Smartphone phone2 = new Smartphone("Apple", "IPhone 14", 2200, prodPrice2, retPrice2);
        //-------------------------------------
        System.out.println("==================================");
        System.out.println("Smartphone n1: " + phone1);
        System.out.println(phone1.hashCode());
        //-------------------------------------
        System.out.println("==================================");
        System.out.println("Smartphone n2: " + phone2);
        System.out.println(phone2.hashCode());
        System.out.println("==================================");
        //-------------------------------------
        boolean equ = phone1.equals(phone2);
        System.out.println("Is first smartphone equal to second smartphone? " + equ);
        System.out.println("==================================");


            try{
                Smartphone clonedPhone2 = phone2.clone();
                System.out.println("Smartphone2 clone: " + clonedPhone2);
                System.out.println("Hashcode: " + clonedPhone2.hashCode());
                //----------------------------
                boolean equ1;
                    if(phone2.hashCode() == clonedPhone2.hashCode()){
                        equ1 = true;
                    }else{
                        equ1 = false;
                    }
                //----------------------------
                System.out.println("==================================");
                System.out.println("Is smartphone2 equals to the cloned one? " + equ1);


            }catch(Exception exception){
                exception.printStackTrace();
                System.out.println("Cloning error!!");
            }

    }
}
