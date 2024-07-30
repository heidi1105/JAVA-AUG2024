import java.util.ArrayList;

class Developer{
    // 1. Member variables / attributes / properties
    public String name;
    //     specify the datatype        to instantiate the list so that it could hold data
    public ArrayList<String> skills = new ArrayList<>();
    // ** Null Pointer Exception if it is not instantiated
    public int happiness;
    public boolean hasLife;

    // 2. Methods
    public void displayStatus(){
        System.out.println("===============");
        System.out.println("Name: " + this.name);
        System.out.println("Skills: " + this.skills);
        System.out.println("Happiness: " + this.happiness);
        System.out.println("Has life?: " + this.hasLife);
    }

}