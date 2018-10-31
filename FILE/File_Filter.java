File filter used to remove unwanted files from the list : 

the follwoing is a snippet of prgm to filter only JAVA source files for listing in JFilechooser 

import java.io.*;
import javax.swing.filechooser.*;

class JavaFilter extends Filefilter{
  private static final String JAVA = " java" ; 
  private static final char DOT = ".";

  public boolean accept(File f){
      if(f.isDirectory()){return true;}
      elseif(extension(f).equalsIgnorecase(JAVA)){return true ;}
      else return false;
  }
  public String getDiscription(){
  return "Java Source files (.Java)" ; 
  }
  private String extension(File f ) {
  String filename = f.getName (); 
  int loc = filename.lastIndexOf(DOT);
  if(loc>0 && loc> filename.length()- 1) {return filename = Substring(loc++);
  }else return "  "; 
 }
}

