public class ElectricEngine extends Engine{

    private String currentType;
    private Float voltage;

    public ElectricEngine(String powerSource, String model, Float maxPower, Float maxRPM, Float maxTorque, Float weight, String currentType, Float voltage){
        super("Electric", powerSource,model,maxPower,maxRPM,maxTorque,weight);
        this.currentType = currentType;
        this.voltage = voltage;
    }

    public void showSpecs(){
        if(!this.getClass().getName().equals("HybridEngine")){
            super.showSpecs();
        }
        System.out.printf("Current Type: %20s %n", currentType);
        System.out.printf("Voltage: %20s %n", voltage);
    }
    
}