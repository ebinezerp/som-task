public class Main {


    public static void main(String[] args){
        Engine engine1 = new InternalCombusionEngine("Petrol", "2000F", 3000F, 500F, 200F, 400F, 20F, 6F, "10:23");
        engine1.showSpecs();

        Engine engine2 = new HybridEngine("Petrol", "2000F", 3000F, 500F, 200F, 400F, 20F, 6F, "10:23", "DC", 7F);
        engine2.showSpecs();
    }
    
}