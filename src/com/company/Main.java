package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int a1=1;
        int a2=1;
        int a3=1;
        int a4=1;
        int a5=1;
        while(true){
            Scanner Obj = new Scanner(System.in);

        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("        1.Name              ");
        System.out.println("        2.Students Id       ");
        System.out.println("        3.Gender            ");
        System.out.println("        4.Marks of subs     ");
        System.out.println("        5.Total Percentage  ");

        int o = Obj.nextInt();

        if (o == 1) {
            System.out.println("**************");
            System.out.println("Name of the student");
            a1 = Obj.nextInt();
            System.out.println("*          1. Back to Home           *");
            int b = Obj.nextInt();
              else  {
                break;
            }
              
        }
        }
    }
}
