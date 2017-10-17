/*
 * This program is a simple grade center desined to calculate overall grade averages
 *      aswell as calculate and assign letter grades. 
 * 
 */
package assignment.one;

import java.util.Scanner;

/**
 *The main method calls supporting methods and stores the information that is returned 
 *      after receiving the needed information it then displays the information to the user.
 * @author CAIRD
 */
public class AssignmentOne {
    
      public static void main(String[] args) {
        
        double grade1 = getGrade();  //calls method getGrade and stores the returned double as grade1
        double grade2 = getGrade();  //calls method getGrade and stores the returned double as grade2
        double grade3 = getGrade();  //calls method getGrade and stores the returned double as grade3
        double grade4 = getGrade();  //calls method getGrade and stores the returned double as grade4
        double grade5 = getGrade();  //calls method getGrade and stores the returned double as grade5
        
        System.out.printf("The mark for the first course was %.1f%% , the letter grade is %s%n", grade1, letterGrade(grade1)); // Displays the mark for the first course as a percentage and it's corresponding letter grade. 
        System.out.printf("The mark for the second course was %.1f%% , the letter grade is %s%n", grade2, letterGrade(grade2));// Displays the mark for the second course as a percentage and it's corresponding letter grade. 
        System.out.printf("The mark for the third course was %.1f%% , the letter grade is %s%n", grade3, letterGrade(grade3)); // Displays the mark for the third course as a percentage and it's corresponding letter grade. 
        System.out.printf("The mark for the fourth course was %.1f%% , the letter grade is %s%n", grade4, letterGrade(grade4));// Displays the mark for the fourth course as a percentage and it's corresponding letter grade. 
        System.out.printf("The mark for the fifth course was %.1f%% , the letter grade is %s%n", grade5, letterGrade(grade5)); // Displays the mark for the fifth course as a percentage and it's corresponding letter grade. 
        System.out.printf("The overall average mark is %.1f%% , which is a letter grade of %s%n", getAverage(grade1, grade2, grade3, grade4,grade5)// Displays the overall grade average as a percentage and it's corresponding letter grade. 
                , averageLetterGrade(getAverage(grade1, grade2, grade3, grade4,grade5)));
    } //end of main method
/**
 * This method calculates the grade average and returns it to main method.
 * @return 
 */
    public static double getAverage(double g1,double g2,double g3,double g4,double g5)
    {   
        return(g1+g2+g3+g4+g5)/5; //adds the grade values together before dividing them by 5 and returning the result to the main method
    }   
/**
 * 
 * This method calculates the letter grade using if/else logic and returns it
 *      to the main method.
     *@param grade
     * @return  
 */    
    public static String letterGrade(double grade)
{
      if (grade >= 80 && grade <=100) // If the grade is more than or equal to 80 and less than or equal to 100 return A.
            return ("A");
        else if (grade >= 70 && grade <80) // If the grade is more than or equal to 70 and less than 80 return B.
            return ("B");
        else if (grade >= 60 && grade <70)  // If the grade is more than or equal to 60 and less than 70 return C.
            return ("C");
        else if (grade >= 50 && grade <60)  // If the grade is more than or equal to 50 and less than 60 return D.
            return ("D");                                    
        else                 // return F
            return ("F");
}
 /**
 * This method calculates the overall averages letter grade using if/else logic and 
 *      returns it to the main method.
 * @param totalAverage
     * @return 
 */  
    public static String averageLetterGrade(double totalAverage){
        
        if (totalAverage >= 80 && totalAverage <=100) // If the grade is more than or equal to 80 and less than or equal to 100 return A.
            return ("A");  
        else if (totalAverage >= 70 && totalAverage < 80) // If the grade is more than or equal to 70 and less than 80 return B.
            return ("B");
        else if (totalAverage >= 60 && totalAverage <70) // If the grade is more than or equal to 60 and less than 70 return C.
            return ("C");
        else if (totalAverage >= 50 && totalAverage < 60)  // If the grade is more than or equal to 50 and less than 60 return D.
            return ("D");                                    
        else                        // return F
            return ("F"); 
    }
/**
 * This method initializes the keyboard to accept user input 
 *      before prompting the user for grade values , it then returns those values 
 *          to the main method.
 * @return 
 */
public static double getGrade()
{       Scanner keyboard = new Scanner(System.in); // create scanner object
        System.out.print("Please enter a grade:"); // prompt for grade
        return keyboard.nextDouble();      // return input as double
                
    } //end of method largestNumber
} // end of class
