package app;


public class FolhaSP implements Observador {
    private final ListaNoticias lista;
    private Noticia ultimaNoticia;

    FolhaSP(ListaNoticias lista)
    {
        this.lista = lista;
        this.ultimaNoticia = null;
    }
    
    public void mostrar(Noticia noticia)
    {
        System.out.println("Folha de SP: ***");
        System.out.println(noticia.getTitulo());
        System.out.println(noticia.getMateria());
    }

    public void mostrarUltima()
    {
        Noticia noticia = lista.obterUltima();

        if (ultimaNoticia != noticia)
        {
            mostrar(noticia);
            ultimaNoticia = noticia;
        }
    }

    @Override
    public void atualizar(Observável observável)
    {
        mostrarUltima();
    }
    

}
