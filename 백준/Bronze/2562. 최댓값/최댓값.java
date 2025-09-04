import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int n = 9;

      

    ArrayList<Integer> nums = new ArrayList<>();

    for (int i = 0; i < n; i++) {

        int num = in.nextInt();

        nums.add(num);

    }

    int max = Collections.max(nums);

    int idx = nums.indexOf(max) + 1;

    System.out.println(max);
    System.out.println(idx);

  }

}