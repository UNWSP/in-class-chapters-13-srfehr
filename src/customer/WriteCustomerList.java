package customer;
import java.io.*;
import java.nio.file.*;
import javax.swing.JOptionPane;

public class WriteCustomerList {
	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\lysee\\Documents\\GitHub\\in-class-chapters-13-srfehr\\src\\customer\\Customer.txt");
		
		String ID, firstName, lastName, balance; 
		
		try {
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			ID = JOptionPane.showInputDialog(null, "ID or 'DONE'");
			while(!ID.equals("DONE")) {
				firstName = JOptionPane.showInputDialog(null, "First Name: ");
				lastName = JOptionPane.showInputDialog(null, "Last Name: ");
				balance = JOptionPane.showInputDialog(null, "Balance Owed: ");
				
				String write = ID + ", " + firstName + ", " + lastName + ", " + balance;
				
				writer.write(write, 0, write.length());
				ID = JOptionPane.showInputDialog(null, "ID or 'DONE'");
			}
			writer.close();}
			
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}
}
