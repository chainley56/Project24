package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner kbinput = new Scanner(new File("src/StudentScores"));
        int maxIndex = -1;
        String scores [] = new String[1000];
        while(kbinput.hasNext()){
            maxIndex++;
            scores[maxIndex]=kbinput.nextLine();
            
        }

    }
}
