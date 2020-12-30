public abstract class Engine{
    private String engineType;
    private String powerSource;
    private String model;
    private Float maxPower;
    private Float maxRPM;
    private Float maxTorque;
    private Float weight;

    public Engine(String engineType, String powerSource, String model, Float maxPower, Float maxRPM, Float maxTorque, Float weight){
        this.engineType = engineType;
        this.powerSource = powerSource;
        this.model = model;
        this.maxPower = maxPower;
        this.maxRPM = maxRPM;
        this.maxTorque = maxTorque;
        this.weight = weight;
    }


    public void showSpecs(){
        System.out.printf("Engine Type '%-20s' :%n", engineType);
        System.out.printf("Engine Power Source '%-12s' : %n", powerSource);
        System.out.printf("Model Number '%-18s' : %n", model);
        System.out.println("Key Specifications");
        System.out.printf("Max Power '%-21s' : %n", maxPower);
        System.out.printf("Max Torque '%-20s' : %n", maxTorque);
        System.out.printf("Weight '%-25s' : %n", weight);
    }
}