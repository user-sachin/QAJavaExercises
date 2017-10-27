import java.io.*;
import java.util.ArrayList;

public class ExerciseTwo {


    static void blackJack(int inputBJIntegerOne, int inputBJIntegerTwo) {
        BlackJack blackJack = new BlackJack();
        System.out.println(blackJack.doBlackJack(inputBJIntegerOne, inputBJIntegerTwo));
    }


    static void uniqueSum(int inputUniqueSumIntegerOne, int inputUniqueSumIntegerTwo, int inputUniqueSumIntegerThree) {
        UniqueSum uniqueSum = new UniqueSum();
        System.out.println(uniqueSum.doUniqueSum(inputUniqueSumIntegerOne, inputUniqueSumIntegerTwo, inputUniqueSumIntegerThree));
    }


    static void tooHot(int temperature, boolean isSummer) {
        TooHot tooHot = new TooHot();
        System.out.println(tooHot.doTooHot(temperature, isSummer));
    }




    static void calculatePaint() {
        int roomSize = 10;
        PaintWizard paintWizard = new PaintWizard();
        paintWizard.addPaint("CheapoMax",20, 19.99, 10);
        paintWizard.addPaint("AverageJoes",15, 17.99, 11);
        paintWizard.addPaint("DuluxourousPaints",10, 25.0, 20);
        ArrayList<Double> paintCosts = new ArrayList<Double>();

        System.out.println("Painty for a room of size "+roomSize+"m2");
        for (int i = 0; i < paintWizard.paintz.size(); i++) {
            System.out.println(paintWizard.paintz.get(i).name+ " " +paintWizard.paintWasted(paintWizard.paintz.get(i), roomSize));
            paintCosts.add(paintWizard.totalCost);
        }

        int index = 0;
        Double minPrice = (Double)paintCosts.get(index);
        for (int i = 0; i < paintCosts.size(); i++) {
            Double item = (Double)paintCosts.get(i);
            if (item.compareTo(minPrice) < 0) {
                index = i;
                minPrice = item;
            }
        }
        System.out.println("Cheapest is " + paintWizard.paintz.get(index));
    }

    static void garage() {
        Garage newGarage = new Garage();
        newGarage.addVehicle(new Car(12, "bmw", "car", 14));
        newGarage.addVehicle(new Car(12, "bmw", "car", 15));
        newGarage.addVehicle(new MotorCycle(12, "bmw", "red", "bike", 16));
        newGarage.addVehicle(new MotorCycle(12, "car1", "red", "bike", 17));
        newGarage.addVehicle(new Car(12, "car1", "car", 18));
        newGarage.addVehicle(new Car(12, "car1", "car", 19));

        System.out.println(newGarage.vehiclez.size());

        int removeId = 15;
        System.out.println("After removal of ID: " + removeId);
        newGarage.removeVehicleById(removeId);
        System.out.println(newGarage.vehiclez.size());

        String removeByType = "car";
        System.out.println("Remove by type: " + removeByType);
        //newGarage.removeVehicleByType(removeByType);
        System.out.println(newGarage.vehiclez.size());

        int findBillForId = 16;
        System.out.println("The bill for ID: "+ findBillForId + " is: £" + newGarage.calculateBill(findBillForId));


        System.out.println("After clear");
        //newGarage.clearVehicles();
        System.out.println(newGarage.vehiclez.size());
    }

    static void workingWithFiles() {
        WorkingWithFiles workingWithFiles = new WorkingWithFiles();
        String fileName = "file123.txt";
        workingWithFiles.addPerson("b", 23, "builder1");
        workingWithFiles.addPerson("bo", 24, "builder2");
        workingWithFiles.addPerson("bb", 25, "builder3");
        workingWithFiles.addPerson("bobb", 26, "builder4");
        workingWithFiles.addPerson("bobby", 27, "builder5");
        workingWithFiles.outPutFile(workingWithFiles.peopleFiles, fileName);
        System.out.println(workingWithFiles.createNewPersonArray(fileName));
    }



    public static void main(String[] args) {
        int firstBJInteger = 22;
        int secondBJInteger = 5;
        System.out.println("");
        System.out.print("blackJack(" + firstBJInteger + ", " + secondBJInteger + ") -> ");
        blackJack(firstBJInteger, secondBJInteger);


        int firstUniqueSumInteger = 22;
        int secondUniqueSumInteger = 6;
        int thirdUniqueSumInteger = 5;
        System.out.println("");
        System.out.print("uniqueSum(" + firstUniqueSumInteger + ", " + secondUniqueSumInteger + ", " + thirdUniqueSumInteger + ") -> ");
        uniqueSum(firstUniqueSumInteger, secondUniqueSumInteger, thirdUniqueSumInteger);

        int temperature = 64;
        boolean isSummer = false;
        System.out.println("");
        System.out.print("tooHot(" + temperature + ", " + isSummer + ") -> ");
        tooHot(temperature, isSummer);

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("bob", 12, "programer"));
        people.add(new Person("bobby", 12, "programer"));
        people.add(new Person("bobshe", 12, "programer"));

        for (Person p : people) {
            System.out.println(p);
        }

        String searchName = "bob";
        ArrayList<String> peoplesNames = new ArrayList<String>();
        for (Person p : people) {
            if (p.getName() == searchName) {
                System.out.println("MATCH");
                System.out.println(p);
            }
        }




        garage();

        calculatePaint();

        workingWithFiles();


    }
}
