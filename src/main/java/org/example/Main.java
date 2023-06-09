package org.example;

import java.util.Scanner;

public class Main {
    static String help = "/getMarks - получить оценки учеников\n/addMark - добавить оценку";
    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", "Иванов"),
                new Student("Вася", "Пупкин"),
                new Student("Ринат", "Веселый")
        };
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(help);
            String command = scanner.nextLine();
            if (command.equals("/getMarks")) {
                System.out.println("Введите название предмета: ");
                String course = scanner.nextLine();
                System.out.println("Введите фамилию ученика: ");
                String lastName = scanner.nextLine();
                String result = "Ученик не найден";
                for (Student student : students) {
                    if (lastName.equals(student.lastName)) {
                        result = course + " " + student.getMark(course);
                    }
                }
                System.out.println(result);
            } else if (command.equals("/addMark")) {
                System.out.println("Введите название предмета: ");
                String course = scanner.nextLine();
                System.out.println("Введите фамилию ученика: ");
                String lastName = scanner.nextLine();
                String result = "Ученик не найден";
                for (Student student : students) {
                    if (lastName.equals(student.lastName)) {
                        System.out.println("Введите оценку: ");
                        String mark = scanner.nextLine();
                        student.addMark(course, Integer.parseInt(mark));
                        result = "Оценка добавлена";
                    }
                }
                System.out.println(result);
            }
        }
    }
}