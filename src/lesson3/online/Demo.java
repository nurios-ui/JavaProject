package ru.geekbrains.qa.java2.lesson3;

import java.text.DecimalFormat;

public class Demo {

    public static void main(String[] args) {
        double number = 2344.245345;
        DecimalFormat x = new DecimalFormat("###.##");
        System.out.println(x.format(number));

        double number2 = 24.2;
        DecimalFormat x2 = new DecimalFormat("###.##");
        System.out.println(x2.format(number2));

        double number3 = 24.2;
        DecimalFormat x3 = new DecimalFormat("###.");
        System.out.println(x3.format(number3));

        double number4 = 24.2;
        String template = "###.##";
        DecimalFormat x4 = new DecimalFormat(template);
        System.out.println(x4.format(number4));

    }
}
