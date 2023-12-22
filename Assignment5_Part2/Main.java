package Assignment5_Part2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        scannerReadFile("input.txt");
        System.out.println();
        bufferReaderFile("input.txt");
        String[] strings1 = {"Hello, this is line 1." ,
                            "Java File I/O is interesting!" ,
                            "End of the assignment."};

        String[] strings2 = {"Appending new line." ,
                            "File I/O without buffers."};

        writeToFile("output.txt", strings1 );
        appendToFile("output.txt", strings2 );
        writeWithoutBuffer("custom.txt","Hello!");

    }

    public static void scannerReadFile(String filename){
        Scanner scanner = null;
        String str;
        try {
            scanner = new Scanner(new FileInputStream(filename));
        }catch(FileNotFoundException e) {
            System.out.println("The file is not exist. ");
            System.exit(0);
        }
        while (scanner.hasNext()){
            str = scanner.nextLine();
            System.out.print(str);
            System.out.println(" Number of characters: " + countCharacters(str));
        }
        scanner.close();
    }

    public static void bufferReaderFile(String filename){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countCharacters(String string){
        int count = 0;
        for(char c : string.toCharArray()) {
            if (!Character.isWhitespace(c) && c!='.') {
                count++;
            }
        }
        return count;
    }

    public static void writeToFile(String filename,String[] strings){
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream(filename));
            for (String str :strings){
                printWriter.println(str);
            }
        } catch(FileNotFoundException e) {
            System.out.println("The file is not exist. ");
            System.exit(0);
        }
        printWriter.close();
    }

    public static void appendToFile(String filename, String[] strings) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream(filename,true));
            for (String str :strings){
                printWriter.println(str);
            }
        } catch(FileNotFoundException e) {
            System.out.println("The file is not exist. ");
            System.exit(0);
        }
        printWriter.close();
    }

    private static void writeWithoutBuffer(String filename, String string) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
