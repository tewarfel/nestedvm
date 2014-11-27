nestedvm, ported to OSX 10.9, using gcc 4.9.3 and Java 1.8
========

11/27/2014
Yet another fork of NestedVM from nestedvm.ibex.org.  This fork integrates multiple patches and additions since 2009,
This version has been modified to build on OSX 10.9.5 (Mavericks) using the Xcode 6.1 compiler and Homebrew.
The gcc built is 4.8.2, and uses newlib-1.20.  Classgen is pulled by git, and presently points at github.com/tewarfel/classgen.git
so that it builds under Java 1.8.

Thanks to Brian Alliet and Adam Megacz for their creation and for making it public, and most recently to Henry Wertz for his 
recent set of extensive patches for gcc 4.8 + newlib-1.20 support and email assistance getting them to work.


Building NestedVM under OSX 10.9:

1) Install Xcode from the app store and download all updates 

2) Install the Xcode command line tools

3) Install “Homebrew” (info page at http://brew.sh )
      ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

4) brew update

5) brew upgrade

6) brew install git gmp mpc libmpc mpfr cmake autoconf

7) If you have not used "git" before, create a .gitconfig file in your home directory.  See 
  http://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup

8) install Java JDK (not just runtime) from www.oracle.com/technetwork/java/javase/downloads/ ; I have tested Java 1.8u25 successfully.

9) log out and reboot

10) verify that “java –version” returns Java 1.8.
If not, try re-installing the JDK and reboot.  For reasons I don't fully understand, if I have a  default Mavericks installation,
I have to actually reboot after installation before the soft links pointing to the new java are visible.  
Once the first install is rebooted, subsequent upgrades are immediately visible. YMMV.

11) git clone  https://github.com/tewarfel/nestedvm.git .    into your local directory.

12) cd to the install directory, type "make", then go get some coffee.  It takes awhile to download and compile all the pieces.

13)  Once the first "make" completes, type "make nestedvm.jar"

14) Verify with "make test", "make calltest", "make stringtest", etc. 


Notes: 
I had some initial difficulty building GCC with, with an error message "cannot find liblto_plugin.so" 
being caused by old remants of prior gcc builds.  I uninstalled all prior homebrew gcc/gcc-related stuff, delete the configuration caches,
build directory contents, and the build file tokens in the upstream/tasks/ directory, and then did a "make clean", followed by "make".
Once I had all the old gcc stuff cleaned out, it would build.  

Makefile and upstream/Makefile both contain lines specifying Java version 1.8.  If you have the 1.7 JDK installed, you can use that as well, just change the 1.8 to 1.7 in both places.


 -Tom


From the [original site](http://nestedvm.ibex.org/):

NestedVM provides binary translation for Java Bytecode. This is done by having GCC compile to a MIPS binary which is then translated to a Java class file. Hence any application written in C, C++, Fortran, or any other language supported by GCC can be run in 100% pure Java with no source changes.

NestedVM was created by [Brian Alliet](http://www.brianweb.net/) and [Adam Megacz](http://www.megacz.com/).

[David Crawshaw](http://www.zentus.com/) has also made significant contributions.

NestedVM is Open Source, released under the Apache 2.0 license. 

