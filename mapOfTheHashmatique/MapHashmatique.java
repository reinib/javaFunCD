import java.util.*;
public class MapHashmatique {
  public void mapHashmatique() {
    HashMap<String, String> tracklist = new HashMap<String, String>();
    tracklist.put("아시디시", "눈오는 지도 돌아와 보는 밤 병 원 새로운 길 간판 없는 거리");
    tracklist.put("툴", "봄 참회록 간 못 자는 밤 위 로 팔복 산골물");
    tracklist.put("마탈릭어", "이적 사랑의 전당 비오는 밤 어머니 가로수");
    tracklist.put("랍좀비", "비로봉 바다 명상 비애 소 낙 비 그 여자 야행");

    String track1 = tracklist.get("아시디시");
    System.out.println("Track number one lyrics: " + track1);

    Set<String> keys = tracklist.keySet();
    for (String key : keys) {
      System.out.println("Track: " + key);
      System.out.println("Lyrics: " + tracklist.get(key));
    }
  }
}
