import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
  public void sum(int[] arr) {
    ArrayList<Integer> newArr = new ArrayList<Integer>();
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (arr[i] > 10) {
        newArr.add(arr[i]);
      }
    }
    System.out.println("Sum: " + sum);
    System.out.println(newArr);
  }
  public void shuffleNames() {
    ArrayList<String> nameArr = new ArrayList<String>();
    ArrayList<String> newNameArr = new ArrayList<String>();
    nameArr.add("Nancy");
    nameArr.add("Jinichi");
    nameArr.add("Fujibayashi");
    nameArr.add("Momochi");
    nameArr.add("Ishikawa");
    Collections.shuffle(nameArr);
    for (int i = 0; i < nameArr.size(); i++) {
      if (nameArr.get(i).length() > 5) {
        newNameArr.add(nameArr.get(i));
      }
    }
    System.out.println(nameArr);
    System.out.println("Names longer than 5 char: ");
    System.out.println(newNameArr);
  }
  public void shuffleABC(ArrayList<String>  abcArr) {
    ArrayList<String> vowelArr = new ArrayList<String>();
    vowelArr.add("a");
    vowelArr.add("e");
    vowelArr.add("i");
    vowelArr.add("o");
    vowelArr.add("u");
    Collections.shuffle(abcArr);
    for (int i = 0; i < vowelArr.size(); i++) {
      if (vowelArr.get(i).equals(abcArr.get(0))) {
        System.out.println("First letter is a vowel!");
      }
    }
    System.out.println("Last letter in array " + abcArr.get(25));
    System.out.println("First letter in array " + abcArr.get(0));
  }
  public ArrayList<Integer> randArray() {
    Random r = new Random();
    ArrayList<Integer> randArr = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      randArr.add(55 + (r.nextInt(46)));
    }
    System.out.println(randArr);
    return randArr;
  }
  public ArrayList<Integer>  minMaxRandArraySort(ArrayList<Integer> randArr10) {
    Collections.sort(randArr10);
    System.out.println(randArr10);
    System.out.println("The minimum value is " + randArr10.get(0));
    System.out.println("The maximum value is " + randArr10.get(9));
    return randArr10;
  }
  public String randABCString() {
    ArrayList<Object> endArr = new ArrayList<Object>();
    String str = "";
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    Random r = new Random();
    for (int i = 0; i < 5; i++) {
      str += alphabet.charAt(r.nextInt(alphabet.length()));
    }
    // System.out.println(str);
    return str;
  }
  public ArrayList<String> stringArray() {
    ArrayList<String> stringArr = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      stringArr.add(randABCString());
    }
    System.out.println(stringArr);
    return stringArr;
  }
}
