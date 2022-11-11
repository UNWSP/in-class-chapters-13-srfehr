package customer;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.*;
import javax.swing.JOptionPane;

public class DisplaySavedCustomerList {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\lysee\\Documents\\GitHub\\in-class-chapters-13-srfehr\\src\\customer\\Customer.txt");
		String[] arr = new String[4];
		String read;
		String splice = ",";
		
		try {
			InputStream input = new BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			read = reader.readLine();
			
			
			while(read!=null) {
				read.split(splice);
				for(int x=0; x< arr.length; x++) {
					System.out.print(arr[x] + " ");
				}
				System.out.println();
				read = reader.readLine();
			}
			reader.close();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
