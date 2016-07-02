/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplotesteunitario;

/**
 *
 * @author munif
 */
public class FizBuz {
    
    public String fizBuz(int n) {
        String resposta = "";
        
        if (n % 2 == 0 && n % 3 == 0) {
            resposta = "fizbuz";
        } else
        if(n % 2==0){
            resposta = "fiz";
        } else if (n % 3 == 0 ) {
            resposta = "buz";
        } 
        
        return resposta;
        
        
    }
}
