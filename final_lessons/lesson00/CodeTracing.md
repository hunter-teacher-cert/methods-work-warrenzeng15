### Trace through each piece of code and write out what it the computer will output!
<!-- Most of these trace problems are very simple, so I only provided a table for the last one.
Once done/when time is up, make sure to go over questions 1 & 2, 5, 7, and 8-->

1.
```java
int i = 0;
while (i < 3){
  System.out.println("Hi!");
i = i + 1;
}
```
What does the code output?  
answer:  
Hi!  
Hi!  
Hi!  


2.
```java
int i = 3;
while (i > 0){
  System.out.println("Hi!");
i = i - 1;
}
System.out.println("Bye!");
```
What does the code output?  
answer:  
Hi!  
Hi!  
Hi!  
Bye!  


3. 
``` java
int i = 3;
while (i < 6) {
  System.out.println(i);
  i += 1;    // i+=1 is the same as i = i +1;
}
```
What does the code output?  
answer:  
3  
4  
5  


4. 
``` java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;          // i++ is the same as i +=1; 
}
```
What does the code output?  
answer:  
1  
2  
3  
4  
5  


5. 
``` java
int i = 10;
while (i >= 1) {
    System.out.println(i);
    i--;          
}
```
What does the code output?  
answer:  
10  
9  
8  
7  
6  
5  
4  
3  
2  
1  


<!-- little bit of a trick question -- it's an infinite loop-->
7.
```java
int i = 0;
while (i <= 10) {
    System.out.println(i*2);        
}

```
What does the code output?  
answer:  
the computer will keep on printing out the number 2 on a new line. Infinite loop.  


8.
``` java
int x = 3;
int i = 0;
while (i < 3) {
  x += 1;
  i += 1;
}
System.out.println(x);

```
What does the code output?  
answer:  
6  

table provided: (students will receive just the first row)  
|i||x|  
 0   3  
 1   4  
 2   5  
 3   6  




