package com.company;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {

    public static class SodaCan{
        private double height;
        private double diameter;

        public SodaCan(double height, double diameter) {//constructor
            this.height = height;
            this.diameter = diameter;
        }

        double getSurfaceArea(){//return surface area
            return Math.PI*diameter*height + 2*Math.PI*Math.pow(diameter/2, 2);
        }

        double getVolume(){//return volume
            return Math.PI*Math.pow(diameter/2, 2)*height;
        }
    }
    public static void main(String[] args) {
	    System.out.print("Enter Soda Can’s height and diameter, use space to separate elements: ");
        Scanner Userin = new Scanner(System.in);
        String input = Userin.nextLine();
        String numbers[] = input.split(" ");//get the input
        SodaCan obj = new SodaCan(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1]));//object established
        //decision process referenced by: https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
        BigDecimal bd = new BigDecimal(obj.getVolume()).setScale(2, RoundingMode.HALF_UP);
        BigDecimal ac = new BigDecimal(obj.getSurfaceArea()).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Soda CanVolume: " + bd.doubleValue());
        System.out.println("Soda CanArea: " + ac.doubleValue());
    }
}
