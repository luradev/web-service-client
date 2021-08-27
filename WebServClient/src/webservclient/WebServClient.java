/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservclient;

import org.example.Input;
import org.example.Output;

/**
 *
 * @author lrafael
 */
public class WebServClient {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Input input = new Input();
        input.setNum1(15);
        input.setNum2(5);
        
        Output out = process(input);
        int resultado = out.getResultado();
        System.out.println("Resultado: "+resultado);
    }

    private static Output process(org.example.Input payload) {
        com.oracle.xmlns.lab02.soma.soma.SomaClientEp service = new com.oracle.xmlns.lab02.soma.soma.SomaClientEp();
        com.oracle.xmlns.lab02.soma.soma.SOMA port = service.getSOMAPt();
        return port.process(payload);
    }
    
}
