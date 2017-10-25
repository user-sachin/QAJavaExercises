import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExerciseTwo {


    static int blackJack(int inputBJIntegerOne, int inputBJIntegerTwo) {
        int result;
        if (inputBJIntegerOne > 21 && inputBJIntegerTwo > 21) {
            result = 0;
        } else {
            if (inputBJIntegerOne > 21) {
                result = inputBJIntegerTwo;
            } else if (inputBJIntegerTwo > 21) {
                result = inputBJIntegerOne;
            } else {
                if (inputBJIntegerOne > inputBJIntegerTwo) {
                    result = inputBJIntegerOne;
                } else {
                    result = inputBJIntegerTwo;
                }
            }
        }
        return result;
    }


    static int uniqueSum(int inputUniqueSumIntegerOne, int inputUniqueSumIntegerTwo, int inputUniqueSumIntegerThree) {
        int result;
        if (inputUniqueSumIntegerOne == inputUniqueSumIntegerTwo) {
            if (inputUniqueSumIntegerOne == inputUniqueSumIntegerThree) {
                result = 0;
            } else {
                result = inputUniqueSumIntegerThree;
            }
        } else {
            if (inputUniqueSumIntegerOne == inputUniqueSumIntegerThree) {
                result = inputUniqueSumIntegerTwo;
            } else if (inputUniqueSumIntegerTwo == inputUniqueSumIntegerThree) {
                result = inputUniqueSumIntegerOne;
            } else {
                result = inputUniqueSumIntegerOne + inputUniqueSumIntegerTwo + inputUniqueSumIntegerThree;
            }
        }
        return result;
    }


    static boolean tooHot(int temperature, boolean isSummer) {
        boolean result;

        int lowerLimit = 60;
        int higherLimit = 90;
        if (isSummer) {
            higherLimit = 100;
        }

        if (temperature > lowerLimit && temperature < higherLimit) {
            result = true;
        } else {
            result = false;

        }
        return result;
    }




    static void calculatePaint(int roomSize) {
        ArrayList<Paint> paintz = new ArrayList<Paint>();
        paintz.add(new Paint("CheapoMax", 20, 19.99, 10));
        paintz.add(new Paint("AverageJoes", 15, 17.99, 11));
        paintz.add(new Paint("DuluxourousPaints", 10, 25, 20));

        System.out.println("Painty");
        PaintWizard paintWizard = new PaintWizard();
        for (int i = 0; i < paintz.size(); i++) {
            System.out.println(paintz.get(i).name+ " " +paintWizard.paintWasted(paintz.get(i), roomSize));
        }
    }



    static void workingWithFiles() {
        ArrayList<Person> peopleFiles = new ArrayList<Person>();
        peopleFiles.add(new Person("b", 12, "programer1"));
        peopleFiles.add(new Person("bo", 13, "programer2"));
        peopleFiles.add(new Person("bob", 14, "programer3"));
        peopleFiles.add(new Person("bobb", 15, "programer4"));
        peopleFiles.add(new Person("bobby", 16, "programer5"));


        for (Person p : peopleFiles) {
            String line = p.name + ", " + p.age + ", " + p.jobTitle + ".";
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("file123.txt"));
                out.write(line + "\n");
                out.close();
            } catch (IOException e) {}
        }



    }



    public static void main(String[] args) {
        int firstBJInteger = 22;
        int secondBJInteger = 5;
        System.out.println("");
        System.out.print("blackJack(" + firstBJInteger + ", " + secondBJInteger + ") -> ");
        System.out.println(blackJack(firstBJInteger, secondBJInteger));

        int firstUniqueSumInteger = 22;
        int secondUniqueSumInteger = 6;
        int thirdUniqueSumInteger = 5;
        System.out.println("");
        System.out.print("uniqueSum(" + firstUniqueSumInteger + ", " + secondUniqueSumInteger + ", " + thirdUniqueSumInteger + ") -> ");
        System.out.println(uniqueSum(firstUniqueSumInteger, secondUniqueSumInteger, thirdUniqueSumInteger));

        int temperature = 64;
        boolean isSummer = false;
        System.out.println("");
        System.out.print("tooHot(" + temperature + ", " + isSummer + ") -> ");
        System.out.println(tooHot(temperature, isSummer));

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

        ArrayList<Vehicle> vehiclez = new ArrayList<Vehicle>();
        vehiclez.add(new Car(12, "car1", "car", 15));
        vehiclez.add(new MotorCycle(12, "car1", "red", "bike", 16));
        vehiclez.add(new MotorCycle(12, "car1", "red", "bike", 17));
        vehiclez.add(new Car(12, "car1", "car", 18));
        vehiclez.add(new Car(12, "car1", "car", 19));

        System.out.println(vehiclez.size());

        System.out.println("After removal ");
        Garage newGarage = new Garage(vehiclez);
        //newGarage.removeVehicleById(15);
        System.out.println(vehiclez.size());


        System.out.println("After clear ");
        //newGarage.clearVehicles();
        System.out.println(vehiclez.size());



        //newGarage.addVehicle(18, "car1", "car", 19 );
        System.out.println(vehiclez.size());

        System.out.println("remove bioke ");

        newGarage.removeVehicleByType("car");
        System.out.println(vehiclez.size());



        System.out.println("bill iz: £" + newGarage.calculateBill(16) + " for ID: "+16);


        calculatePaint(12);







    }
}
