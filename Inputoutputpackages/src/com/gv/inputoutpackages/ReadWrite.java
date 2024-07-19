package com.gv.inputoutpackages;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder inputBuilder = new StringBuilder();
        
        try {
            // Input from keyboard
            System.out.println("Enter number:");
            int number = Integer.parseInt(br.readLine());
            System.out.println(number);

            // File write operation
            // Uncomment if you want to write some predefined text to the file
            // try (BufferedWriter bw = new BufferedWriter(new FileWriter("demo.txt"))) {
            //     bw.write("adsbgrynun66ber");
            //     bw.newLine();
            //     bw.write("'adsbgrynun66ber");
            //     bw.newLine();
            //     bw.write("'adsbgrynun66ber");
            //     bw.newLine();
            //     bw.write("adsbgrynun66ber");
            // }

            // File read operation
            try (BufferedReader br2 = new BufferedReader(new FileReader("demo.txt"))) {
                String line;
                while ((line = br2.readLine()) != null) {
                    System.out.println(line);
                }
            }

            // Take input and store it in the file until '$' is entered
            String line = "";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("demo.txt", true))) {
                System.out.println("Enter text to store in the file (enter '$' to stop):");
                while (!line.equals("$")) {
                    line = br.readLine();
                    if (!line.equals("$")) {
                        inputBuilder.append(line).append(" ");
                        bw.write(line);
                        bw.newLine();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        
        // Tokenize the concatenated input string
        String input = inputBuilder.toString();
        System.out.println("Tokenizing the input:");
        StringTokenizer token = new StringTokenizer(input, ",.; ");
        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
    }
}
