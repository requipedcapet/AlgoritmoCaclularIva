/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sena
 */
public class For_par_impar {
     public static void main(String[] args) {
         int x=0;
         for(int i=0; i<3; i++)
         { 
             for (int j=0; j<3; j++)
             { 
                 for (int z=0; z<3; z++)
                 {
                     x=x+1;
                     System.out.println(+i+""+j+""+z+""+x);
                 }
             }
         }
    
}
}

