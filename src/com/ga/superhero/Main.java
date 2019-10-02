package com.ga.superhero;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader;

        ArrayList<String> arrayList = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("input.txt")));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("output.txt")));
			Scanner sc = new Scanner(System.in);

            while (true) {
				System.out.print("Please Enter Name:");
				String input = sc.nextLine();
				bufferedWriter.append(input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
