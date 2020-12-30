public class InternalCombusionEngine extends Engine{

    private Float displacement;
    private Float noOfCylinders;
    private String compRatio;

    public InternalCombusionEngine(String powerSource, String model, Float maxPower, Float maxRPM, Float maxTorque, Float weight){
        super("Internal Combusion",powerSource,model,maxPower, maxRPM, maxTorque, weight);
        this.displacement = displacement;
        this.noOfCylinders = noOfCylinders;
        this.compRatio = compRatio;

    }


    public void showSpecs(){
        super.showSpecs();
        System.out.printf("'%-15s' : %n", displacement);
        System.out.printf("'%-20s' : %n", noOfCylinders);
        System.out.printf("'%-20s' : %n", compRatio);
    }
    
}