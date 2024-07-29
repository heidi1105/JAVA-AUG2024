import java.util.ArrayList;
class VoiceMessageTest{
    public static void main(String[] args){
        // Dependency Injection
    //  datatype        var name     instantiate the new bot  based on util class
        VoiceMessageUtil newBot = new VoiceMessageUtil();
        System.out.println(newBot.greetMessage());
        System.out.println(newBot.greetMessage("Pepper"));
        System.out.println(newBot.greetMessage(123));

        newBot.greetWithTime();

        // 5. Casting (implicit & explicit)
        // 5.1 implicit: no loss of data (int --> double)
        int intAge = 15; // 15
        double intToDoubleAge = intAge; // 15.0

        System.out.println(intAge);
        System.out.println(intToDoubleAge);

        // 5.2 explicit: loss of data (double --> int )
        double doubleWeight = 20.6; // 20.6
        int doubleToIntWeight = (int) doubleWeight; // lose decimal place
        System.out.println(doubleWeight);
        System.out.println(doubleToIntWeight);

        // 6. Fixed Array
        int[] messagesPerDay = new int[3]; // create fixed size array without default value
        int[] messagesPerDay2 = { 7, 2, 5, 8}; // create fixed size array with default value
        System.out.println(messagesPerDay2); // int is primitive type: no null

        newBot.printArray(messagesPerDay2);

        String[] messages = {"Please call back!", 
            "Make sure you install jdk", 
            "DO NOT INSTALL VS CODE EXTENSION!"};

        newBot.printArray(messages);

        // 7. ArrayList
        // 7.1 instantiation of ArrayList 
        // (Left: datatype, right: instantiation to create the box to fold all data)
        ArrayList<String> reminders = new ArrayList<>(); // only works if it is the same line
        // No more push. Make use of ArrayList methods
        reminders.add("Stay hydrated!");
        reminders.add("Do the assignments!");
        reminders.add("Take some rest");
        reminders.add("Eat some veggies");

        // update
        reminders.set(1, "Read ahead");

        // remove
        // reminders.remove(1);
        reminders.remove("Stay hydrated!");

        System.out.println(reminders);
        System.out.println(reminders.get(0));
        System.out.println(reminders.size());
        newBot.printArray(reminders);
    }
}