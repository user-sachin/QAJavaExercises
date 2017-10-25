import javafx.util.Pair;

import java.util.ArrayList;

public class Garage {

    ArrayList<Vehicle> vehiclez = new ArrayList<Vehicle>();
    ArrayList<Pair> carTypePricesPairs = new ArrayList<Pair>();
    ArrayList<Pair> vehicleTypePricesPairs = new ArrayList<Pair>();

    public Garage(ArrayList vehiclez) {
        this.vehiclez = vehiclez;


        vehicleTypePricesPairs.add(new Pair<>("car",500));
        vehicleTypePricesPairs.add(new Pair<>("bike",300));
        vehicleTypePricesPairs.add(new Pair<>("van",700));


        carTypePricesPairs.add(new Pair<>("bmw",100));
        carTypePricesPairs.add(new Pair<>("merc",200));
        carTypePricesPairs.add(new Pair<>("porshe",300));
    }


    public void addVehicle(int modelNumber, String type, String vehicleType, int vehicleId){

        if (vehicleType.equals("car")){
            vehiclez.add(new Car(modelNumber, type, vehicleType, vehicleId));
        }
    }


    public void removeVehicleById2(int vehicleId){
        for(int i = 0; i < vehiclez.size(); i++){
            if(vehiclez.get(i).vehicleId==vehicleId){
                vehiclez.remove(i);
            }
        }
    }

    public void removeVehicleById(int vehicleId){
        for(Vehicle v: vehiclez){
            if(v.vehicleId==vehicleId){
                vehiclez.remove(v);
                break;
            }
        }
    }

    public void removeVehicleByType(String vehicleType){
        ArrayList<Vehicle> vehiclezToRemove = new ArrayList<Vehicle>();
        for(int i = 0; i < vehiclez.size(); i++){
            if(vehiclez.get(i).vehicleType==vehicleType){
                vehiclezToRemove.add(vehiclez.get(i));
            }
        }
        vehiclez.removeAll(vehiclezToRemove);
    }


    public int calculateBill(int vehicleId){
        int cost = 0;
        for(int i = 0; i < vehiclez.size(); i++){
            if(vehiclez.get(i).vehicleId==vehicleId){
                for(int j = 0; j < vehicleTypePricesPairs.size(); j++) {
                        if(vehiclez.get(i).vehicleType==vehicleTypePricesPairs.get(j).getKey()){
                            cost = (int)vehicleTypePricesPairs.get(j).getValue();
                    }
                }
            }
        }

        return cost;
    }


    public void clearVehicles(){
        vehiclez.clear();
    }
}
