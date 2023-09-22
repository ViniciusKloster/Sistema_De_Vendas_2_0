/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadevendas_2_0;

import Controle.ControleSistema;
import Outros.Constantes;
import Visao.VisaoMenu;

/**
 *
 * @author kloster.2919
 */
public class SistemaDeVendas_2_0 {

    public static void main(String[] args) {
        int opcaoMenu;
        
        while(true){
            opcaoMenu = VisaoMenu.menuPrincipal();
            
            if(opcaoMenu == Constantes.CADASTRAR){
             ControleSistema.cadastrar();             
            }else if(opcaoMenu == Constantes.ALTERAR){
                ControleSistema.alterar(VisaoMenu.menuAlteracaoProduto());                
            }else if(opcaoMenu == Constantes.LISTAR){
                ControleSistema.listar(ControleSistema.produtos);
            }else if(opcaoMenu == Constantes.REMOVER){
                ControleSistema.remover(VisaoMenu.menuRemocaoProduto());
            }
        }
    }
}
