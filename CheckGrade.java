package com.stackroute.unittest.pe3;

import java.util.Scanner;
public class CheckGrade {



   void error(int numOfStudents) {

       Scanner sc=new Scanner(System.in);

       int[] stuGrades= new int[numOfStudents];

       System.out.println("Enter grades of students:");


       for(int i = 0; i <numOfStudents ; i++)
       {
           stuGrades[i] = sc.nextInt();

           // chek if grade is between 0 and 100
           if ((stuGrades[i] >= 0) && (stuGrades[i] <= 100)) {

               continue;
           }
           System.out.println("Invalid grade,try again..");
       }
       }
 }


