public class InternalCombusionEngine extends Engine{

    private Float displacement;
    private Float noOfCylinders;
    private String compRatio;

    public InternalCombusionEngine(String powerSource, String model, Float maxPower, Float maxRPM, Float maxTorque, Float weight, Float displacement, Float noOfCylinders,String compRatio){
        super("Internal Combusion",powerSource,model,maxPower, maxRPM, maxTorque, weight);
        this.displacement = displacement;
        this.noOfCylinders = noOfCylinders;
        this.compRatio = compRatio;

    }


    public void showSpecs(){
        super.showSpecs();
        System.out.printf("Displacement: '%-15s' %n", displacement);
        System.out.printf("No Of Cylinders: '%-20s' %n", noOfCylinders);
        System.out.printf("Comp Ratio: '%-20s' %n", compRatio);
    }
    
}