package songLyrics;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class SongLyrics {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();	     
		Path txt = Paths.get("C:\\Users\\lysee\\Documents\\MoreThanTheDayBefore_Lyrics.txt");
		Path wrd = Paths.get("C:\\Users\\lysee\\Documents\\MoreThanTheDayBefore_Lyrics.docx");

		try {
			BasicFileAttributes textfile = Files.readAttributes(txt, BasicFileAttributes.class);
			BasicFileAttributes wordfile = Files.readAttributes(wrd, BasicFileAttributes.class);
			long textsize = textfile.size();
			long wordsize = wordfile.size();
			double ratio = textsize / wordsize;

			System.out.println("Text file is " + textsize + " bytes long");
			System.out.println("Word file is " + wordsize + " bytes long");
			System.out.println("Ratio is " + ratio);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
