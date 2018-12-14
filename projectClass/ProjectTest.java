public class ProjectTest {
  public static void main(String[] args) {
    Project test1 = new Project();
    Project test2 = new Project("Brent");
    Project test3 = new Project("Brent", "Here is my description :)");
    Project test4 = new Project();

    // test1
    System.out.println(test1);
    String test1ish = test1.elevatorPitch("Brent", "this is only a test");
    System.out.println(test1ish);

    // test2
    String name = test2.getName();
    System.out.println(name);

    // test3
    String namey = test3.getName();
    String description = test3.getDescription();
    System.out.println("Name: " + namey + ", Description: " + description);

    // test4
    test4.setName("Hyejin");
    test4.setDescription("안녕 친구!!!");
    String firstName = test4.getName();
    String statement = test4.getDescription();
    System.out.println("Name: " + firstName + " Description: " + statement);
  }
}
