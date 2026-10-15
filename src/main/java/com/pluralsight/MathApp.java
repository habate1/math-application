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

        // question 3:
        // radius of a circle
        double radius = 7.25;
        // calculate the area by radius to the power of 2 times pi
        double area = Math.pow(radius, 2) * Math.PI;
        // print area of the circle
        System.out.println("The area of the circle is " + area);

        // quesiton 4. find and display the square root
        double value = 5.0;
        double squareRootValue = Math.sqrt((value));
        System.out.println("The square root of " + value + " is " + squareRootValue);

        // question 5. find and display the value between two points
        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;
        double d1 = x2 - x1, d2 = y2 - y1;
        double distanceValue = Math.hypot(d1, d2);
        System.out.println("The distance between point 1: (" + x1 + ", " + y1 + ") " +
                "and point 2: (" + x2 + ", " + y2 + ") is " + distanceValue);





// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
    }
}
