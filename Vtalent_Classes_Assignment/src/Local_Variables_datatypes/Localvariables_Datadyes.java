package Local_Variables_datatypes;
/*VARIABLES:-
 *   variables are used to store the data
 *   
 *   VARIABLES ARE TWO TYPES:-
 *   a)local variables
 *   b)global variables
 *   
 *   we need to specify type of the variable to store the date
 *   to specify type of data we will use'data types...
 *   
 *   dataType:---
 *   data types are used to specify type of the data.
 *   data types are divided into 2 types
 *   1)primitive 
 *   
 *   a)integral:-byte(1 byte),short(2byte),int(4byte),long(8byte)...
 *   
 *   b)Decimal:-float(4byte->upto 6 decimal point),double(8bytes)upto 15 decimal points.
 *   
 *   c)Character:-char(2byte).
 *   
 *   d)boolean:-(8 bits=1 byte).
 *   
 *   2)non primitive*/
public class Localvariables_Datadyes {
	//local variables:-
	/*If variables are created inside the scope of the method these variables are called
	 *"local variables"....
	 *local variables can be used only within the same method...
	 *local variables can not accessed by other method
	 *local variables must be initialized before using if not initialized geting error..*/
	
	public static void main(String[] args) {
		integralDataTypes();
		decimalDataType();
		characterDataType();
		booleanDataType();
	}
	private static void integralDataTypes() {
		// TODO Auto-generated method stub
		/*integral data types are used to store numbers without decimal points...
		 *we can store both positive and negative numbers using integral data types....*/
		byte age=30;//byte-----default value is 0----->1 byte.
		long phno=9494013904l;//long-----default value is 0l---->8bytes
		Short Stdid=5555;//short----default value is 0---->2 bytes
		int pincode=534124;//int deefault value is 0---->4 bytes..
		System.out.println("INTEGRAL DATA TYPE STORE NUMBER WITHOUT DECIMAL...");
		System.out.println(age+ " is byte datatype ");
		System.out.println(phno+" is long datatype");
		System.out.println(Stdid+" is short datatype");
		System.out.println(pincode+" is int datatype");
		
		System.out.println("-------------------------------------------------------");
		
		
	}
	private static void decimalDataType() {
		/*Decimal data types are used to store numbers with decimal vales
		 *we can store both postive and negative values*/
		
		double weight=55.666666666;//8 bytes--->upto 15 decimals points....
		float  height=6.9f;//4 bytes---->upto 6 decimal points...........
		System.out.println("DECIMAL DATA TYPE TO STORE DECIMAL VALUES....");
		
		System.out.println(weight+" is double datatype...");
		System.out.println(height+" is  float datatype...");
		System.out.println("-------------------------------------------------------");
	}
	
	private static void characterDataType() {
		/*character data types is used to store single character
		 *any single character
		 *single quote is mandatory*/
		
		char gender='m';
		char rank = '1';
		System.out.println("CHARACTERS DATA TYPE TO STORE CHARACTERS VALUES....");
		System.out.println(gender+" char datatype");
		System.out.println(rank+" char datatype");
		System.out.println("-------------------------------------------------------");
		
	}
	

	private static void booleanDataType() {
		/*it is used to store true or false values only
		 *it will occupy 1 bit memory
		 *default value for boolean is false*/
		
		boolean pass=true;
		System.out.println("BOOLEAN DATA TYPE STORE TRUE OR FALSE VALUES ONLY..");
		System.out.println(pass+" boolean data type.");
		System.out.println("-------------------------------------------------------");
	}




}
