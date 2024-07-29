import java.util.Date; // ArrayList, Random
import java.util.ArrayList;
public class VoiceMessageUtil{
    // method
    public String greetMessage(){
        return "Hi!";
    }

    public String greetMessage(String name){
        return "Hi, " + name;
    }

    public String greetMessage(int count){
        return "Hi count " + count;
    }

    public void greetWithTime(){
        Date currentTime = new Date();
        System.out.println("Hi, it is " + currentTime);
    }

    // 8. Loops & Enhanced for-loop
    // traditional for-loop
    public void printArray(int[] intArray){
        for(int i = 0; i<intArray.length; i++){
            System.out.println(i + " : " + intArray[i]);
        }
    }

    // enhanced for-loop
    public void printArray(String[] stringArray){
        for(String element : stringArray ){ 
            System.out.println(element);
        }
        // cannot have access to idx
        // cannot alter the data
    }

    public void printArray(ArrayList<String> strList){
        for(String element : strList ){ 
            System.out.println(element);
        }
    }

}