//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static <days> void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Колёк";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Задача 2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("Задача 3");
        fullName = fullName.replace("ё", "е" );
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName);
    }
}
