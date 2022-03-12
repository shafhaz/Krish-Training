package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word :");
        String word = sc.nextLine();
        word=word.toUpperCase();
        word=word.replace(" ","");


        char arr[] = word.toCharArray();
        int count=0;
        Map <Character,Integer> map=new TreeMap<>();
        for (int i=0;i<arr.length;i++){
            count=0;
            for (int j =0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            map.put(arr[i],count);
        }
        System.out.println(map);

    }
}
