/*
 * 
 * 
 * 
 */
package assignment.one;

import java.util.Scanner;

/**
 *
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
 * 
 */
    public static double getAverage(double g1,double g2,double g3,double g4,double g5)
    {   
        return(g1+g2+g3+g4+g5)/5;
    }   
/**
 * 
 * 
 * 
 */    
    public static String letterGrade(double grade)
{
      if (grade >= 80 && grade <=100)
            return ("A");
        else if (grade >= 70 && grade <80) 
            return ("B");
        else if (grade >= 60 && grade <70)  
            return ("C");
        else if (grade >= 50 && grade <60)  
            return ("D");                                    
        else 
            return ("F");
}
 /**
 * 
 * 
 */  
    public static String averageLetterGrade(double totalAverage){
        
        if (totalAverage >= 80 && totalAverage <=100) 
            return ("A");  
        else if (totalAverage >= 70 && totalAverage < 80) 
            return ("B");
        else if (totalAverage >= 60 && totalAverage <70) 
            return ("C");
        else if (totalAverage >= 50 && totalAverage < 60)  
            return ("D");                                    
        else 
            return ("F"); 
    }
/**
 * 
 * @return 
 */
public static double getGrade()
{       Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a grade:");
        return keyboard.nextDouble();
                
    } //end of method largestNumber
} // end of class