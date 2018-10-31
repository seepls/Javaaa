import java.io.*;
import javax.swing.*;
class ch8JFilechooser{
public static void main(String args[]){

JFilechooser chooser ;
File file, directory ; 
int status ;
chooser = new JFilechooser();
//OPEN 
status = chooser.showopenDialog(null);

if(status == JFilechooser.Approve_OPTION){
file = chooser.getSelectedFile();
directory = chooser.getcurrentdirectory();
System.out.print("Directory is "+directory.getName());
System.out.print("file is "+file.getName());
System.out.print("path is  "+file.getAbsolutePath());

}else {System.out.print("open cancelled ");  }


//SAVE 
status = chooser.showsaveDialog(null);
if(status == JFilechooser.Approve_OPTION){
file = chooser.getSelectedFile();
directory = chooser.getcurrentdirectory();
System.out.print("Directory is "+directory.getName());
System.out.print("file is "+file.getName());
System.out.print("path is  "+file.getAbsolutePath());

}else {System.out.print("save cancelled ");  }


}
}
