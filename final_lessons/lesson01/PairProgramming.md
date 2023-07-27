
 
 int number = 5; // You can change this number to demonstrate other tables

        System.out.println("Multiplication Table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }




        int lowerBound = 10;
        int upperBound = 50;

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");

        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    
