package app;


public class Estadao implements Observador{
    
    private final ListaNoticias lista;
    public Noticia ultimaNoticia;

    public Estadao(ListaNoticias lista)
    {
        this.lista = lista;
        ultimaNoticia = null;
    }

    public void exibir(Noticia noticia)
    {
        System.out.println("ESTADÃO: ***");
        System.out.println(noticia.getTitulo());
        System.out.println(noticia.getMateria());
    }

    public void exibirUltima()
    {
        synchronized(lista)
        {
            Noticia noticia = lista.obterUltima();
            
            if( ultimaNoticia != noticia)
            {
                exibir(noticia);
                ultimaNoticia = noticia;
            }   
        }
    }

    @Override
    public void atualizar(Observável observável)
    {
        exibirUltima();
    }
}
