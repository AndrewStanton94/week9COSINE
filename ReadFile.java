import java.io.* ;
public class ReadFile {
	public static void main(String [] args) throws Exception {
		FileInputStream in = new FileInputStream("N:/cosine/week9/tweedle-dum.txt");
		byte buffer [] = new byte [100] ;
		int numBytesRead = in.read(buffer) ;
		System.out.println(new String(buffer)) ;
	}
}
