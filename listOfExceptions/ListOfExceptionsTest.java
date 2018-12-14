public class ListOfExceptionsTest {
  public static void main(String[] args) {
    ListOfExceptions test = new ListOfExceptions();
    try{
        test.listExceptions();
        System.out.println("Yay it worked! :)");
    } catch (ClassCastException e){
        System.out.println("Oh noooo!!!! Looks like it didn't work! ;p");
    }
  }
}
