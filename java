class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
      
      int d = a2 - a1;
      int nthTerm = a1 +(n-1)*d;
      return nthTerm;
    }
}


This function nthTermOfAP() calculates the nth term of an arithmetic series, given the first two terms a1 and a2.
int d = a2 - a1;: This line calculates the common difference d between consecutive terms in the arithmetic series. 
In an arithmetic series, each term is obtained by adding the common difference to the previous term.

int nthTerm = a1 + (n-1) * d;
This line calculates the nth term of the arithmetic series using the formula for the nth term of an arithmetic series: 

 nthTerm = a1 + (n−1) × d.

a1 is the first term of the series.
(n-1) represents the number of common differences we need to add to the first term to reach the nth term.
d is the common difference between consecutive terms.
Finally, the function returns the calculated nth term of the arithmetic series.

Let's understand with an example:

Example:
Given a1 = 2, a2 = 3, and n = 4.

Calculate the common difference: 
d = 3 − 2 = 1.
Calculate the nth term: 

nthTerm = 2+(4−1)×1 = 5.
So, for this example, the 4th term of the arithmetic series is 5.  
    
