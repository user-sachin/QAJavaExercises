import javafx.util.Pair;

import java.util.ArrayList;

public class Garage {

    ArrayList<Vehicle> vehiclez = new ArrayList<Vehicle>();
    ArrayList<Pair> carTypePricesPairs = new ArrayList<Pair>();
    ArrayList<Pair> bikeTypePricesPairs = new ArrayList<Pair>();
    ArrayList<Pair> vehicleTypePricesPairs = new ArrayList<Pair>();

    public Garage() {
        vehicleTypePricesPairs.add(new Pair<>("car", 500));
        vehicleTypePricesPairs.add(new Pair<>("bike", 300));
        vehicleTypePricesPairs.add(new Pair<>("van", 700));

        carTypePricesPairs.add(new Pair<>("bmw", 100));
        carTypePricesPairs.add(new Pair<>("merc", 200));
        carTypePricesPairs.add(new Pair<>("porshe", 300));

        bikeTypePricesPairs.add(new Pair<>("bmw", 50));
        bikeTypePricesPairs.add(new Pair<>("merc", 100));
        bikeTypePricesPairs.add(new Pair<>("porshe", 150));
    }


    public int addVehicle(Vehicle vehicle) {
        vehiclez.add(vehicle);
        return vehicle.vehicleId;
    }


    public int removeVehicleById(int vehicleId) {
        for (Vehicle v : vehiclez) {
            if (v.vehicleId == vehicleId) {
                vehiclez.remove(v);
                break;
            }
        }
        return vehicleId;
    }

    public int removeVehicleByType(String vehicleType) {
        ArrayList<Vehicle> vehiclezToRemove = new ArrayList<Vehicle>();
        for (int i = 0; i < vehiclez.size(); i++) {
            if (vehiclez.get(i).vehicleType == vehicleType) {
                vehiclezToRemove.add(vehiclez.get(i));
            }
        }
        vehiclez.removeAll(vehiclezToRemove);
        return vehiclezToRemove.size();
    }


    public int calculateBill(int vehicleId) {
        int cost = 0;
        for (int i = 0; i < vehiclez.size(); i++) {
            if (vehiclez.get(i).vehicleId == vehicleId) {
                System.out.println(vehiclez.get(i).vehicleType);

                for (int j = 0; j < vehicleTypePricesPairs.size(); j++) {
                    if (vehiclez.get(i).vehicleType == vehicleTypePricesPairs.get(j).getKey()) {
                        cost = cost + (int) vehicleTypePricesPairs.get(j).getValue();
                    }
                }

                if(vehiclez.get(i) instanceof Car){
                    for (int j = 0; j < carTypePricesPairs.size(); j++) {
                        if (((Car) vehiclez.get(i)).carType == carTypePricesPairs.get(j).getKey()) {
                            System.out.println(((Car) vehiclez.get(i)).carType);
                            cost = cost + (int) carTypePricesPairs.get(j).getValue();
                        }
                    }
                }
                else if(vehiclez.get(i) instanceof MotorCycle){
                    for (int j = 0; j < bikeTypePricesPairs.size(); j++) {
                        if (((MotorCycle) vehiclez.get(i)).motorCycleType == bikeTypePricesPairs.get(j).getKey()) {
                            System.out.println(((MotorCycle) vehiclez.get(i)).motorCycleType);
                            cost = cost + (int) bikeTypePricesPairs.get(j).getValue();
                        }
                    }
                }



            }
        }
        return cost;
    }

    public void clearVehicles() {
        vehiclez.clear();
    }
}
