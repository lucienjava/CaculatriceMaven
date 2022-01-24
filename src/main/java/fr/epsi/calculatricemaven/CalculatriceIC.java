/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.calculatricemaven;



/**
 *
 * @author 33676
 */
public class CalculatriceIC {

    
    
    public double addition(double a, double b){
        return a+b;
    }
    
    /**
     * fonction Soustraction, retourne le resultat de la soustraction 
     * mathematique de a - b
     * @param a de type entier
     * @param b de type entier
     * @return un entier 
     */
    public double soustraction(double a, double b){
        return a-b;
    }
    
    public double multiplication(double a, double b){
        return a*b;
    }
    
    
    public double division(double a, double b) throws ExceptionByZero{
        if(b == 0){
            throw new ExceptionByZero("Division par zero");
        }
        return a/b;
        
    }
}
