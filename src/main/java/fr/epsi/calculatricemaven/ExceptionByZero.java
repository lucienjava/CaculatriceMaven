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
public class ExceptionByZero extends Exception {

    public ExceptionByZero(String division_par_zero) {
        super (division_par_zero);
    }
    
}
