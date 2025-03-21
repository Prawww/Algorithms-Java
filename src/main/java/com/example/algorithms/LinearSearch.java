package com.example.algorithms;

public class LinearSearch {
    private int []list;
    private int target;
    //constructor receiving a list and the target number being searched
    public LinearSearch(int[] list, int target){
        this.list = list;
        this.target = target;
    }
    //This method has no arguments but uses the arguments provided in the constructor
    //It prevents the use of a static method
    int search(){
        for(int i = 0; i< this.list.length;i++){
            if(list[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
