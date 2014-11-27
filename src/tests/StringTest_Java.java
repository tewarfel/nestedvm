
// StringTest_Java.java
// pairs with StringTest_C.c to demonstrate a way of passing ints and strings back and forth between C and Java code
// via the call_java() interface

package test;

import org.ibex.nestedvm.Runtime;
import java.io.*;

public class StringTest_Java {

    private static class MyRuntime {
      public final Runtime myStaticCRuntime;

      public MyRuntime () {
	Runtime myRuntimeInstance;	
	try {
          myRuntimeInstance = (Runtime) Class.forName("tests.StringTest_C").newInstance();
        }
	catch (Exception e) {
         myRuntimeInstance = null;	
	}
	myStaticCRuntime = myRuntimeInstance;
        if (myRuntimeInstance != null) {
		System.out.println(" Starting C code...");
		myStaticCRuntime.start(new String[] {"StringTest_C"});
		System.out.println("back from calling start");
	} else {
		System.out.println("Cannot find C code class StringTest_C");
	}
      }
    }


    // Here's main for the Java program
    public static void main(String[] args) throws Exception {
        int a1 = args.length > 0 ? Integer.parseInt(args[0]) : 0;
	System.out.println("First argument value is: " + a1);
        
	int a2 = args.length > 1 ? Integer.parseInt(args[1]) : 0;
	System.out.println("Second argument value is: " + a2);
       
	final MyRuntime myStaticRuntimeInstance = new MyRuntime();

	System.out.println("Created static runtime instance for C program.");
	if (myStaticRuntimeInstance.myStaticCRuntime != null) {
  	   myStaticRuntimeInstance.myStaticCRuntime.setCallJavaCB(new Runtime.CallJavaCB() {

		// This where all the back-and-forth gets defined
		//
    		public int call(int opval, int arg1, int arg2, int arg3) {
                    switch(opval) {
                        case 1: { // pass 3 integers from C to Java, then print their sum and return sum
				int mySum;
				mySum = arg1+arg2+arg3;
				System.out.println("..in Java, opval=1, arguments were " + arg1 +
					", " + arg2 + ", and " + arg3 + ".  Sum is " +mySum + 
					".");
				return mySum; }

                        case 2: {  // for op values 2 and 3, just return integers to C. 
				System.out.println("..in Java, opval=2.  Returning hard-coded 5");
				return (5);
			        }

			case 3: {
				System.out.println("..in Java, opval=3.  Returning hard-coded 7");
				return (7);
			        }

			case 4: {  // send 2 strings from C to Java and print them from Java
				System.out.println("..in Java, opval=4.  C passed 2 strings to me.");
				String param1;
				String param2;

				try {	
 					param1 = myStaticRuntimeInstance.myStaticCRuntime.cstring( arg1  );
 				}
				catch (Exception e) {
					param1="String was not defined.";
 				}

				try {	
 					param2 = myStaticRuntimeInstance.myStaticCRuntime.cstring( arg2  );
 				}
				catch (Exception e) {
					param2="String was not defined.";
 				}
				System.out.println("..    String 1 was " + param1 );
			        System.out.println(".. 	  and string 2 was " + param2 );
				
		                return(99);  // return a hard-coded 99 
				}


			case 5: {  // return a string from Java and print from C
				System.out.println("..in Java, opval=5.  Allocate and return a string");
                                String myOutput="Hello, world from Java.";
      				return myStaticRuntimeInstance.myStaticCRuntime.strdup( myOutput); 
			        }

                        default: return 0;
                    }
		}});
             myStaticRuntimeInstance.myStaticCRuntime.execute();   
	} else {
		System.out.println("Cannot find StringTest_C.class");
	}


        System.out.println("== End of StringTest_Java ==");
      


	if (myStaticRuntimeInstance.myStaticCRuntime != null) {
           System.exit(myStaticRuntimeInstance.myStaticCRuntime.exitStatus());
	} else {
	   System.exit(-1);
	}
    };

}
         	
