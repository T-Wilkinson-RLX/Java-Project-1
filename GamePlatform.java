public class GamePlatform {
    public static double calculateFinalSpeed(double initialSpeed, int[] inclinations) {

        double result = initialSpeed;
        double finalResult;
        for( int i =0; i<inclinations.length;i++){
            result = result - (inclinations[i]);
        }
        if(result <= 0){

            finalResult = 0;
        }else {
            finalResult = result;
        }
        return finalResult;
    }

    public static void main(String[] args){
        System.out.println(calculateFinalSpeed(60.0, new int[] { 0, 30, 0, -45, 75 }));
    }
}