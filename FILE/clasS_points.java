1. java.io.package ;

File file = new File("name") ;//if the file we want to open not in the current directory 
then 
File file = new ("path" , "name");


2. to check if a file object is associated correctly to an existing file 

if(inFile.exists()){
//
}else{//}


A file object can also be associated to a directory .
say we want to access all the content of directory ch8 : snippet 

File directory  = new File("path_to_ch8 " ) ;
String Filename[] = directory.list(); 
for(int i = 0 ;i < filename.length(); i++){
System.out.print(filename[i]);
}

3. can check if a file object associated to a file/directory by calling boolean isFile()

File file = new File (" path " )
if(file.isFile(){
System.out.print(" i am a file " ) ;
}else {System.out.print("i am a directory ");}

4.JFilechooser : 

JFilechooser chooser = new JFilechooser() ;
Chooser.ShowopenDialog(null); // will list the content of user's home directory 

5.  instead of home if some other then : 


6. listing from the current directory 
since the current directory is different when the program is executed from a different directory we need a general approch :

String current = System.getProperty("user.id");
JFilechooser chooser = new JFilechooser(current);//here the current contians the path name of current directory 
chooser.ShowopenDialogue(); 


7.to check if the user has clicked on open/cancel button, we test a return value from showOpenDialogue method : 

int status = chooser showopenDialog(null);
if(status ==JFilechooser.Approveoption){
System.out.print("open is clicked");

}else{System.out.print("cancel  is clicked");
}

8. once we determine open is clicked then we can retrieve the selected file/directory 

File SelectedFile;

SelectedFile = chooser getselectedFile();
File CurrentDirectory ; 
currentDirectory = chooser getcurrentDirectory();


9.to fine the name and path of a selected file 

File file = chooser getselectedFile();
System.out.print("selected file " + file.getName());
System.out.print("full path"+file.getAbsolutepath());


10. to display a JFilechooser with a "open" /"save" button 
chooser.showopenDialog(null);
chooser.showsaveDialog(null);

can also be done by :
 JFilechooser chooser = new JFilechooser();
 chooser showDialog(null, "open"/"save");


11. with filterclass " Java Filter " we can set a file chooser to list only directories and java source files by writing

JFilechooser chooser = new JFilechooser() ;
chooser.getFileFilter(new JavaFilter());
int status = choose showopenDialog(null);


