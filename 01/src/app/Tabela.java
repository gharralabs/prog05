package app;


public class Tabela 
{
    private final FonteDeDados fonte;
    public Tabela(FonteDeDados fonte)
    {
        this.fonte = fonte;
    }
    
    public void desenhar()
    {
        System.out.println("TABELA: ");
        
        for(Integer valor : fonte.getLista() )
            System.out.println(valor);
            
    }
}
