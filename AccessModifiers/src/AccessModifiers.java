import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class AccessModifiers {

    // Name of the java file should be the class name which is declared as public
    // There can only be ONE public class in a java program
    // The package name should be kept as fully Qualified name
    // if you create a package them it will create a folder  in the  current working directory
    // if you want to place the generated .class files the -d (partition name). Test.java
    // The first non comment line in the java program should be package statement
    // PUBLIC | DEFAULT | FINAL | ABSTRACT | STRICTFP  are the only access ,modifiers used with CLASS.
    // but the other modifiers clan be used with inner class
    // PUBLIC CLASS  can be accessed from anywhere.
    // DEFAULT CLASS can be accessed within the current package.
    // FINAL CLASS  cannot be extended i.e., inheritance is compromised
    //FINAL METHOD  cannot be overridden i.e., polymorphism is compromised
    //Every method in the final class is final by default but not true for variables.

                          //ABSTRACT KEYWORD
    //only applicable for class, method but not for variables.
    //abstract method(ends with ;) does not have their body, their body is provided by the child class which extends them(they should compulsorily provide the body of the method) .


    //interface instance variable are by default public static final.
    // A class can implement any number of interface except one case when two interface contains a method that contains same method signature but different return type.




}
