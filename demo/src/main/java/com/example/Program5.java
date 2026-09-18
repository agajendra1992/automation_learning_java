package com.example;

public class Program5 {
    
    public static void main(String[] args) {
        int [] arr = {2,5,10,1,2,4,3,12,34,56};

        for (int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] ==arr[j]){
                    System.out.print(arr[i]+ ",");
                }
            }
        }

    }
}
