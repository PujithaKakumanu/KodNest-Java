## Introduction to Java Programming
- Java is a object oriented programming language
- Java is a secure language
- Java is a robust language
- Java is a case sensitive language
- Java is a dynamically typed language
- Java is a Interpreted and Compiled language
- Java is a High Level language
- WORA(Write Once Run Anywhere)
- Java is platform independent and architecture neutral
- Common Java applications: 
                        - Android Apps
                        - Desktop Applications
                        - Enterprise Applications
                        - Web Applications
## Features of Java
- Simple
- Portable
- Object Oriented
- Robust
- Secure
- Dynamic
- High Performance
- Distributed
- Multithreaded
- Automatic Memory Management
- java as a genarl purpose programming language - not as a domain specific language becasue it is used for multiple purposes
- Why java is called platform independent and architecture neutral ? becasue it is used for multiple platforms and architectures 


## **JVM, JRE and JDK**
### JDK(Java Development Kit)
1. JDK is a collection of tools that are used to develop java applications
2. JDK is a superset of JRE
3. It contains development tools for java applications ---> java Compiler, Debugger, Document Generator, JavaArchiver, Java Linker, Java Launcher, Java Debugger, and JRE.

4. JDK is used to compile, debug and run java applications

### JRE(Java Runtime Environment)
1. JRE is a runtime environment that is used to run java applications
2. JRE is a subset of JDK
3. It contains runtime environment for java applications
4. JRE is used to run java applications
5. JRE contains Runtime Components + JVM, Standard Java Class Libraries + Binary Code 

### JVM(Java Virtual Machine)
1. JVM is a virtual machine that is used to run java applications
2. JVM is a subset of JRE and contains Execution Engine - JIT Compiler, Interpreter, byte code verifier
3. It contains virtual machine for java applications
4. JVM is used to run java applications

## Java Execution flow: 
1. source code (.java) -> compiler (javac) -> bytecode (.class) -> interpreter (java) -> machine code (OS/Hardware)

   Source code(.java)
        | 
        | javac(Compilation and rule checking)
        v
   Bytecode(.class)
        | 
        | java(class Loading, verification, and JVM machinecode execution)
        v
   Machine code(OS/Hardware)
         |
         v
    Output on console




