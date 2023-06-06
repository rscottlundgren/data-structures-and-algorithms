# 1502. Can Make Arithmetic Progression From Sequence
1. [The Problem]()
1. [Running The Solution]()

## The Problem
### Description
A sequence of numbers is called an **arithmetic progression** if the difference between any two consecutive elements is the same.

Given an array of numbers `arr`, return `true` if the array can be rearranged to form an **arithmetic progression**. Otherwise, return `false`.

### Example 1
```
**Input:** arr = [3,5,1]
**Output:** true
**Explanation:** We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
```

### Example 2
```
**Input:** arr = [1,2,4]
**Output:** false
**Explanation:** There is no way to reorder the elements to obtain an arithmetic progression.
```

### Constraints
- `2 <= arr.length <= 1000`
- `10<sup>6</sup> <= arr[i] <= 10<sup>6</sup>`

## Running The Solution
### Java

**NOTE: In order to run the Java implementation of this solution you will need to have Java 8 or later installed on your on your local machine.**

1. Clone [this repo](https://github.com/rscottlundgren/data-structures-and-algorithms) to your local machine.
2. Once successfully cloned, navigate into this folder (data-structures-and-algorithms/leetcode/1502_Can-Make-Arithmetic-Progression-From-Sequence) in your local terminal
3. Run the following command within your terminal to compile the program:
   ```
   javac Solution.java
   ```
4. Upon successful compilation of the file, run the following command in your terminal to execute the program:
   ```
   java Solution
   ```
   _Note: If you'd rather "compile and run" in one fell swoop, you can run the following command in your terminal to complete both actions sequentially with a single command:_
   ```
   javac Solution.java && java Solution
   ```

### Javascript

### Python