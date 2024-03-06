package yannie.managers;

import yannie.model.AstronautModel;

import java.util.ArrayList;

public class AstronautManager {

    public ArrayList<AstronautModel> astronauts;

    public AstronautManager() {
        astronauts = new ArrayList<>();
        AstronautModel yanster = new AstronautModel("yanster", "developer");
        yanster.addCat("HGHGJTUGYHTJRHGFGTR");
        yanster.addCat("HGNGNBHGNBHHTHYGHFH");
        astronauts.add(yanster);
    }

    public AstronautModel searchByName(String name) {
        for (AstronautModel astronaut : astronauts) {
            if(astronaut.getName().compareToIgnoreCase(name) == 0) {
                return astronaut;
            }
        }
        return null;
    }
}
