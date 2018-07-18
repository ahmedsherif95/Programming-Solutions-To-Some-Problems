// Codingbat Array-1 problem : fizzString2   
// Problem Link: http://codingbat.com/prob/p115243

public String fizzString2(int n)
{
  if(n % 3 == 0 && n % 5 == 0)
  {
    return "FizzBuzz!";
  }
  if(n % 3 == 0)
  {
    return "Fizz!";
  }
  if(n % 5 == 0)
  {
    return "Buzz!";
  }
  return n + "!";
}
