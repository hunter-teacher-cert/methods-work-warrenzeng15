# Student version
Students are provided a skeleton code/scaffolded code. If you suspect your students would want a challenge, or know that certain students would want more of a challenge, remove all skeleton code/scaffolding.

```java
import java.io.*;

public class Main {

// write some code in main using a for loop that will calculate the sum of all numbers from 1 to a number "n". Test it by finding the sum of all numbers from 1 to 100.
       public static void main(String[] args) {                
                int n; 
                int sum;                 //use this variable to store the value of the factorial as the program iterates through the for loop

                for (                     ) {
                    
                }

        System.out.println(                   );
            }

/*
// write some code in main using a for loop that will calculate factorial of the number n. Test it by finding the factorial of 10.
        public static void main(String[] args) {
                int n; 
                int factorial;            //use this variable to store the value of the factorial as the program iterates through the for loop

                for (               ) {
                    
                }
                System.out.println(                );
            }

*/

/*
Expected output for sum:
Sum of numbers from 1 to 100 is: 5050

Expected output for factorial:
Factorial of 10 is: 3628800 

*/
```



# Teacher version/ answer key 
```java
import java.io.*;

public class Main {

       public static void main(String[] args) {
                int n = 100; 
                int sum = 0;

                for (int i = 1; i <= n; i++) {
                    sum += i;
                }

        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
            }

/*


        public static void main(String[] args) {
                int n = 10; 
                int factorial = 1;

                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + n + " is: " + factorial);
            }

*/
}
```
