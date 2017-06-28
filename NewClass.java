/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.IMSA.Intersession.chemistrytools;
import java.util.*;
public class MolecularFormula2 {
    String[] elements= new String[10];
    
public MolecularFormula2(String formula)
{
    for (int i =0; i<formula.length(); i++)
    {       
       if(Character.isLetter(formula.charAt(i)))
       {
           elements[i] += (Character.toString(formula.charAt(i)));
       }
    }
     
    for (String element : elements)
    {
        System.out.println(element);
    }
}

public static void main (String[] args)
{
    MolecularFormula2 one = new MolecularFormula2("H2FE2O");
}
}

