package app;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        ListaNoticias lista = new ListaNoticias();
        Estadao estadao = new Estadao(lista);
        lista.anexar(estadao);
        
        FolhaSP folha = new FolhaSP(lista);
        lista.anexar(folha);

        do
        {
            System.out.println("Informe o título da notícia: ");
            String titulo = scanner.nextLine();
            
            if( "sair".equals(titulo))
                break;
            
            System.out.println("Informe o corpo da notícia: ");
            String materia = scanner.nextLine();
            
            lista.adicionar(titulo, materia);
        }
        while(true);
    }
    
}
