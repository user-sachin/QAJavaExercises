public class Vehicle {
    int vehicleId;
    String vehicleType;

    public Vehicle(String vehicleType, int vehicleId) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


}



