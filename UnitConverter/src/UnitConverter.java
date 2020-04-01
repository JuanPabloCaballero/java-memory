import java. lang. Math. *;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UnitConverter 
{
public static void main(String[] args) 
{			
System.out.println("Welcome, this project will convert your units! Just enter the amount");
System.out.println("What scalar factor do you want to convert? (Fahrenheit to Celsius, Meters to Feet, CM to Inches, USD to Euro, and Kilograms to Pounds)");


System.out.println("------------------------------------------------");
System.out.println("Select what scalar measurement you want to use: ");
System.out.println("Press F for Fahrenheit, C for Celsius, M for Meters, FT for Feet, CM for Centimeters, IN for Inches, USD for USD, EU for Euro, KG for Kilograms, and P for Pounds");

Scanner in1 = new Scanner(System.in);
String scalar = in1.next(); 

switch(scalar)
{
case "F":
case "f":	
System.out.println("You have selected Fahrenheit");
System.out.println("Lets convert it to Celsius!");
Fahrenheit();
break;

case "C":
case "c":
System.out.println("You have selected Celsius");
System.out.println("Lets convert it to Fahrenheit!");
Celsius();
break;

case "M":
case "m":
System.out.println("You have selected Meters");	
System.out.println("Lets convert it to Feet!");
Meters();
break;

case "FT":
case "ft":	
System.out.println("You have selected Feet");
System.out.println("Lets convert it to Meters!");
Feet();
break;

case "CM":
case "cm":
System.out.println("You have selected Centimeters");
System.out.println("Lets convert it to Inches!");
Centimeters();
break;

case "IN":
case "in":
System.out.println("You have selected Inches");	
System.out.println("Lets convert it to Centimeters");
Inches();
break;

case "USD":
case "usd":
System.out.println("You have selected USD");
System.out.println("Lets convert it to Euro!");
USD();
break;

case "EU":
case "eu":
System.out.println("You have selected Euro");
System.out.println("Lets convert it to USD!");
Euro();
break;

case "KG":
case "kg":
System.out.println("You have selected Kilograms");
System.out.println("Lets convert it to Pounds!");
Kilogram();
break;

case "P":
case "p":
System.out.println("You have selected Pounds");	
System.out.println("Lets convert it to Kilograms!");
Pound();
break;

default:	
System.out.println("Invalid option!!!");	
break;
}

}
static int Fahrenheit()
{

System.out.println("Enter the amount");	
Scanner in = new Scanner(System.in);
double amount = in.nextDouble();	
System.out.println("Amount = "+amount);
System.out.println("Converting values... buzz buzz buzz");
double ftoc = amount - 32 * 5 / 9;
System.out.println(amount + " fahrenheit in celsius is " + ftoc);
return 0;
}
static int Celsius()
{
System.out.println("Enter the amount");
Scanner in = new Scanner(System.in);
double amount = in.nextDouble();
System.out.println("Amount = "+amount);	
System.out.println("Converting values... buzz buzz buzz");	
double ctof = amount * 9 / 5 + 32;	
System.out.println(amount + " celsius in fahrenheit is " + ctof);	
return 0;
}
static int Meters()
{
System.out.println("Enter the amount");
Scanner in = new Scanner(System.in);
double amount = in.nextDouble();
System.out.println("Amount = "+amount);	
System.out.println("Converting values... buzz buzz buzz");		
double mtof = amount * 3.281;
System.out.println(amount + " meter(s) in feet is " + mtof);
return 0;
}
static int Feet()
{
System.out.println("Enter the amount");
Scanner in = new Scanner(System.in);
double amount = in.nextDouble();
System.out.println("Amount = "+amount);	
System.out.println("Converting values... buzz buzz buzz");	
double ftom = amount / 3.821;
System.out.println(amount + " feet(s) in meters is "+ftom);	
return 0;
}
static int Centimeters()
{
System.out.println("Enter the amount");
Scanner in = new Scanner(System.in);
double amount = in.nextDouble();
System.out.println("Amount = "+amount);	
System.out.println("Converting values... buzz buzz buzz");	
double cmtoin = amount /  2.54;
System.out.println(amount + " centimeter(s) in inches is "+cmtoin);	
return 0;
}
static int Inches()
{
System.out.println("Enter the amount");
Scanner in = new Scanner(System.in);
double amount = in.nextDouble();
System.out.println("Amount = "+amount);	
System.out.println("Converting values... buzz buzz buzz");	
double intocm = amount * 2.54;
System.out.println(amount + " inches in centimeters is "+intocm);	
return 0;
}
static int USD()
{
System.out.println("Enter the amount");
Scanner in = new Scanner(System.in);
double amount = in.nextDouble();
System.out.println("Amount = "+amount);	
System.out.println("Converting values... buzz buzz buzz");	
double usdtoeu = amount * 0.91;
System.out.println(amount + " USD in Euro is " + usdtoeu);
return 0;
}
static int Euro()
{
System.out.println("Enter the amount");
Scanner in = new Scanner(System.in);
double amount = in.nextDouble();
System.out.println("Amount = "+amount);	
System.out.println("Converting values... buzz buzz buzz");	
double eutousd = amount / 0.91;
System.out.println(amount + " Euro in USD is " + eutousd);
return 0;
}
static int Kilogram()
{
System.out.println("Enter the amount");
Scanner in = new Scanner(System.in);
double amount = in.nextDouble();
System.out.println("Amount = "+amount);	
System.out.println("Converting values... buzz buzz buzz");	
double kgtop = amount * 2.205;
System.out.println(amount + " kilogram(s) in pounds is " + kgtop);
return 0;
}
static int Pound()
{
System.out.println("Enter the amount");
Scanner in = new Scanner(System.in);
double amount = in.nextDouble();
System.out.println("Amount = "+amount);	
System.out.println("Converting values... buzz buzz buzz");	
double ptokg = amount / 2.205;
System.out.println(amount + " pound(s) in kilograms is " + ptokg);
return 0;
}
}


	

