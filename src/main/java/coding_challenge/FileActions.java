/*There is 
 file containing a word and its possible meanings (like a Dictionary). 
 * The contents of the file look like this:

Apple – a fruit, a tech firm
Table – an object, contains rows and columns when used in context of computers
Orange – a fruit

Given a path to the file, do the following:

a) Create a method called doesFileExist(String path) which takes the path of the file and 
tells the user if the file exists at that path or not. Assume all paths are relative to your project structure. 
If the file does not exist, catch the requisite exception.
b)Read each word and its possible meanings and print them out. Your output should look like this:

Word1
Meaning 1
Meaning 2
Word2
Meaning1
Meaning2
 *
 * @author: pranavjoshi
 */

package coding_challenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class FileActions {

	static Boolean _findFile = false;
	
	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("user.dir")+"/resources/inputfile.txt");
		System.out.println("User entered file path: "+file);
		
		if(_findFile==true) {
			System.out.println("Checking if the file exist..........");
			System.out.println(""+FileActions.doesFileExist(file, _findFile));
			System.out.println("Checking for file contents..........");
			FileActions.readFileData(file);
			System.out.println("------------------------EOM----------------------------");
		}
		else{
			System.out.println("Checking if the file exist..........");
			System.out.println("FILE NOT FOUND - entered file path returned: "+FileActions.doesFileExist(file, _findFile));
			//System.out.println("Either the file does not exist of enter a correct file path");
			System.out.println("------------------------EOM----------------------------");
		}	
		FileActions.readFileData(file);
		
	}
	

	private static boolean doesFileExist(File file, Boolean findFile)throws IOException {
		if(_findFile = file.exists()) {
			System.out.println(_findFile+": FILE FOUND"+"\n");	
			System.out.println("FILE EXIST at: "+ file.getParent());
		}
		return _findFile;
	}


	public static void readFileData(File file) throws IOException {
		BufferedReader sb = new BufferedReader(new FileReader(file));
		String line = null;
		System.out.println("------------------------Start of File----------------------------");
		while ((line = sb.readLine()) != null) {
            String[] hyphen_delimited = line.split("-");
            for (String _hyphen_delimited : hyphen_delimited) {
                String[] comma_delimited = _hyphen_delimited.split(",");
                for (String _comma_delimited : comma_delimited) {
                    System.out.println(_comma_delimited.trim());
                }
            }
        }
		System.out.println("------------------------End of File----------------------------");
	}

}
