package com.omoto.sample;


public class NumberOfPlatform {

    public static void main(String args[]){
       double arr[] = {9.00, 9.40, 9.50, 11.00, 15.00, 18.00};
        double dep[] = {20.00, 20.00, 20.00, 20.00, 20.00, 20.00};

        System.out.print(findPlatform(arr, dep, arr.length));
    }


    public static int findPlatform(double arr[], double dep[], int n)
    {
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        while (i < n && j < n)
        {
            if (arr[i] < dep[j])
            {
                plat_needed++;
                i++;
                if (plat_needed > result)
                    result = plat_needed;
            }
            else
            {
                plat_needed--;
                j++;
            }
        }

        return result;
    }
}
