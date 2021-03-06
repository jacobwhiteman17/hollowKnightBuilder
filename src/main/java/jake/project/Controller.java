package jake.project;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    int max = 11;
    boolean overcharmed = true;

    ArrayList<Charm> allCharms = new ArrayList<Charm>();

    public void initialize(){
        var parser = new JsonParser();
        try (FileReader y = new FileReader("src/charm.json")){
            Object obj = parser.parse(y);
            JsonArray charmList = (JsonArray) obj;
            charmList.forEach(charm -> getCharm((JsonObject) charm));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public void getCharm(JsonObject charm){
        String name = (String) charm.get("name").toString();
        String desc = (String) charm.get("Description").toString();
        int notch = Integer.parseInt(charm.get("Notch").toString());

        Charm x = new Charm(name, desc, notch);
        //x.printme();
        allCharms.add(x);
    }

}
