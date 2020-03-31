import java. lang. Math. *;
import java.util.Scanner;
public class FindArea 
{
public static void main(String[] args) {

System.out.println("Welcome!, this is an application used to calculate area and volume of different figures.");
System.out.println("Select the figure you want to get the area from. (Circle, Square, Triangle, Cylinder, Cube, Pyramid)");
System.out.println("After selecting the figure, type ft for feet or m for meters to continue");

Scanner in3 = new Scanner(System.in);
String figure = in3.next(); 

	
	
switch (figure)
{
case "Circle": 
System.out.println("You have selected Circle");
Circle();
break;
case "Square": 
System.out.println("You have selected Square");
Square();
break;
case "Triangle":
System.out.println("You have selected Triangle");
Triangle();
break;
case "Cylinder":
System.out.println("You have selected Cylinder");
Cylinder();
break;
case "Pyramid":
System.out.println("You have selected Pyramid");	
Pyramid();
break;
default:
System.out.println("Invalid option!!!");
break;
}
}



static int Cylinder() {

	 
Scanner in = new Scanner(System.in);
String unit = in.next(); 	 
	 
	 
switch (unit)
{
case "ft":

// Radius and Length input from User
System.out.println("You have selected feet");
System.out.println("Enter the radius, in feet");
Scanner in1 = new Scanner(System.in);
double radius = in1.nextDouble();
System.out.println("The radius of the circle is "+radius + " feet");
System.out.println("---------------------------------------");
System.out.println("Enter the length of the cylinder, in feet");
double length = in1.nextDouble();
System.out.println("The length of the cylinder is " +length + " feet");
double area = radius * radius * Math.PI;
System.out.println("---------------------------------------");
System.out.println("Now, to calculate area:");
System.out.println("Answer: "+area + "f²");	


//Calculate volume

double volume = area * length;
System.out.println("---------------------------------------");
System.out.println("Now, to calculate the volume:");
System.out.println("Answer: "+volume + "f³");
break;
	
//Radius and Length input from User

case "m":
System.out.println("You have selected Meters");
System.out.println("Enter the radius, in meters");
Scanner in11 = new Scanner(System.in);
double radius1 = in11.nextDouble();
System.out.println("The radius of the circle is "+radius1 + " meters");
System.out.println("---------------------------------------");
System.out.println("Enter the length of the cylinder, in meters");
double length1 = in11.nextDouble();
System.out.println("The length of the cylinder is " +length1 + " meters");
double area1 = radius1 * radius1 * Math.PI;
System.out.println("---------------------------------------");
System.out.println("Now, to calculate area:");
System.out.println("Answer: "+area1 + "f²");	

//Calculate volume

double volume1 = area1 * length1;
System.out.println("---------------------------------------");
System.out.println("Now, to calculate the volume:");
System.out.println("Answer: "+volume1 + "f³");
break;
	
default:
System.out.println("Invalid option!!");
break;
}
return 0;
}
 static int Circle()
 {
Scanner in4 = new Scanner(System.in);
String circle = in4.next(); 	 
 switch (circle)
 {
 case "ft":
// Radius and Length input from User
System.out.println("You have selected feet");
System.out.println("Enter the radius, in feet");
Scanner in1 = new Scanner(System.in);
double radius = in1.nextDouble();
System.out.println("The radius of the circle is "+radius + " feet");
System.out.println("---------------------------------------");
double area = radius * radius * Math.PI;
System.out.println("Now, to calculate area:");
System.out.println("Answer: "+area + "f²");		
break;

 case "m":
System.out.println("You have selected Meters");
System.out.println("Enter the radius, in meters");
Scanner in11 = new Scanner(System.in);
double radius1 = in11.nextDouble();
System.out.println("The radius of the circle is "+radius1 + " meters");
System.out.println("---------------------------------------");
System.out.println("Enter the length of the cylinder, in meters");
double length1 = in11.nextDouble();
System.out.println("The length of the cylinder is " +length1 + " meters");
double area1 = radius1 * radius1 * Math.PI;
System.out.println("---------------------------------------");
System.out.println("Now, to calculate area:");
System.out.println("Answer: "+area1 + "f²");	
}
return 0;
}
static int Square()  
{ 
Scanner in4 = new Scanner(System.in);
String square = in4.next();
 
switch (square)
{
case "ft":
System.out.println("You have selected Feet");
System.out.println("Enter the longitude on one of the square's side");
Scanner in14 = new Scanner(System.in);
double side = in14.nextDouble();
System.out.println("The side of the circle is "+side + " feet");
System.out.println("---------------------------------------");
System.out.println("Now, to calculate area: ");
double area = side * side;
System.out.println("Answer "+area+  "ft2");
break;

case "m":
System.out.println("You have selected Meters");
System.out.println("Enter the longitude on one of the square's side");
Scanner in141 = new Scanner(System.in);
double side1 = in141.nextDouble();
System.out.println("The side of the circle is "+side1 + " meters");
System.out.println("---------------------------------------");
System.out.println("Now, to calculate area: ");
double area1 = side1 * side1;
System.out.println("Answer "+area1 + "m2");
break;
}
return 0;
}
static int Triangle()
{
Scanner in4 = new Scanner(System.in);
String triangle = in4.next();

switch (triangle)
{
case "ft":
System.out.println("You have selected Feet");
System.out.println("Enter the longitude of the triangle's base");
Scanner in15 = new Scanner(System.in);
double base  = in15.nextDouble();
System.out.println("The base of the triangle is "+base + " meters");
System.out.println("---------------------------------------");
System.out.println("Enter the height of the triangle");
Scanner in151 = new Scanner(System.in);
double height  = in151.nextDouble();
System.out.println("Now to calculate area");
double area = 0.5 * height * base;
System.out.println("Answer "+area + "m2");
break;

case "m":
System.out.println("You have selected Meters");
System.out.println("Enter the longitude of the triangle's base");
Scanner in1411 = new Scanner(System.in);
double base1  = in1411.nextDouble();
System.out.println("The base of the triangle is "+base1 + " meters");
System.out.println("---------------------------------------");
System.out.println("Enter the height of the triangle");
Scanner in14111 = new Scanner(System.in);
double height1  = in14111.nextDouble();
System.out.println("Now to calculate area");
double area1 = 0.5 * height1 * base1;
System.out.println("Answer "+area1 + "m2");
break;
}
	
return 0;

}
static int Pyramid()
{
Scanner in4 = new Scanner(System.in);
String pyramid = in4.next();

switch(pyramid) {
case "ft":	
System.out.println("You have selected feet");
System.out.println("Enter the perimeter of the base, in feet");
Scanner in1 = new Scanner(System.in);
double perimeter = in1.nextDouble();
System.out.println("The perimeter of the pyramid is "+perimeter + " feet");
System.out.println("---------------------------------------");
System.out.println("Enter the slant height of the cylinder, in feet");
double slant = in1.nextDouble();
System.out.println("The slant of the cylinder is " +slant + " feet");
System.out.println("---------------------------------------");
System.out.println("Enter the area of the base of the pyramid");
double base = in1.nextDouble(); 
System.out.println("The base of the pyramid is " + base + "feet");
double area = perimeter * slant / 2 * base;
System.out.println("---------------------------------------");
System.out.println("Now, to calculate area:");
System.out.println("Answer: "+area + "f²");	

System.out.println("Now to calculate volume:");
double volume = base * slant / 3;
System.out.println("Answer "+volume + "f3");
break;

case "m":	
System.out.println("You have selected meters");
System.out.println("Enter the perimeter of the base, in meters");
Scanner in11 = new Scanner(System.in);
double perimeter1 = in11.nextDouble();
System.out.println("The perimeter of the pyramid is "+perimeter1 + " meters");
System.out.println("---------------------------------------");
System.out.println("Enter the slant height of the cylinder, in meters");
double slant1 = in11.nextDouble();
System.out.println("The slant of the cylinder is " +slant1 + " meters");
System.out.println("---------------------------------------");
System.out.println("Enter the area of the base of the pyramid");
double base1 = in11.nextDouble(); 
System.out.println("The base of the pyramid is " + base1 + "meters");
double area1 = perimeter1 * slant1 / 2 * base1;
System.out.println("---------------------------------------");
System.out.println("Now, to calculate area:");
System.out.println("Answer: "+area1 + "m²");	

System.out.println("Now to calculate volume:");
double volume1 = base1 * slant1 / 3;
System.out.println("Answer "+volume1 + "f3");



break;
}
return 0;
}
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 


