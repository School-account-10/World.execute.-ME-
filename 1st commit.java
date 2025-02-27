import java.util.ArrayList;
import java.util.Random;

class ME {

  Integer LaG = latancygenerator();
  boolean powerline = true;
  boolean protection = true;
  ArrayList<String> chess_pieces = new ArrayList<>();
  ArrayList<String> chr = new ArrayList<>();
 
  void Mili(){
    
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

  public static void main(String[] args) {
    ME ME = new ME();
    try {
      ME.pieceschess();
      ME.createallObject();
    } catch (Exception e) {
      System.out.println("object creation failed");
    }
  }
}
