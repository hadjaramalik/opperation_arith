/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applioperat_arithm;

/**
 *
 * @author bar
 */
public class AppliOperat_Arithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int X=4, Y=8, Z=3, t=7, calcul;
       calcul=X*Y-Z+t;
       System .out.println(" X*y-Z+t="+calcul);
       calcul =X*Y-(Z+t);
       System.out.println("X*Y-(Z+t)="+calcul);
       calcul=X*Y%Z+t;
       System.out.println("X*Y%Z+t="+calcul);
       calcul=((X*Y)%Z)+t;
       System.out.println("((X*Y)%Z)+t="+calcul);
       calcul=X*Y%(Z+t);
       System.out.println("X*Y%(Z+t)="+calcul);
       calcul=X*(Y%(Z+t));
       System.out.println("X*(y%(Z+t))="+calcul);       
        
    }
    
}
