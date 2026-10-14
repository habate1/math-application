package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
// Question 1:
// declare and initialized salary variables here
        int bobSalary = 40000, garySalary = 50000;
        // with Math.max to determine which salary is greater
        int highestSalary = Math.max(bobSalary, garySalary);
        // print the highest salary
        System.out.println("The highest salary is " + highestSalary);

        // question 2.
        // initialize car and truck price variables. find the smallest value of the two
        int carPrice = 25000, truckPrice = 30000;
        int cheapestPrice = Math.min(carPrice, truckPrice);
        // print to screen the cheaper option
        System.out.println("The cheapest option cost $" + cheapestPrice);

        // radius of a circle
        double radius = 7.25;
        // calculate the area by radius to the power of 2 times pi
        double area = Math.pow(radius, 2) * Math.PI;
        // print area of the circle
        System.out.println("The area of the circle is " + area);


// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
    }
}
