
import MegaStore.DiscountType;

public class MegaStore {

    public enum DiscountType {
        Standard(0.06),
        Seasonal(0.12),
        Weight(0);

        private double value;

        DiscountType(double value){

        this.value = value;
        }  

        double getValue(){
            

            return value;
        }
  }

  
    public static double getDiscountedPrice(double cartWeight,
                                            double totalPrice,
                                            DiscountType discountType) {
                                                

        if(discountType == DiscountType.Weight){

          if(cartWeight <= 10){
             discountType.value = 0.06;
                }else if(cartWeight > 10){
                 discountType.value = 0.18;
                }
            }


        return totalPrice - (totalPrice * discountType.getValue());
        
    }
    
    public static void main(String[] args) {          
        
        System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
    }
}