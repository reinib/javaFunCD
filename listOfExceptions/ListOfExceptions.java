import java.util.ArrayList;

public class ListOfExceptions {
  public void listExceptions() {
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");

    for(int i = 0; i < myList.size(); i++) {
        Integer castedValue = (Integer) myList.get(i);
    }
  }
}
