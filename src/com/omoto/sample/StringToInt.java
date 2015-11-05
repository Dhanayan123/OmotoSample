package com.omoto.sample;


public class StringToInt {

    public static void main(String args[]){

        String data = "2558";
        System.out.print("int value : "+stringToInteger(data));

    }

    public static int stringToInteger(String str) {
        int answer = 0, factor = 1;
        for (int i = str.length()-1; i >= 0; i--) {
            answer += (str.charAt(i) - '0') * factor;
            factor *= 10;
        }
        return answer;
    }
}
