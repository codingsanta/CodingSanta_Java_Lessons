# Practice Problem 2

Problem Credits: Chiran Arumugam

Topics Included: Variables, Input and Output, Methods, Mathematical Expressions

### Problem Statement

Teacher James has gone on a field trip to a maze, but is now lost! He was trapped inside a room with the only exit requiring a passcode. To help Teacher James escape the maze, write a program with the following requirements that will produce the four-part passcode for the exit.

1. Create a method firstCode() with a single parameter, int key, that returns the sum of key and the square of key. The method should return an int.
2. Create a method secondCode() with a single parameter, double key, that returns the product of key, key - 1.0, and key - 2.0, or $k * (k-1.0)*(k-2.0)$ for an input $k$.
3. Create a method thirdCode() with a single parameter, int key, that returns the remainder when key is divided by 4. The remainder is 0 if it key is a multiple of 4.
4. Create a method fourthCode(), with two parameters: String key and int encryption, which is the final part of the password, and return the encrypted username.

Make use of the above methods and the content covered in the input and output lesson to write a program that takes in information from the user and prints out the final passcode in a formatted manner.

### Sample Test Cases

---

```markdown
> java Password

Enter the key for the first code: 4
Enter the key for the second code: 5.0
Enter the key for the third code: 6
Enter the key for the fourth code: Santa
Enter the encryption pin: 789

Passcode: 20 60.0 2 Santa789

>
```

---

```markdown
> java Password

Enter the key for the first code: 3
Enter the key for the second code: 7.0
Enter the key for the third code: 10
Enter the key for the fourth code: Santa
Enter the encryption pin: 1435

Passcode: 12 210.0 2 Santa1435

>
```

---
