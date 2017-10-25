public class MotorCycle extends Vehicle{


    int motorCycleModelNumber;
    String motorCycleType;
    String motorCycleColour;


    public MotorCycle(int motorCycleModelNumber, String motorCycleType, String motorCycleColour, String vehicleType, int vehicleId) {
        super(vehicleType, vehicleId);
        this.motorCycleModelNumber = motorCycleModelNumber;
        this.motorCycleType = motorCycleType;
        this.motorCycleColour = motorCycleColour;
    }


    public String getCarType() {
        return motorCycleType;
    }

    public int getCarModelNumber() {
        return motorCycleModelNumber;
    }

    public void setMotorCycleType(String motorCycleType) {
        this.motorCycleType = motorCycleType;
    }

    public void setMotorCycleModelNumber(int motorCycleModelNumber) {
        this.motorCycleModelNumber = motorCycleModelNumber;
    }


    public String getMotorCycleColour() {
        return motorCycleColour;
    }

    public void setMotorCycleColour(String motorCycleColour) {
        this.motorCycleColour = motorCycleColour;
    }

    @Override
    public String toString() {
        return "ID: "+ vehicleId + ", Type: "+ vehicleType;
    }
}