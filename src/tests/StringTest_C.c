#include <stdio.h>
#include <stdlib.h>
#include <string.h>

extern void * _call_java(int op, void *arg1, void *arg2, void *arg3);


int error;

int main(int argc, char **argv) {

	printf("Starting C code execution");

	printf("Send 3 integers to Java to be processed, and printed from Java\n");
	{
	   int retval;
	   retval = (int) _call_java(1, (void *)2, (void *)3,(void *)4);
	   printf("Value returned to C program was %d\n",retval);
	}


	printf("\n\n");
	printf("Get two integers from Java to process and print from C\n");
	{ 
	  int i,j,sum;
	  i = (int) _call_java(2, (void *)0, (void *)0, (void *)0);
	  j = (int) _call_java(3, (void *)0, (void *)0, (void *)0);
	  sum = (i+j);
	  printf("%d + %d = %d \n",i,j,sum);
	}

	printf("\n\n");
	printf("Send 2 strings from C to Java to be printed from Java, and check a return value\n");
	{ 
	   int retval;
	   char *string1="-String-1-text-";
	   char *string2="...And.this.is.the.text.of.String.2.";

	   retval = (int) _call_java(4, (void *)string1, (void *)string2, (void *)0);
	   printf("In C, return value from Java call (opcode 4) was %d\n",retval);
	}

	printf("\n\n");
	printf("Pull a string from Java to C to be printed from C, then memory released.\n");
	{
	   char *jstring;
	   jstring = (char *) _call_java(5, (void *)0, (void *)0, (void *)0);

	   if (jstring == NULL) {
              printf("Error, returned string was null\n");
	   } else {
	      printf("String pulled from Java side was >%s<\n",jstring);
	      fflush(stdout);
	      free(jstring);
	   }
	}

	printf("\nC program exiting.\n");

  return(0);
}





