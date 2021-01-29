import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new scanner(System.in);
    System.out.println("Are you a mermaid T/F ?");
    boolean mermaidMaid = scan.nextBoolean();

    System.out.println(mermaid(mermaidMaid));
  }

  static String mermaid(boolean mermaidMaid) {
    if (mermaid) {

      String mermaid = mermaidMaid + "So you are a mermaid. Knew it ";

    } else {
      String mermaid = mermaidMaid + "So you aren't a mermaid :( . I just lot a 500 dollar bet!";
    }
    return mermaid;

  }
}