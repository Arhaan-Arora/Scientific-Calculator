package assignment.pkg1;
import java.util.*;

public class ScientificCalculator {
    // Scanner for reading user input
    private static Scanner sc = new Scanner(System.in);
    // Current value stored in the calculator
    private static double num;
    public static void main(String[] args) {
        
        // Prompt user for initial value to start calculator
    System.out.print("Enter initial value to switch on scientific calculator: ");
    num = sc.nextDouble(); 
        int choice;
        // Main menu loop to repeatedly show options and execute chosen operation
        do{            
            showMenu();
            System.out.print("Enter option number (from scientific calculator): ");
            choice = sc.nextInt();
            double z = 0;
            switch (choice) {
                case 1: //addition
                    add();
                break;
                
                case 2: //subtraction
                    subtract();
                break;
                
                case 3: //multiplication
                    multiplication();
                break;
               
                case 4: //division
                    division();
                break;
                
                case 5: //modulus
                    modulus();
                break;
                
                case 6://absolute value
                    absolutevalue();
                break;
                
                case 7: //square
                    square();
                break;
               
                case 8: //cube
                    cube();
                break;
               
                case 9: //square root
                    sqrt();
                break;
              
                case 10: //cube root
                    cbrt();
                break;
               
                case 11: //power (num^x)
                    power();  
                break;
              
                case 12: //exponential (e^x)
                    exponential();
                break;
               
                case 13: //log10
                    log10();
                break;
              
                case 14: //natural log (ln)
                    naturallog();
                break;
              
                case 15: //sine
                    sinfxn();
                break;
                
                case 16: //cosine
                    cosfxn();
                break;
             
                case 17: //tangent
                    tanfxn();
                break;
                
                case 18: //cosec
                    cosecfxn();
                break;
                
                case 19: //sec
                    secfxn();
                break;
             
                case 20: //cot
                    cotfxn();
                break;
           
                case 21: //inverse sine
                    
                    System.out.print("Enter x: ");
                    double x = sc.nextDouble();
                    z = arcsinfxn(x);
                    menu(z);
                break;
                
                case 22: //inverse cosine
                   
                    System.out.print("Enter x: ");
                    double x1 = sc.nextDouble();
                    z = arccosfxn(x1);
                    menu(z);
                break;
                
                case 23: //inverse tangent
                   
                    System.out.print("Enter x: ");
                    double x2 = sc.nextDouble();
                    z = arctanfxn(x2);
                    menu(z);
                break;
                
                case 24: //factorial
                        impfactorial();
                    break;
                
                case 25: //value of PI    
                    pi();
                break;
                
                case 26: //value of e    
                    exp();
                break;
              
                case 27: //Degree to Radian conversion
                    degtorad();
                break;
              
                case 28: //Radian to Degree conversion
                    radtodeg();
                break;
                
                case 0: //exit code
                    System.out.println("The final answer is " + num);
                    System.out.println("Exiting Calculator. Goodbye!");
                break;
               
                default: //invalid value
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }
     // Display main calculator menu
    private static void showMenu() {
        System.out.println("\n=== Scientific Calculator ===\n");
        System.out.println(" 1. Addition                   11. Power (x^y)                  21. Inverse Sine");
        System.out.println(" 2. Subtraction                12. Exponential (e^x)            22. Inverse Cosine");
        System.out.println(" 3. Multiplication             13. Logarithm (log10)            23. Inverse Tangent");
        System.out.println(" 4. Division                   14. Natural Logarithm (ln)       24. Factorial");
        System.out.println(" 5. Modulus                    15. Sine                         25. Value of PI");
        System.out.println(" 6. Absolute Value             16. Cosine                       26. Value of e");
        System.out.println(" 7. Square                     17. Tangent                      27. Degree to Radian Conversion");
        System.out.println(" 8. Cube                       18. Cosecant                     28. Radian to Degree Conversion");
        System.out.println(" 9. Square Root                19. Secant                       0. Exit");
        System.out.println("10. Cube Root                  20. Cotangent");
    }
    
     // Addition of entered number to current value
    public static void add() {
        
        System.out.print("Enter number to add: ");
            double temp = num;
            double calc = sc.nextDouble();
            num += calc;
            System.out.println("Operation: Addition");
            System.out.println(temp + " + " + calc + " = " + num);
    }
    // Subtraction of entered number from current value
    public static void subtract() {
        double temp = num;
        System.out.print("Enter number to subtract, without negative sign: ");
            double calc = sc.nextDouble();
            if (calc < 0) {
                System.out.println("Please enter number without negative sign.");
                return;
            }
            num -= calc;
            System.out.println("Operation: Subtraction");
            System.out.println(temp + " - " + calc + " = " + num);
    }
     // Multiplication of current value by entered number
    public static void multiplication() {
        
        System.out.print("Enter number to multiply: ");
            double temp = num;
            double calc = sc.nextDouble();
            num *= calc;
            System.out.println("Operation: Multiplication");
            System.out.println(temp + " * " + calc + " = " + num);
    }
     // Division of current value by entered number with zero check
    public static void division() {
        
        System.out.print("Enter number to divide: ");
            double temp = num;
            double calc = sc.nextDouble();
            if (calc == 0) {
                System.out.println("Zero Division Error, cannot divide by zero. Please enter a number other than zero.");
                return;
            }
            num /= calc;
            System.out.println("Operation: Division");
            System.out.println(temp + " / " + calc + " = " + num);
    }
     // Absolute value of current number
    public static void absolutevalue() {
        double temp = num;
        if (num < 0) {
            num = num * -1;
        } else if (num == 0) {
            System.out.print("The current calculation is" + num);
            return;
        }else {
            System.out.println("Number is already positive."); 
            return;
        }
        System.out.println("Operation: Absolute Value");  
        System.out.println("Absolute value of " + temp + " = " + num);
    }
    // Remainder of num divided by entered divisor
    public static void modulus() {
        
        System.out.print("Enter divisor: ");
        double calc = sc.nextDouble();
        if (calc == 0) {
            System.out.print("Zero Division Error, cannot remove modulus by 0. Please enter a valid input");
            return;
        }
        num = num % calc;
        System.out.println("Operation: Modulus");
        System.out.println("Remainder of " + num + " % " + calc + " = " + num);
    }
    // Square the current number
    public static void square() {
        double temp = num;
        num = num * num;
        System.out.println("Operation: Square");
        System.out.println("square(" + temp + ") = " + num);
    }
    // Cube the current number
    public static void cube() {
        double temp = num;
        num = num * num * num;
        System.out.println("Operation: Cube");
        System.out.println("cube(" + temp + ") = " + num);
    }
    // Square root of current number using Newton's method
    public static void sqrt() { 
        double temp = num;
        int i = 0;
        double x = num;
        if (x < 0) {
            System.out.println("Invalid operation due to output being a negative number");
            return;
        }
        if (x == 0) {
            System.out.println("The current calculation is 0.0");
            return;
        }
         for (i = 0 ; i < 30 ; i++ ){
            x = 0.5 * (x + num / x);
        }            
        num = x;
        System.out.println("Operation: Square Root");
        System.out.println("sqrt(" + temp + ") = " + num);

    }
     // Cube root of current number using Newton's method
    public static void cbrt() {
        double temp = num;
        double x = num;
        boolean negative = false;
        if (x<0) {
            negative = true;
            x = -x;
        }
        if (x == 0) {
            num = 0;
            System.out.println("The current calculation is " + num);
            return;
        } 
        double originalX = x;
            for (int i = 0; i < 30 ; i++) {
                x = (((2 * x) + (originalX / (x * x))) / 3);
        }
        if (negative) {
            x = -x;
        }
        num = x;
        System.out.println("Operation: Cube Root");
        System.out.println("cbrt(" + temp + ") = " + num);                 
    }
    // Power function num ^ integer exponent; handles negative exponents
    public static void power() {
        double temp = num;
        double i = 0;
        double y = 0;
        System.out.print("Enter an integer exponent for the power calculation: ");
            i = sc.nextDouble();
            if (i != (int)i) {
                System.out.println("Enter an integer exponent, invalid input.");
                return;
            }
            if (num == 0 && i <= 0) {
                System.out.println("Zero base with non-positive exponent, invalid inputs.");
                return;
            }
            y = num;

            if (i == 0) {
                num = 1;
            }
             else if (i > 0){
                for (int count = 0 ; count < i-1; count++) {
                num = num * y;
            }
             } else {
                    num = 1;
                    for (int count = 0 ; count < -i; count++) {
                    num = num * y;
                    }
                    num = 1/num;    
                    }
        
            
            System.out.println("Operation: Power");
            System.out.println(temp + "^" + i + " = " + num);         
    }
    // Exponential function e^x using series expansion
    public static void exponential() {
        double z = 0;
        double x = 0;
        System.out.print("Enter value of x, that will represent e^x: ");
            x = sc.nextDouble();
            double a = 1;
            double b = 1;

            for (int n = 1; n<= 20; n++) {
                b = b * x / n;
                a += b;
            }
            z = a;
            menu(z);
    }
    // Logarithm base 10 using series approximation
    public static void log10() {
        double z = 0;
        double x = 0;
        System.out.print("Enter value of x: ");
            x = sc.nextDouble();
            if (x <= 0) {
                System.out.println("Invalid input");
                return;
            }
            if (x == 1) {
                num = 0;
                System.out.println("The current calculation is " + num);
                return;
            }
            double log10 = 2.302585092994046;
            double y = (x-1) / (x+1);
            double y2 = y;
            double sum = 0;

            for (int n = 0; n <100; n++) {
                int den = 2 * n + 1;
                sum += y2 / den;
                y2 *= y * y;
            }
            sum *= 2;

            z = sum/log10;
            menu(z);
    }
    // Natural logarithm ln(x) using series approximation
    public static void naturallog() {
        double z = 0;
        double x = 0;
        System.out.println("Enter value of x: ");
            x = sc.nextDouble();
             if (x <= 0) {
                System.out.println("Invalid input");
                return;
            }
            if (x == 1) {
                num = 0;
                System.out.println("The current calculation is " + num);
                return;
            }
            double a = (x-1) / (x+1);
            double b = a;
            double ln = 0;

            for (int n = 0; n < 100 ; n++) {
                int denominator = 2 * n + 1;
                ln += b / denominator;
                b *= a * a;
            }
            ln *= 2;
            z = ln;
           menu(z);
    }
    // Factorial of current number (integer, non-negative)
    public static void impfactorial() {
        double i = 0;
        double x = 0;
        double num1 = num;
        if (num < 0 || num%1 != 0) {
            System.out.println("Invalid operation, output is having decimal. Factorial cannot be calculated for non-negative integers.");
            return;     
        }
        int n = (int) num;
        if (num == 0) {
            num = 1;
            System.out.println("The current calculation is " + num);
            return;
        }
        x = num;
        for (i = 0; i < num1-1 ; i++) {
            --x;
            num = num * x;
        }
                    
        System.out.println("The current calculation is " + num);
    }
    // Display Pi constant
    public static void pi() {
        double z = 0;
        z = 3.141592653589793;
        menu(z);
    }
    // Display e constant 
    public static void exp() {
        double z = 0;
        z = 2.718281828459045;
        menu(z);
    }
    // Degree to radian conversion
    public static void degtorad() {
        double z = 0;
        double x = 0;
        System.out.print("Enter x in degree to convert to radians: ");
            x = sc.nextDouble();
            z = 0.0174533 * x;
            menu(z);
    }
    // Radian to degree conversion
    public static void radtodeg() {
        double z = 0;
        double x = 0;
        System.out.print("Enter x in radians  to convert to degree: ");
            x = sc.nextDouble();
            z = 57.2958 * x;
            menu(z);
    }
    // Sine using Taylor series, input degrees converted to radians
    public static void sinfxn() {
        double z = 0;
        double x = 0;
        int i = 0;
        System.out.print("Enter x (in degree): ");
        x = sc.nextDouble();
        
        double pi = 3.141592653589793;
        x = x * (pi / 180.0);
        
        double pidouble = 2 * pi;
        x = x%pidouble;
        if (x < 0) {
            x += pidouble;
        }
        
        double sinvar = 0;
        for (int n = 0 ; n <= 10; n++) {
            double power = 1;
            int exponent = 2 * n + 1;
            for (i = 0 ; i < exponent ; i++) {
                power *= x;
            }

        double factorial = 1;
        int factNum = 2 * n + 1;

        for (int p = 1 ; p <= factNum ; p++) {
            factorial *= p;
        }

        double term = power / factorial;

        if (n%2 != 0) {
            term = -term;
        }
        sinvar += term;
        }
        z = sinvar;
        menu(z);
    }
    // Cosine using Taylor series, input degrees converted to radians
    public static void cosfxn() {
        double z = 0;
        double x = 0;
        int i = 0;
        System.out.print("Enter x (in degree): ");
        x = sc.nextDouble();
        
        double pi = 3.141592653589793;
        x = x * (pi / 180.0);
        
        double pidouble = 2 * pi;
        x = x%pidouble;
        if (x < 0) {
            x += pidouble;
        }
        
        double cosvar = 0;
        for (int n = 0 ; n <= 10 ; n ++) {
            double power = 1;
            int exponent = (2 *n);
            for (i = 0 ; i < exponent ; i++) {
                power *= x;
            }
            
            double factorial = 1;
            for (int p = 1; p <= exponent ; p++) {
                factorial *= p;
            }
            double term = power/factorial;
            if (n % 2 != 0) {
                term = -term;
            }
            cosvar += term;
            
        }
        z = cosvar;
        menu(z);
    }
    // Tangent calculated as sin(x)/cos(x)
    public static void tanfxn() {
        double z = 0;
        double x = 0;
        int i= 0;
        System.out.print("Enter x (in degree): ");
        x = sc.nextDouble();
        
        double pi = 3.141592653589793;
        x = x * (pi / 180.0);
        
        double pidouble = 2 * pi;
        x = x%pidouble;
        if (x < 0) {
            x += pidouble;
        }
        
        double tanvar = 0;
        double sinvar = 0;
        for (int n = 0 ; n <= 10; n++) {
            double power = 1;
            int exponent = 2 * n + 1;
            for (i = 0 ; i < exponent ; i++) {
                power *= x;
            }

        double factorial = 1;
        int factNum = 2 * n + 1;

        for (int p = 1 ; p <= factNum ; p++) {
            factorial *= p;
        }

        double term = power / factorial;

        if (n%2 != 0) {
            term = -term;
        }
        sinvar += term;
        }
       double cosvar = 0;
        for (int n = 0 ; n <= 10 ; n ++) {
            double power = 1;
            int exponent = (2 *n);
            for (i = 0 ; i < exponent ; i++) {
                power *= x;
            }
            
            double factorial = 1;
            for (int p = 1; p <= exponent ; p++) {
                factorial *= p;
            }
            double term = power/factorial;
            if (n % 2 != 0) {
                term = -term;
            }
            cosvar += term;
            
        }
        if (cosvar < 1e-15 && cosvar > -1e-15) {
            System.out.println("Undefined - tangent is undefined at this value");
            return;
        }
        tanvar = sinvar/cosvar;
        z = tanvar;
        menu(z);
    }
    // Cosecant = 1/sin(x) 
    public static void cosecfxn() {
        double z = 0;
        double x = 0;
        int i = 0;
        System.out.print("Enter x (in degree):");
        x = sc.nextDouble();
        
        double pi = 3.141592653589793;
        x = x * (pi / 180.0);
        
        double pidouble = 2 * pi;
        x = x%pidouble;
        if (x < 0) {
            x += pidouble;
        }
        
        double sinval = 0;
        for (int n = 0 ; n <= 10; n++) {
            double power = 1;
            int exponent = 2 * n + 1;
            for (i = 0 ; i < exponent ; i++) {
                power *= x;
            }

        double factorial = 1;
        int factNum = 2 * n + 1;

        for (int p = 1 ; p <= factNum ; p++) {
            factorial *= p;
        }

        double term = power / factorial;

        if (n%2 != 0) {
            term = -term;
        }
        sinval += term;
        }
        double cosecval = 1/sinval;
        z = cosecval;
        menu(z);
}
    // Secant = 1/cos(x) 
    public static void secfxn() {
        double z = 0;
        double x = 0;
        int i = 0;
        System.out.print("Enter x (in degree): ");
        x = sc.nextDouble();
        
        double pi = 3.141592653589793;
        x = x * (pi / 180.0);
        
        double pidouble = 2 * pi;
        x = x%pidouble;
        if (x < 0) {
            x += pidouble;
        }
        
        double cosval = 0;
        for (int n = 0 ; n <= 10 ; n ++) {
            double power = 1;
            int exponent = (2 *n);
            for (i = 0 ; i < exponent ; i++) {
                power *= x;
            }
            
            double factorial = 1;
            for (int p = 1; p <= exponent ; p++) {
                factorial *= p;
            }
            double term = power/factorial;
            if (n % 2 != 0) {
                term = -term;
            }
            cosval += term;
            
        }
        double secval = 1/cosval;
        z = secval;
        menu(z);
    }
    // Cotangent = cos(x)/sin(x)
    public static void cotfxn() {
        double z = 0;
        double x = 0;
        int i= 0;
        System.out.print("Enter x (in degree): ");
        x = sc.nextDouble();
        
        double pi = 3.141592653589793;
        x = x * (pi / 180.0);
        
        double pidouble = 2 * pi;
        x = x%pidouble;
        if (x < 0) {
            x += pidouble;
        }
        
        double cotvar = 0;
        double sinvar = 0;
        for (int n = 0 ; n <= 10; n++) {
            double power = 1;
            int exponent = 2 * n + 1;
            for (i = 0 ; i < exponent ; i++) {
                power *= x;
            }

        double factorial = 1;
        int factNum = 2 * n + 1;

        for (int p = 1 ; p <= factNum ; p++) {
            factorial *= p;
        }

        double term = power / factorial;

        if (n%2 != 0) {
            term = -term;
        }
        sinvar += term;
        }
       double cosvar = 0;
        for (int n = 0 ; n <= 10 ; n ++) {
            double power = 1;
            int exponent = (2 *n);
            for (i = 0 ; i < exponent ; i++) {
                power *= x;
            }
            
            double factorial = 1;
            for (int p = 1; p <= exponent ; p++) {
                factorial *= p;
            }
            double term = power/factorial;
            if (n % 2 != 0) {
                term = -term;
            }
            cosvar += term;
            
        }
        if (cosvar < 1e-15 && cosvar > -1e-15) {
            System.out.println("Undefined - tangent is undefined at this value");
            return;
        }
        cotvar = cosvar/sinvar;
        z = cotvar;
        menu(z);
    }
    // Inverse sine using power series approximation, returns degrees
    public static double arcsinfxn(double x) {
        if (x > 1 || x < -1) {
            System.out.println("Invalid input, the value of arcsin is valid from -1 <= x <= 1.");
            return Double.NaN;
        }
        
        if (x == 1) {
            return 90;
        }
        
        if (x == -1) {
            return -90;
        }
        double term = x;  
        double arcsinvar = term;
        for (int n = 1 ; n <= 1000 ; n++){
            term *= ((x * x) * (2 * n - 1) * (2 * n - 1) / (2 * n * (2 * n + 1))); 
            arcsinvar += term;
        }
        
        return arcsinvar * (180.0 / 3.141592653589793);
    }
    
    // Inverse cosine using arcsin relationship
    public static double arccosfxn(double x1) { 
        
        if (x1 > 1 || x1 < -1) {
            System.out.println("Invalid input entered, enter a valid input.");
            return Double.NaN;
        }
        if (x1 == 1) {
            return 0;
        }
        
        if (x1 == -1 ) {
            return 180;
        }
        return 90 - arcsinfxn(x1);
    }
    
    // Inverse tangent using Taylor series, returns degrees
    public static double arctanfxn(double x2) {
        boolean invert = false;
        double sign = 1;
        
        if (x2 < 0) {
            sign = -1;
            x2 = -x2;
        }
        if (x2 > 1) {
            invert = true;
            x2 = 1/x2;
        }
        if (x2 == 0) {
            return 0;
        }
        double term = x2;
        double arctan = term;
        
        for (int n = 1 ; n < 1000 ; n++) {
            term = -term * x2 * x2;
            arctan += term / (2 * n + 1);
            if (term < 0) {
                 if (term < 1e-15) {
                     break;
                 }
            }
            if (term < 1e-15) {
                break;
            }
        }
        if (invert) {
            arctan = 3.141592653589793/2 - arctan;
        }
        return sign * arctan * (180.0/3.141592653589793);
    }
    
    // Sub-menu for operations on the result of inverse trig and other functions
    public static void menu(double z) {
        int choice1 = -1;
        
            
            while (choice1 != 0) {
                
            System.out.println("\n=== SUB-MENU ===");
            System.out.println("1.  Addition");
            System.out.println("2.  Subtraction");
            System.out.println("3.  Multiplication");
            System.out.println("4.  Division");
            System.out.println("5.  Display value");
            System.out.println("6.  Replace output value");
            System.out.println("0.  Exit");
            System.out.print("Enter option to execute operation: ");
            choice1 = sc.nextInt();
            
            switch (choice1) {
                case 1: // TODO: Implement addition
                    num += z;
                    System.out.println("Current calculation is " + num);
                break;
                
                case 2: // TODO: Implement subtraction
                    num -= z;
                    System.out.println("Current calculation is " + num);
                break;
                
                case 3: // TODO: Implement multiplication
                    num *= z;
                    System.out.println("Current calculation is " + num);
                break;
               
                case 4: // TODO: Implement division
                    if (z == 0) {
                        System.out.println("Zero Division Error, cannot divide by zero.");
                    } else{
                        num /= z;
                        System.out.println("Current calculation is " + num);
                    
                    }
                break;
                
                case 5:
                    System.out.println("The value of the executed operation is: " + z + ".");
                    break;
               
                case 6:
                    num = z;
                    System.out.println("The result has been replaced, current calculation is " + num + ".");
                    break;
                
                case 0: 
                    System.out.println("Exiting sub-menu.");
                break;  
                
                default:
                    System.out.println("Invalid choice, please enter a valid choice.");
            }
            }
    
}
        
}



/*
 Series References:
 Exponential (eˣ) Taylor series (Maclaurin series):
   https://en.wikipedia.org/wiki/Exponential_function#Series_representation

 Natural logarithm (ln x) Mercator series:
   https://en.wikipedia.org/wiki/Natural_logarithm#Computational_methods

 Base-10 logarithm (log₁₀ x) via change-of-base from ln x:
   https://en.wikipedia.org/wiki/Logarithm#Change_of_base

 Sine (sin x) Taylor series:
   https://en.wikipedia.org/wiki/Taylor_series#Trigonometric_functions

 Cosine (cos x) Taylor series:
   https://en.wikipedia.org/wiki/Taylor_series#Trigonometric_functions

 Tangent (tan x) via sin x/cos x:
   https://en.wikipedia.org/wiki/Tangent#Series_expansion

 Inverse sine (arcsin x) power series:
   https://en.wikipedia.org/wiki/Inverse_trigonometric_functions#Series_expansions

 Inverse cosine (arccos x) via arctan/arcsin relationship:
   https://en.wikipedia.org/wiki/Inverse_trigonometric_functions#Relations_between_inverse_trig_functions

 Inverse tangent (arctan x) Taylor series:
   https://en.wikipedia.org/wiki/Inverse_trigonometric_functions#Series_expansions

 Newton’s method for √x and 3√x:
   https://en.wikipedia.org/wiki/Newton%27s_method#Square_root_and_nth_root

 Degree↔radian conversion:
   https://en.wikipedia.org/wiki/Radian#Conversion_between_degrees_and_radians

 Factorial implementation and Gamma function reference:
   https://en.wikipedia.org/wiki/Factorial#Recursive_definition

 For Cube Root:
   https://old.mathpath.org/Algor/cuberoot/cube.root.newton.htm
*/

