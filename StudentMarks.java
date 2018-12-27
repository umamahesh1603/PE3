package com.stackroute.unittest.pe3;

import java.util.*;
import java.util.Scanner;

public class StudentMarks {




    public static void main(String[] args){

        int numOfStudents;
        System.out.println("Enter no of students:");
        Scanner sc=new Scanner(System.in);
        numOfStudents=sc.nextInt();


        CheckGrade ch=new CheckGrade();
        ch.error(numOfStudents);
    }


}
