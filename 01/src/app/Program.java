package app;

import java.util.Scanner;

public class Program
{

    public static void main(String[] args)
    {
        FonteDeDados fonte;
        fonte = new FonteDeDados();

        GraficoJFrame grafico;
        grafico = new GraficoJFrame(fonte);
        grafico.setVisible(true);
        grafico.setLocation(0, 0);
        grafico.setTitle("Gráfico");

        
        TabelaJFrame tabela = new TabelaJFrame(fonte);
        tabela.setVisible(true);
        tabela.setTitle("Tabela");
        tabela.setLocation( grafico.getWidth() + 100, 0);

        
        
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        Integer valor;
        
        do
        {
            System.out.println("Informe um valor: ");
            valor = scanner.nextInt();
            fonte.adicionar(valor); // Todas as vezes que um novo valor
                                    // for adicionado a fonte de dados 
                                    // todos os objetos dependentes
                                    // deverão se atualizar.
            
            tabela.desenhar();
            grafico.plotar();
        }
        while( valor != -1 );
        
        tabela.dispose();
        grafico.dispose();

        
        
    }
    
}
