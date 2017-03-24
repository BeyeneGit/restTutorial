package com.tafesse.jaxrs;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by eigenaar on 23-3-2017.
 */

public class MainLab {
    private static final String fileName = "file/test.txt";
    public static void main(String[] args) {
        MainLab lab = new MainLab();
        System.out.println("Content is: "+ lab.readFile(fileName));

    }


    private String readFile(String filePath){
        StringBuilder stringBuilder = new StringBuilder();
         ClassLoader classLoader =  getClass().getClassLoader();
        File file = new File(classLoader.getResource(filePath).getFile());
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                stringBuilder.append(line);
            }
            scanner.close();

        }
        catch (IOException ex){
           ex.printStackTrace();
        }
        return  stringBuilder.toString();

    }
}
