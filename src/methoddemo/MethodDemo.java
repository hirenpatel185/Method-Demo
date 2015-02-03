/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methoddemo;

import java.util.Scanner;

/**
 *
 * @author c0651609
 */
public class MethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------");
            System.out.print("\n1.Method with no para.\n"
                    + "2.method with para .\n"
                    + "3.method with return\n"
                    + "4.method with return and Parameter.\n"
                    + "0.Exit\n");
            System.out.println("Enter Your Choice :");
            choice = sc.nextInt();
            System.out.println("\n------------------------------");
            switch (choice) {
                case 1:
                    outputRecord();
                    break;
                case 2:
                    String firstString = new String("Hiren");
                    String secondString = new String("Patel");
                    mashup(firstString, secondString);
                    break;
                case 3:
                    int radius;
                    double sphereArea;
                    //defining Scanner object
                    Scanner sc1=new Scanner(System.in);
                    
                    System.out.println("enter radius :");
                    radius=sc1.nextInt();
                    
                    // Inputing Parameter to Mathod and receiving value as double
                  
                    System.out.println("SphereArea: "+sphereArea(radius));
                            
                    break;
                case 4:
                    double radius1,height;
                    Scanner sc2=new Scanner(System.in);
                    System.out.println("Enter Radius :");
                    radius1=sc2.nextDouble();
                    System.out.println("Enter Height :");
                    height=sc2.nextDouble();
                    System.out.println("CylinderArea: "+cylinderArea(radius1, height));
                    break;
                default:
                    break;

            }
        } while (choice != 0);
    }

    private static void outputRecord() {
        System.out.println("Hirenkumar");
        System.out.println("Patel");
        System.out.println("Lambton College");
    }

    
    private static void mashup(String firstString, String secondString) {
        //concatnation
        String mashup = firstString.concat(secondString).concat(firstString).concat(secondString);
        System.out.println("String :" + mashup);
    }
    
    private static double sphereArea(int radius)
    {
        // returning value of sphereArea as double..
        
        return 4*Math.PI*Math.pow(radius, 2);
        
    }
    private static double cylinderArea(double radius, double height)
    {
        double cylinderArea= (2* Math.PI*radius*height) +(2*Math.PI *Math.pow(radius, 2));
        return cylinderArea;
    }

}
