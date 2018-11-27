package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File oneFile = new File("//Users//pavelponomarev//Files//Dir");
        try {
            if (!oneFile.exists()) {
                oneFile.mkdir();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        File twoFile = new File("//Users//pavelponomarev//Files//Dir2");
        try {
            if (!twoFile.exists()) {
                twoFile.mkdir();
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        File treeFile = new File("//Users//pavelponomarev//Files//Dir//File1.txt");
        try {
            if (!treeFile.exists()) {
                treeFile.createNewFile();
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        File fourFile = new File("//Users//pavelponomarev//Files//Dir2//File2.txt");
        try {
            if (!fourFile.exists()) {
                    fourFile.createNewFile();
                }
        } catch (
                Exception e) {
            e.printStackTrace();
        }

            FileWriter fileWriterOne = new FileWriter(treeFile);
            try {
            BufferedWriter bufferedWriterOne = new BufferedWriter(fileWriterOne);
            bufferedWriterOne.write("Привет, мой новый друг!");
            bufferedWriterOne.newLine();
            bufferedWriterOne.write("Это безумный мир Андройда!");
            bufferedWriterOne.flush();
            bufferedWriterOne.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            if (treeFile != null) fileWriterOne.close();
        }

        FileReader fileReaderOne = new FileReader(treeFile);
        BufferedReader bufferedReaderOne = new BufferedReader(fileReaderOne);
        while (bufferedReaderOne.ready()) {
            System.out.println(bufferedReaderOne.readLine());
        }
        PathFile pathFileone = new PathFile();
        pathFileone.pathFile("//Users//pavelponomarev//Files//");
    }


}
