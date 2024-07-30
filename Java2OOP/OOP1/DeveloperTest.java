class DeveloperTest{
    public static void main(String[] args){
        System.out.println("Test started");

        Developer dev1 = new Developer();
        dev1.name = "Pepper";
        dev1.skills.add("Sleeping");
        dev1.happiness = 10;

        dev1.displayStatus();
    }
}