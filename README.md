nestedvm, ported to OSX 10.9, using gcc 4.9.3 and Java 1.8
========

11/26/2014
Clone of NestedVM repository, integrating multiple changes since 2009.
This version has been modified to build on OSX 10.9.5 (Mavericks) using the Xcode 6.1 compiler and Homebrew.
The gcc built is 4.8.2, and uses newlib-1.20

Thanks to Henry Wertz for his recent set of extensive patch, and well as the many prior contributors before.

Steps to build:

1) Install Xcode from the app store and download all updates 

2) Install the Xcode command line tools

3) Install “Homebrew” (info page at http://brew.sh )
      ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

4) brew update

5) brew upgrade

6) brew install git gmp mpc libmpc mpfr cmake autoconf

7) create a .gitconfig file in your home directory

8) install Java JDK (not just runtime), I used 8u25 for testing.

9) log out and reboot

10) verify that “java –version” returns Java 8 and not a message about installing 
version 6.  If not, re-install JDK and reboot.

11) git clone  https://github.com/tewarfel/nestedvm.git .    into your local directory.

12) in the directory, type "make", then "make nestedvm.jar"


Classgen java source files were modified to compile cleanly under Java 1.8.  I'll eventually split that out as it's own git
	
12) New test file showing one method of passing strings from a C program to Java and back.

 -Tom


From the [original site](http://nestedvm.ibex.org/):

NestedVM provides binary translation for Java Bytecode. This is done by having GCC compile to a MIPS binary which is then translated to a Java class file. Hence any application written in C, C++, Fortran, or any other language supported by GCC can be run in 100% pure Java with no source changes.

NestedVM was created by [Brian Alliet](http://www.brianweb.net/) and [Adam Megacz](http://www.megacz.com/).

[David Crawshaw](http://www.zentus.com/) has also made significant contributions.

NestedVM is Open Source, released under the Apache 2.0 license. 

