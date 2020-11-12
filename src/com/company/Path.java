package com.company;
import java.io.File;
import java.io.IOException;

public class Path {
    public static void main(String[]args){
        printFilePath("H:\\java practice\\src\\com\\company\\test.txt");
        printFilePath(".." + File.separator + "notes.txt");//File.separator會依照不同的os做改變window是"/"
    }
    public static void printFilePath(String pathname) {
        File f = new File(pathname);
        System.out.println("File  Name: " + f.getName());   //檔案名稱
        System.out.println("File  exists: " + f.exists());  //檔案是否存在
        System.out.println("Absolute Path: " + f.getAbsolutePath());    //絕對路徑

        try {
            System.out.println("Canonical Path: " + f.getCanonicalPath());  //規範路徑
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
