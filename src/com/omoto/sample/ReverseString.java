package com.omoto.sample;


public class ReverseString {

    public static String reverseString(String str){
        String reverse = "";

        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }

    public static void main(String[] args){

        String data = "omoto";
        System.out.println("Original String: "+data);

        System.out.println("Reversed String: "+reverseString(data));
    }
}
