public class Demo {
    
    public static void main(String a[]) 
    {
        int nums[][] = new int[5][4];



        for(int i=0;i<5;i++){

            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random() * 50);

            }
            
        }
        for(int i=0;i<5;i++){

            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] +" ");

            }
            System.out.println();
        }
    }
}
