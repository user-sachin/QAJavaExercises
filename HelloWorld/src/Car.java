public class Car extends Vehicle{


    int carModelNumber;
    String carType;


    public Car (int carModelNumber, String carType, String vehicleType, int vehicleId) {
        super(vehicleType, vehicleId);
        this.carModelNumber = carModelNumber;
        this.carType = carType;
    }


    public String getCarType() {
        return carType;
    }

    public int getCarModelNumber() {
        return carModelNumber;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCarModelNumber(int carModelNumber) {
        this.carModelNumber = carModelNumber;
    }
}