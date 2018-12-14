import java.util.ArrayList;

public class Basics {
  public void counter() {
    for (int i = 1; i < 256; i++) {
      System.out.println(i);
    }
  }
  public void oddCounter() {
    for (int i = 1; i < 256; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
  public void printSum() {
    int sum = 0;
    for (int i = 0; i < 256; i++) {
      sum += i;
      System.out.println("New Number: " + i + " Sum: " + sum);
    }
  }
  public void iterateArray() {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(1);
    arr.add(3);
    arr.add(5);
    arr.add(7);
    arr.add(9);
    arr.add(13);
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
  }
  public int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max);
    return max;
  }
  public double findAverage(int[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    double avg = sum / arr.length;
    System.out.println(avg);
    return avg;
  }
  public void oddArray() {
    ArrayList<Integer> oddarray = new ArrayList<Integer>();
    for (int i = 1; i < 256; i++) {
      if (i % 2 != 0) {
        oddarray.add(i);
      }
    }
    for (int i = 0; i < oddarray.size(); i++) {
      System.out.println(oddarray.get(i));
    }
  }
  public void greaterThanY(int[] arr, int y) {
    int count = 0;
    for (int i = 1; i < arr.length; i++) {
      if (y > arr[i]) {
        count += 1;
      }
    }
    System.out.println(count);
  }
  public void squareVals(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      arr[i] = arr[i] * arr[i];
    }
    for (int i = 1; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  public void eliminateNegs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        arr[i] = 0;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  public ArrayList<Integer> maxMinAvg(int[] arr) {
    Integer sum = 0;
    int max = arr[0];
    int min = arr[0];
    Integer avg = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    avg = sum / arr.length;
    ArrayList<Integer> MMArr = new ArrayList<Integer>();
    MMArr.add(max);
    MMArr.add(min);
    MMArr.add(avg);
    System.out.println(MMArr);
    return MMArr;
  }
  public ArrayList<Integer> shiftValArray(int[] arr) {
    ArrayList<Integer> shiftArr = new ArrayList<Integer>();
    for (int i = 1; i < arr.length; i++) {
      shiftArr.add(arr[i]);
    }
    shiftArr.add(0);
    System.out.println(shiftArr);
    return shiftArr;
  }
}
