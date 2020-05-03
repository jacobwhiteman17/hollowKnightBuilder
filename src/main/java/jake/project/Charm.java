package jake.project;

public class Charm {
    String name;
    int notchesRequired;
    String description;

    Charm(String charmName, String charmDescr, int charmNotches){
        name = charmName;
        description = charmDescr;
        notchesRequired = charmNotches;
    }

    public String getName(){
        return name;
    }

    public int getNotchReq(){
        return notchesRequired;
    }


    public void printme(){
        System.out.println("Name:" + name);
        System.out.println("    Description:" + description);
        System.out.println("    Notch Cost:" + Integer.toString(notchesRequired));
    }
}
