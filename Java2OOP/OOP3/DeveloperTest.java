class DeveloperTest{
    public static void main(String[] args){
        System.out.println("Test started");
        System.out.println(Developer.getDevCount());

        Developer dev1 = new Developer();

        dev1.displayStatus();

        Developer dev2 = new Developer("Pepper");
        dev2.displayStatus();

        System.out.println(Developer.getDevCount());
        System.out.println(Developer.getTotalHappiness());

        dev1.havingErrors();
        dev2.debug();
        System.out.println(Developer.getTotalHappiness());

    }
}