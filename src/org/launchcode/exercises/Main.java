package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Divide(3,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Max", "Dumb.exe");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            String key = student;
            String value = studentFiles.get(key);
            System.out.println(student + ": " + CheckFileExtension(value));
        }
    }

    public static void Divide(int x, int y)
    {
        int z;
        // Write code here!
        try {
            z = x/y;
            System.out.println(z);
        } catch(Exception e) {
            System.out.println("Y cannot equal 0");
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if (fileName.contains(".java")) {
            return 1;
        } else if (fileName == null || fileName == "") {
            try {
                throw new FileNameException("You did not turn in the assignment");
            } catch (FileNameException e) {
                e.printStackTrace();
                return -1;
            }
        }
        return 0;
    }

}
