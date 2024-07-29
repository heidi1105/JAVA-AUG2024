class JavaBasic{
    // method signature 
    public static void main(String[] args){
        // 1. compile java (javac & java)
        System.out.println("Welcome to Java stack");

        // 2. variables (int, double, boolean, char, String )
        /*
            Naming Convention:
            - FileName/ClassName : PascalCase
            - methodName/varName : camelCase
            - NO snake_cake
        */
        String projectTitle = "Cafe Java";
        String developer = "Heidi";
        int totalFiles = 2;
        boolean isDone = true;
        double requiredTime = 1.5;
        char difficulty = 'B'; // single quote for Characters, double quote for string
        System.out.println(projectTitle + " - " + developer);
        System.out.println("Total files: " + totalFiles);

        Integer testInteger = null;
        // Wrapper class: more methods to use, allow null

        // 3. conditionals & ternary
        if(isDone){
            System.out.println(projectTitle + " is complete");
        }else{
             System.out.println(projectTitle + " is not complete");
        }

        if(totalFiles > 1){
            System.out.println("You have to zip the files before submission");
        }

        System.out.println(totalFiles > 1 ? "You have to zip the files" : "There is only one file");

        // 4. String methods (.length, concat, format, .equals)

        System.out.println("Title length: " + projectTitle.length());

        String projectDetails = projectTitle + " ---- " + developer;
        String projectDetails2 = projectTitle.concat(" ---- ").concat(developer);

        System.out.println(projectDetails);
        System.out.println(projectDetails2);

        String projectDetails3 = String.format("Project Title : %s | Required Time: %.2f", projectTitle, requiredTime);
        System.out.println(projectDetails3);

        String name1 = "Heidi";
        String name2 = "Heidi";
        String name3 = new String("Heidi");
        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false, comparing the memory location

        System.out.println(name1.equals(name3)); // .equals compare the elements within the string
    
    } 

}