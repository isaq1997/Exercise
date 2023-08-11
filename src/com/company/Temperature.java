package com.company;

public class Temperature {
    public static void main(String[] args) {
        double celcius=36.5;
        double cc[]=new double[2];
        cc[0]=celcius+273.15;
        cc[1]=1.8*celcius+32;
        for (int i=0;i<cc.length;i++){
            System.out.println(cc[0]+" "+cc[1]);
        }
    }
}
