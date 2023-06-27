package org.example;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LocalDate date=LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()); //scannnerden de istenilen tarixi yazib yoxlaya bilersiniz
        LocalDate date1 = LocalDate.of(2023, 04, 23);
        DayOfWeek dayOfTheWeek = date.getDayOfWeek();
        boolean weekEnd = true;
        if (weekEnd = true) {
            System.out.println("Bu tarix heftesonuna dusur");
        }else{
            System.out.println("Tarix heftesonuna dusmur");
        }
    }
}
