import java.io.*;
import java.util.ArrayList;

public class WorkingWithFiles {
    ArrayList<Person> peopleFiles = new ArrayList<Person>();

    public WorkingWithFiles() {}

    public void addPerson(String name, int age, String jobTitle) {
        peopleFiles.add(new Person(name, age, jobTitle));
    }

    public void outPutFile(ArrayList<Person> peopleFiles, String fileName) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        for (Person p : peopleFiles) {
            String line = p.name + ", " + p.age + ", " + p.jobTitle;
            try {
                out.write(line);
                out.newLine();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String createNewPersonArray(String fileName) {
        ArrayList<Person> peopleFilesCopy = new ArrayList<Person>();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("file123.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        try {
            while ((line = in.readLine()) != null) {
                String[] splits = line.split(", ");
                peopleFilesCopy.add(new Person((String) splits[0], Integer.valueOf(splits[1]), (String) splits[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = "";
        for (Person p : peopleFilesCopy) {
            result = result + System.lineSeparator() + p.name + ", " + p.age + ", " + p.jobTitle;
        }
        return result;
    }
}


