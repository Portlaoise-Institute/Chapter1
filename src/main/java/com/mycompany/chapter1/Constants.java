package com.mycompany.chapter1;

//Class Declaration
public class Constants {

    public static void main(String[] args) {
        
        //create and init. 3 integer constants
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;
        
        //declare 4 regular int variables
        int td, pat, fg, total;
        
        //Initialise the variables - using
        //multiples of the constant values
        td = 4 * TOUCHDOWN;    // td = 4*6=24
        pat = 3 * CONVERSION; //pat = 3*1=3
        fg = 2 * FIELDGOAL;  //fg=2*3=6
        total = (td+pat+fg);  //total = 24+3+6 =33
        
        //Output the total score
        System.out.println("Score: "+total);
        
    } //end main
        
} //end class 
