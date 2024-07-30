class DeveloperTest{
    public static void main(String[] args){
        System.out.println("Test started");

        Developer dev1 = new Developer();

        dev1.displayStatus();

        Developer dev2 = new Developer("Pepper");
        dev2.displayStatus();

    }
}