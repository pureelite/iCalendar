package iCalendar;
import java.io.*;
import java.lang.*;
import java.util.*;

public class createFile {
	
	public void printToFile() throws FileNotFoundException{
		File file = new File ("myCalendar.ICS");
	    PrintWriter printWriter = new PrintWriter (file);
	    printWriter.println ("BEGIN: VCALENDAR");
	    printWriter.println ("VERSION:2.0");
	    printWriter.println ("CLASS:PUBLIC");
	    printWriter.println ("LOCATION:Ward Theaters");
	    printWriter.println ("PRIORITY:1");
	    printWriter.println ("SUMMARY:Take Beth on a date");
	    printWriter.println ("DTSTART:19970714T170000Z");
	    printWriter.println ("DTEND:19970715T035959Z");
	    printWriter.println ("TZID:America/Hawaii");
	    printWriter.println ("END:VCALENDAR");
	    printWriter.close ();  
	}
}
