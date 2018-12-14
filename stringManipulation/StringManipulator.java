public class StringManipulator {
  public String trimAndConcat(String str1, String str2) {
    str1 = str1.trim();
    str2 = str2.trim();
    String str3 = str1.concat(str2);
    return str3;
  }
  public Integer getIndexOrNull(String str, char letter) {
    int a = str.indexOf(letter);
    return a;
  }
  public Integer getIndexOrNull(String str1, String str2) {
    int a = str1.indexOf(str2);
    return a;
  }
  public String concatSubstring(String str1, int a, int b, String str2) {
    String sub = str1.substring(a, b);
    String newstr = sub.concat(str2);
    return newstr;
  }
}
