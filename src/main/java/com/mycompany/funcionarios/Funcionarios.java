/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author evert
 */
public class Funcionarios {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        List<String> funcionario = new ArrayList<>();
        
        int opcao;
      
        
        try{
            do {
                System.out.println("1- Mostrar funcionários");
                System.out.println("2- Adicionar novo funcionário");
                System.out.println("3- Remover funcionário");
                System.out.println("---Para sair digite qualquer outro número---");
                
                opcao = s.nextInt();
                s.nextLine();
                
                switch(opcao) {
                    case 1: 
                        for(String funcionarios : funcionario) {
                            System.out.println (funcionarios);
                        }
                        break;
                        
                    case 2: 
                        System.out.println("Digite o nome do funcionário'");
                        funcionario.add(s.nextLine());
                        break;
                        
                    case 3: 
                        System.out.println("3");
                        break;
                        
                    default: 
                        System.out.println("Saindo...");
                }
                
            } while (opcao > 0 && opcao < 4);
        } catch (Exception e) {
            System.out.println("Digite apenas valores inteiros");
        }
        
        
    }
}
