package com.lab;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));) {

            String line;

            // Чтение input.txt файла по строкам
            while ((line = reader.readLine()) != null) {

                // Проверка, является ли срока числом
                int number = Integer.parseInt(line);

                // Проверка, является ли число чётным
                if (number % 2 == 0) {

                    // Запись числа в output.txt файл
                    writer.write(line);
                    writer.newLine();
                }
            }

            // Закрытие источников reader и writer не обязательно потому что используется try with resources
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

