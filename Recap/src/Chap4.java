/* Control Structures:
*
* Public class name = file name (one public class per file)
* Classes can't start with numbers, contain special chars
* "PUBLIC" - access modifier
* 	public variables
* 	public methods (function)
* 	public classes 
*
* A member of a class is something contained inside the class
* The .java files are the editable source code, the .class is the object code (compiled file)
* Every public class file will create its own .class file
* You have to be certain all .class files in a project are within the same folder
* 
* A static method because you can call it without fist creating an instance of an object of the class in which the method is declared.
* 	GradeBook.welcomeMessage()		is called straight from the class itself
* 	gb.welcomeMessage()				is called from an instance of the class
* 
* 	(We typically create non-static methods in our classes)
* 
* GradeBook gb = new Grade()		class instance creation expression (Java is called an extensible, language, because you can create your own data types)
* 
* Constructors
* 	A constructor is a special method within a class which is used to set the default values of the variable in the class
* 		
* 		Declaring a variable 			int num;
* 		Initializing a variable			int num = 10;
* 
* 		Declaring a class				GradeBook period1;
* 		Instantiate class (default)		GradeBook period1 = new GradeBook(); (Without any parameters, we call the default)
* 		Instantiate class (specific)	GradeBook period1 = new GradeBook(1); (With a parameters, this calls the specific constructor)
* 
*  Constructors do not have return types
*  Constructors must have the same name as the class
*  They can be typically are overloaded - multiple versions of the same method but with different sets of parameters
*  They cal be 
* 
*  Set (mutatros) and get (accessors) methods
*  		Because our data in classes should be private, we create public methods to access or change the data, if need be.
*  	
*  		Set methods are void, taking one parameter and provide validity checking. Get methods do not take parameters, they merely return that data types.
*  
*  		This is an example of information hiding - the user of your class dosn't need to know the formula for leap year, just that they can/can't set certain dates based on their data
*  
*  		Altogether, this is what we talk about when we mention encapsulation - packaging together data and the methods to manipulate it.
*  
* Parameter vs Argument
* 	Public void setPeriodNumber(int periodNumber);			periodNumber in the method is the parameter of the method
*	period1.setPeriodNumber(1);								the 1 is the argument of the method call
*
*	When you do use the same name for parameter and a class's variable, we use the keywords "this" to tell them apart
*	this.periodNumber = periodNumber
*
* Variables
* 	Local Variables - variable declared in the body of a particular method
* 	Field Variables - also known as a global variable, these are declared inside a class but outside of any method
* 	Instance Variables - Field variable that represents an attribute of the class, each copy of the object keeps its own instace variable
* 		GradeBook period1;			periodNumber is 1
* 		GradeBook period9; 			periodNumber is 9
* 
* 	In classes, variables are declared private, methods are declared public.
* 
* Primitive data types
* 	byte		2^8 
* 	short		2^16
* 	int			2^32
* 	long		2^64
* 	float		32-bit
* 	double		64-bit
* 	boolean		true/false
* 	char		16-bit unicode
*   
*/		
public class Chap4 {

}

