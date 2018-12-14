import java.lang.Math;

public class Pythagorean {
  public double calculateHypotenuse(int legA, int legB) {
    double hypotenuse = (legA * legA) + (legB * legB);
    // the hypotenuse is the side across the right angle.
    double c = Math.sqrt(hypotenuse);
    // calculate the value of c given legA and legB
    // System.out.println(c);
    return c;
  }
}
