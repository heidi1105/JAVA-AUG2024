import java.util.ArrayList;

class Developer{
    // 1. Private Member variables / attributes / properties
    // Access modifier should be private, NEVER PUBLIC!!!!
    // Private : provide access in the same class, NO ACCESS in other classes
    private String name;
    private ArrayList<String> skills;
    private int happiness;
    private boolean hasLife;

    // class attribute
    private static int devCount; 
    // default of int: 0 | default of Integer: Null
    private static int totalHappiness;

    // 2. Constructors
    public Developer(){ // zero-argument constructor
        this.name = "Anonymous hacker";
        this.skills = new ArrayList<String>();
        this.skills.add("Code");
        this.happiness = 5;
        this.hasLife = true;
        devCount++; // THIS -- refers to the instance
        totalHappiness += this.happiness;
    }


    public Developer(String name){
        this.name = name;
        this.skills = new ArrayList<String>();
        this.skills.add("Debug");
        this.skills.add("Drinking coffee while typing");
        this.happiness = 7;
        this.hasLife = false;
        devCount++;
        totalHappiness += this.happiness;
    }

    // 3. Getters/setters : 
    // GETTERS : NO parameters, with return
    public String getName(){
        return this.name;
    }

    // SETTERS: WITH parameters, NO return
    public void setName(String name){
        this.name = name; 
        // THIS refers to the instance
        // name without THIS refers to the variable from parameters
    }

    public ArrayList<String> getSkills(){
        return this.skills;
    }

    public void setSkills(ArrayList<String> skills){
        this.skills = skills;
    }


    public int getHappiness(){
        return this.happiness;
    }

    public void setHappiness(int happiness){
        this.happiness = happiness;
    }


    public boolean getHasLife(){
        return this.hasLife;
    }

    public void setHasLife(boolean hasLife){
        this.hasLife = hasLife;
    }

    public static int getDevCount(){
        return devCount;
    }

    public static int getTotalHappiness(){
        return totalHappiness;
    }

    // 4. Other Methods
    public void displayStatus(){
        System.out.println("===============");
        System.out.println("Name: " + this.name);
        System.out.println("Skills: " + this.skills);
        System.out.println("Happiness: " + this.happiness);
        System.out.println("Has life?: " + this.hasLife);
    }

    public void havingErrors(){
        this.happiness--;
        totalHappiness--;
        System.out.println(this.name + " is having some bugs... Not fun");
    }

    public void debug(){
        this.happiness+= 2;
        totalHappiness+= 2;
        System.out.println(this.name + " is able to fix the bug!!! ");
    }

}