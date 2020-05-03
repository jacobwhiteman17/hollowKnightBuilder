package jake.project;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Controller {
    int max = 11;

    ArrayList<Charm> allCharms = new ArrayList<Charm>();

    public void initialize(){
        var x = new JsonParser();
        try (FileReader y = new FileReader("C:\\Users\\Jacob\\IdeaProjects\\hollowKnightBuilder\\src\\main\\resources\\jake\\project\\charm.json")){
            Object obj = x.parse(y);
            JsonArray charmList = (JsonArray) obj;
            charmList.forEach(charm -> getCharm((JsonObject) charm));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }


    }

    public void getCharm(JsonObject charm){
        //System.out.println(charm);
        String name = (String) charm.get("name").toString();
        String desc = (String) charm.get("Description").toString();
        int notch = Integer.parseInt(charm.get("Notch").toString());

        Charm x = new Charm(name, desc, notch);
        x.printme();

        allCharms.add(x);
    }

    /*Charm waywardCompass = new Charm("Wayward Compass", "Whispers its location to the bearer whenever" +
            " a map is open", 1);
    Charm gatheringSwarm = new Charm("Gathering Swarm", "A swarm will follow the bearer and gather " +
            "up any loose Geo", 1);
    Charm stalwartShell = new Charm("Stalwart Shell", "When recovering from damage, the bearer will " +
            "remain invulnerable for longer", 2);
    Charm soulCatcher = new Charm("Soul Catcher", "Increases the amount of SOUL gained when " +
            "striking an enemy with the nail", 2);
    Charm shamanStone = new Charm("Shaman Stone", "Increases the power of spells, dealing more " +
            "damage to foes", 3);
    Charm soulEater = new Charm("Soul Eater", "Greatly increases the amount of SOUL gained when " +
            "striking an enemy with the nail", 4);
    Charm dashmaster = new Charm("Dashmaster", "The bearer will be able to dash more often as well " +
            "as dash downwards", 2);
    Charm sprintmaster = new Charm("Sprintmaster", "Increases the running speed of the bearer, " +
            "allowing them to avoid danger or overtake rivals", 1);
    Charm grubsong = new Charm("Grubsong", "Gain SOUL when taking damage", 1);
    Charm grubberflyElegy = new Charm("Grubberfly's Elegy", "Imbues weapons with a holy strength." +
            " When the bearer is at full health, they will fire beams of white-hot energy from their nail", 3);
    Charm fragileHeart = new Charm("Fragile/Unbreakable Heart", "Increases the health of the bearer",2);
    Charm fragileGreed = new Charm("Fragile/Unbreakable Greed", "Causes the bearer to find more Geo " +
            "when defeating enemies",2);
    Charm fragileStrength = new Charm("Fragile/Unbreakable Strength", "Strengthens the bearer, " +
            "increasing the damage they deal to enemies with their nail",3);
    Charm spellTwister = new Charm("Spell Twister", "Reduces the SOUL cost of casting spells", 2);
    Charm steadyBody = new Charm("Steady Body", "Keeps its bearer from recoiling backwards when they " +
            "strike an enemy with a nail",1);
    Charm heavyBlow = new Charm("Heavy Blow", "Increases the force of the bearer's nail," +
            " causing enemies to recoil further when hit", 2);
    Charm quickSlash = new Charm("Quick Slash", "Allows the bearer to slash much more " +
            "rapidly with their nail", 3);
    Charm longnail = new Charm("Longnail", "Increases the range of the bearer's nail",2);
    Charm markOfPride = new Charm("Mark of Pride", "Greatly increases the range of the bearer's nail"
    ,3);
    Charm furyOfTheFallen = new Charm("Fury of the Fallen", "When close to death, " +
            "the bearer's strength will increase",2);*/


}
