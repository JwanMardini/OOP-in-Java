import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Example on write and read from a file
        // I/O Streams
        // Stream is a logical connection between the program and the file
        // input stream is to read data from a file
        // output stream is to write data into a file
        // It only transfers Byte(binary) and Character. Byte Streams, Character Streams
        // Binary file examples are Image, video, audio , Textual. Character Streams file example is Textual data
        // To use byte stream, we use Abstract Classes Input stream and Output stream
        // To use character stream, we use abstract classes Reader and Writer
        // Every class has a writ and a read methods to handel data
        // There are subclasses to the abstract classes to handle different type of data
        // By reading Byte data that means it reads character by character that are in 8-bits


        // Byte stream //
        // How to read data from a file using FileInputStream

        /*File f = new File ("a.txt");
        FileInputStream fis = new FileInputStream(f);*/
        /*int data;
        while((data = fis.read()) != -1) {
            System.out.println((char) data);
        }*/

        // Reads the files an inserts it into an array
        /*byte [] b = new byte[(int)f.length()];
        fis.read(b);
        String s = new String(b);
        System.out.println(s);
        // Reads the specific index you want
        System.out.println((char) b[0]);
        fis.close();*/

        // How to write data into a file using FileOutputStream

        /*FileOutputStream fos = new FileOutputStream("Test.txt");
        //fos.write(10);
        fos.write("Jwan".getBytes());
        //fos.write("مرحبا".getBytes("UTF-8"));
        FileInputStream fis = new FileInputStream("Test.txt");
        fos.flush();*/

        // How to read images, videos, audios, text files
        /*File file = new File("C:\\Users\\jwan9\\OneDrive\\Bilder\\pic.jpg");

        FileInputStream fin = new FileInputStream(file);
        byte b[] = new byte [(int) file.length()];
        fin.read(b);

        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }

        // Write the image we readied
        FileOutputStream fos = new FileOutputStream("C:\\Users\\jwan9\\OneDrive\\Bilder\\pic2.jpg");
        fos.write(b);
        fos.flush();
        fos.close();
        fin.close();*/

        // File class
        // The File class is Javas representation of a file or directory pathname.
        // The File class contains several methods for working with the pathname, deleting and renaming files,
        // creating new directories, listing the contents of a directory, and determining several common attributes
        // of files and directories.

        // Conctructor 1
        //Creates a new file
        /*File f = new File("abc.txt");
        f.createNewFile();*/

        // Creates a new folder
        /*File f = new File ("folder");
        f.mkdir();*/

        // Creates a folder inside a folder
        /*File f = new File ("folder/1/2");
        f.mkdirs();
        // Deletes a folder and files
        f.delete();
        // Shows the contents of a folder
        String [] arr = f.list();
        if(f.isDirectory()){
            for (String s:arr){
                System.out.println(s);
            }
        }*/

        // Constructor 2
        // Creats a file inside a folder
        /*File f1 = new File("folder");
        File f = new File(f1,"c.txt");
        //f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write("Jwan".getBytes());
        FileInputStream fin = new FileInputStream(f);
        int input;
        while ((input = fin.read()) != -1) {
            System.out.println((char) input);
        }*/



        // Char stream //
        // write to file using FileWriter class
        /*String s = "Hello";
        FileWriter fr = new FileWriter("Test.txt");
        fr.write(s);
        fr.write("\n");
        fr.write(s, 1, 2); // writes how many letters you want
        fr.write("\n");
        fr.write("AA");
        fr.close();*/

        // Read files using File reader, it reads byte by byte aswell
        /*File file = new File("Test.txt");
        FileReader frr = new FileReader(file);
        int i;
        while ((i=frr.read()) != -1) {
            System.out.print((char) i);
        }
        // Reads the data in a file and insert it into an array
        char[] ch = new char [(int)file.length()];
        frr.read(ch);
        for (char c: ch){
            System.out.print(c);
        }
        frr.close();*/



        // To read and write line by line we use the classes BufferedWriter to write and BufferedReader and Scanner to read.
        // BuffredWriter

        /*FileWriter fw = new FileWriter("Test.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(97);
        bw.newLine();
        bw.write("AAA");
        bw.flush();
        bw.close();*/

        // To append into file
        /*FileWriter fw = new FileWriter("Test.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write(97);
        bw.newLine();
        bw.write("AAA");
        bw.flush();
        bw.close();*/

        // Buffered reader
        // Buffered reader is the best to read large sized files
        // The defult buffer size of the BufferedReader class is 8 KB.

        /*BufferedReader br = new BufferedReader(new FileReader("Test.txt"));
        String line = br.readLine();
        while(line != null) {
            System.out.println(line);
            line = br.readLine();
        }*/


        // PrintWriter writes tha data as it is
        // most used class to write textual data
        /*FileWriter fr = new FileWriter("a.txt");
        PrintWriter pr = new PrintWriter(fr, true); //true is for autofluchable for only println
        pr.println(97);
        pr.println(1.5);
        pr.println("Aaa");
        pr.println("b");
        pr.println(true);

        pr.write(98);
        pr.flush();

        pr.close();*/

        // Scanner class
        /*File file = new File("Test.txt");
        Scanner scan = new Scanner (file);
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }*/



        // How to write and read multiple objects from a file

        //write an object
        File file = new File("Student.txt");
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        Student s1 = new Student(111, "Jwan", 99);
        oos.writeObject(s1);*/

        // read an object
        /*ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Student s1 = (Student)ois.readObject();
        System.out.println(s1);*/

        // write an array of objects
        /*Student s1= new Student(111, "Jwan", 99);
        Student s2= new Student(113, "Mazen", 22);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(studentList);


        // Read an array of objects
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Student> studentList2 = (ArrayList<Student>) ois.readObject();
        for (Student s: studentList2) {
            System.out.println(s);
        }
        ois.close();
        oos.close();*/




    }
}