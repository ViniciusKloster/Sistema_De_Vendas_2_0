/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visao;

import Controle.ControleSistema;
import Modelo.Computador;
import Modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author kloster.2919
 */
public class VisaoMenu {
    public static int menuPrincipal(){
        System.out.println("|========================|");
        System.out.println("| SISTEMA DE VENDAS 2.0  |");
        System.out.println("|========================|");
        System.out.println("| |1| Cadastrar Produto  |");
        System.out.println("|------------------------|");
        System.out.println("| |2|  Alterar Produto   |");
        System.out.println("|------------------------|");
        System.out.println("| |3|  Remover Produto   |");
        System.out.println("|------------------------|");
        System.out.println("| |4|  Listar Produto    |");
        System.out.println("|========================|");
        int opcaoMenu = new Scanner(System.in).nextInt();
        
        return opcaoMenu;
    }
    
    public static int menuEscolhaProduto(){
        System.out.println("|==============CADASTRAR PRODUTO============|");
        System.out.println("|Qual categoria de produto deseja cadastrar?|");
        System.out.println("|-------------------------------------------|");
        System.out.println("| |1|               VideoGame               |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| |2|               Computador              |");
        System.out.println("|===========================================|");
        int opcaoProduto = new Scanner(System.in).nextInt();
        
        return opcaoProduto;
    }
    
    public static int menuAlteracaoProduto(){
        System.out.println("|==============Alterar Produto==============|");
        System.out.println("|        Qual produto deseja alterar?       |");
        System.out.println("|===========================================|");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
            
        }
        
        System.out.println("|===========================================|");
        int produtoAlterar = new Scanner(System.in).nextInt();
        
        return produtoAlterar;
    }
    
    public static Object menuAlteracaoProdutoInformacoes(Object object){
       
        System.out.println("===========ALTERAÇÃO VIDEOGAME===========");
        
        if(object instanceof VideoGame){
            System.out.println("Novo nome: ");
            ((VideoGame) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");   
            ((VideoGame) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova plataforma: ");
            ((VideoGame) object).setPlataforma(new Scanner(System.in).nextLine());
        }else if(object instanceof Computador){
            System.out.println("Novo nome: ");
            ((Computador) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");   
            ((Computador) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantia de memória Ram: ");
            ((Computador) object).setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Peocessador: ");
            ((Computador) object).setProcessador(new Scanner(System.in).nextLine());
        }
        System.out.println("=========================================");
        return object;
    }
    
    public static int menuRemocaoProduto(){
        System.out.println("|==============REMOVER PRODUTO==============|");
        System.out.println("|       Qual produto deseja remover?        |");
        System.out.println("|===========================================|");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        
        System.out.println("|===========================================|");
        int produtoRemover = new Scanner(System.in).nextInt();
        
        return produtoRemover;
    }
}
