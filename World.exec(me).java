import java.util.ArrayList;
import java.util.Base64;
import java.util.Random;

class ME {

  Integer LaG = latancygenerator();
  boolean powerline = true;
  boolean protection = true;
  ArrayList<String> chess_pieces = new ArrayList<>();

  public static ArrayList<String> Mili() {
    ArrayList<String> chr = new ArrayList<>();
    chr.add("ME");
    chr.add("YOU");
    return chr;
  }

  void pieceschess() {
    chess_pieces.add("pawn");
    chess_pieces.add("king");
    chess_pieces.add("queen");
    chess_pieces.add("horse");
    chess_pieces.add("rook");
    chess_pieces.add("bishop");
  }

  void createallObject() {
    if (LaG instanceof Integer) {
      System.out.println("response rate: " + LaG + "ms");
    } else {
      System.out.println("ME has stopped working");
      System.exit(0);
    }
    System.out.println("PowerLine Status: " + powerline);
    if (protection == true) {
      System.out.println("Protection Status: " + protection);
    } else {
      System.err.println("Protection Status: " + protection);
      System.err.println("Safety equipment is required to handle high voltage");
      System.exit(0);
    }
    System.out.println("Inializing Pieces....");
    for (int i = 0; i < chess_pieces.size(); i++) {
      systemclock(latancygenerator());
      System.out.println("chess piece Inialized:" + chess_pieces.get(i));
      if (i == chess_pieces.size() - 1) {
        System.out.println("ALL chess pieces Inialized");
      }
    }
  }

  public static void systemclock(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public static int latancygenerator() {
    Random latancy = new Random();
    int jac1 = latancy.nextInt(9000);
    int jac2 = latancy.nextInt(700);
    int mainjack = jac1 + jac2;
    return mainjack;
  }

  public final String chr_info1() { // fill in data
    String inf = Mili().get(0);
    String inf2 = "human";
    int age = 20;
    System.out.println("chr_info1: " + inf + " Type: " + inf2 + "Age: " + age);
    return inf + inf2 + age;
  }

  public final String chr_info2() { // fill in data
    String inf = Mili().get(1);
    String inf2 = "MILLI-Diana-800b-quantized.GGUF ";
    String convertion = Base64.getEncoder().encodeToString(inf2.getBytes());
    int age = 5000;
    System.out.println(
      "chr_info2: " + inf + " Model-name: " + convertion + " UPTIME: " + age
    );
    return inf + convertion + age;
  }


  public final String world_info() {
    String world = "World";
    String version = "1.0.0";
    String description = "This is a virtual world for ME.";
    System.out.println(
      "World Info: " + world + ", Version: " + version + ", Description: " + description
    );
    return world + version + description;
  }
  public static void main(String[] args) {
    ME ME = new ME();
    try {
      ME.pieceschess();
      ME.createallObject();
      ME.chr_info1();
      ME.chr_info2();
    } catch (Exception e) {
      System.out.println("object creation failed");
    }
  }
}
