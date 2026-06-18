if a file is created it can hava multiple classes and only one class must be publlic and and name of the class must match up with the filename
string or words in java  are case sensitive
class name should be in uppercase
method name should be in lowercase
only one public class must be available and the file name must be same as public class name
something which is used to identify it
All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).



Class reference: in this when we try to change a data structure we must  makesure to change the internal code of the class  to makesure it work along that class 
Eg: arraylist is used then it is essential to make sure that we have to follow the rules of the arraylist class or method if we change the data structure we must  makesure to change the internal code of the class  to makesure it work along that class
 Arraylist<String> myarray =new Arraylist<>();
 left side- reference variable like a controller  
 right side- object creation and alocation of memory 
 we must makesure that the data structure follows the arraylist rule at both ends and as well as in the internal code

 Interface reference:this referencing have the freedom to change whatever the data structure in the internal code and making sure the internal data structure change does'nt affect the code and making it crash
 List<String> myarray =new Arraylist<>();
 left side -list is the interface and we are saying the object which we are creating must behave like a list
 right side- object creation and alocation of memory and at the  internal side of the object it follows arrays  and have the capabilities of the list at the external 