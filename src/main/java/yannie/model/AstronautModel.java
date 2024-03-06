package yannie.model;

import java.util.*;

public class AstronautModel {

    public String name;
    public String id;
    public List<String> catID;

    public AstronautModel(String name, String id) {
        this.name = name;
        this.id = id;
        catID = new ArrayList<String>();
    }

    public void addCat(String catID) {
        this.catID.add(catID);
    }

    public void printAstronaut() {
        System.out.println("[Astronaut]: ID=" + id + " Name=" + name + " Cats Owned=" + catID.size());
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }
}
