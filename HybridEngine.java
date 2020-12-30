public class HybridEngine extends Engine{


    private ElectricEngine electricEngine;
    private InternalCombusionEngine internalCombusionEngine;

    public HybridEngine(String powerSource, String model, Float maxPower, Float maxRPM, 
            Float maxTorque, Float weight, Float displacement, 
            Float noOfCylinders, String compRatio,
            String currentType, Float voltage) {
        super("Hybrid", powerSource, model, maxPower,maxRPM, maxTorque,weight);
        this.electricEngine = new ElectricEngine(powerSource, model, maxPower, maxRPM, maxTorque, weight, currentType, voltage);
        this.internalCombusionEngine = new InternalCombusionEngine(powerSource, model, maxPower, maxRPM, maxTorque, weight, displacement, noOfCylinders, compRatio);
    }

    public void showSpecs(){
        super.showSpecs();
    }
    
}