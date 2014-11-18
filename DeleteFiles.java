import java.io.*;
  public class DeleteFiles {
      public static void main(String args []) throws Exception {
          File dum = new File("N:/cosine/week9/tweedle-dum.txt");
          File dee = new File("tweedle-dee.txt");
          dum.delete();
          dee.delete();
      }
  }
