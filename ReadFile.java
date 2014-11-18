import java.io.* ;
public class ReadFile {
	public static void main(String [] args) throws Exception {
		FileInputStream in = new FileInputStream("N:/cosine/week9/tweedle-dum.txt");	// Object with access to file content
		byte[] buffer = new byte [100] ;		// Byte Array
		int numBytesRead = in.read(buffer);		// Store upto 100 bytes from in in buffer. Returns |bytes written|
		while(numBytesRead > 0){ // While text yielded from file
			System.out.print(new String(buffer, 0, numBytesRead));
										// Data from, start index, |chars|
			numBytesRead = in.read(buffer);
		}
	}
}
