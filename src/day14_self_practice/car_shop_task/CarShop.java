package day14_self_practice.car_shop_task;

import java.util.ArrayList;

public class CarShop {
    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", "White", 2010, 25000),
                new Audi("Q6", "Red", 2014, 32000),
                new Honda("Accord", "White", 2011, 20000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
        };

        System.out.println("CARS FOR RECALL:");
        for (Car car : cars) {
            if (car instanceof Honda) {
                if (car.yearOfManufacturing >= 2010 && car.yearOfManufacturing <= 2011) {
                    System.out.println("Eligible for recall:" + car);
                }
            } else if (car instanceof Audi) {
                if (car.yearOfManufacturing >= 2015 && car.yearOfManufacturing <= 2019) {
                    System.out.println("Eligible for recall:" + car);
                }
            } else if (car instanceof Tesla) {
                if (car.yearOfManufacturing >= 2015 && car.yearOfManufacturing <= 2016) {
                    System.out.println("Eligible for recall:" + car);
                }
            }

        }
        System.out.println("-------------------------------");
        int PriciestCar = 0;
        int biggestCarPrice = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < cars.length; j++) {
                if (biggestCarPrice < cars[j].price) {
                    biggestCarPrice = cars[j].price;
                    PriciestCar = j;
                }
            }
            System.out.println("Car with the biggest price: " + cars[PriciestCar]);
        }
        System.out.println("-------------------------------");
        int cheapestCar = 0;
        int lowestCarPrice = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < cars.length; j++) {
                if (lowestCarPrice > cars[j].price) {
                    lowestCarPrice = cars[j].price;
                    cheapestCar = j;
                }
            }
            System.out.println("Car with the lowest price: " + cars[cheapestCar]);


        }

        System.out.println("-------------------------");

        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car car : cars) {
            if (car instanceof Tesla){
                teslaCars.add((Tesla)car);
            }

        }
        System.out.println(teslaCars);

    }
}
/*
Create a Class Named 'CarShop':
    - Given an array of Car objects:
            Car[] cars = {
                new Honda("Pilot","White", 2010, 25000),
                new Audi("Q6", "Red",2014, 32000),
                new Honda("Accord", "White",2011, 20000  ),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black",2019, 35000),
                new Audi("Q8", "White",2018, 40000),
                new Audi("Q5", "Purple",2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red",2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue",2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue",2014, 48000),
            };

    - Tasks:
        1.2. Display all cars eligible for recall:
            - Honda: Years 2010 to 2011
            - Audi: Years 2015 to 2019
            - Tesla: Years 2015 to 2016
        1.3. Display the car with the highest price.
        1.4. Display the car with the lowest price.
        1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.


 */