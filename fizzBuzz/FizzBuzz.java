public class FizzBuzz {
  public String fizzbuzz(int number) {
    if ((number % 5 == 0) && (number % 3 == 0)) {
      String word = "FizzBuzz";
      return word;
    }
    else if (number % 5 == 0) {
      String word = "Buzz";
      return word;
    }
    else if (number % 3 == 0) {
      String word = "Fizz";
      return word;
    }
    else {
      String word = "" + number;
      return word;
    }
    // return word;
  }
}
