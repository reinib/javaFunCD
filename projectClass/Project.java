public class Project {
  private String name;
  private String description;

  // instance method
  public String elevatorPitch(String name, String description) {
    return  name + ": " + description;
  }
    // overload constructor methods
  public Project() {
  }
  public Project(String name) {
    this.name = name;
  }
  public Project(String name, String description) {
    this.name = name;
    this.description = description;
  }

  // getters and setters
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
}
