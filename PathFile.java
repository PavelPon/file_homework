package com.company;
import java.lang.*;
import java.io.File;
import java.io.FileWriter;
import java.io.*;

public class PathFile {
    public String pathFile(String path) throws IOException {
        File filePath = new File(path);
        try {
            if (!filePath.exists()) {
                filePath.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            File[] list = filePath.listFiles();
            String listString = "";
            for (File item : list) {
                if (item.isDirectory()){
                    pathFile(item.getAbsolutePath());
                    listString += item + "\n";
                    if (list == null)
                        return listString;
                }else {
                listString += item + "\n";
                if (list == null)
                    return listString;}
            }

//            try {
//
//                for (File itemsToFile : list) {
//                    if (itemsToFile.isDirectory()) {
//                        pathFile(itemsToFile.getAbsolutePath());
//                        System.out.println("Папка:" + itemsToFile.getPath());
//                    } else {
//                        System.out.println("Файл:" + itemsToFile.getPath());
//                    }
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
            //}
            FileWriter writer = null;
            try {
                writer = new FileWriter("//Users//pavelponomarev//Files//Dir2//File2.txt");
                writer.write(listString);
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }
}
