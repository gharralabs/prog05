package app;

import java.util.ArrayList;
import java.util.List;


public class ListaNoticias extends Observável {
    
    private final List<Noticia> noticias;
    
    
    public ListaNoticias()
    {
        noticias = new ArrayList<>();
    }
    
    public Noticia adicionar(String titulo, String materia)
    {
        Noticia noticia;
        noticia = new Noticia(titulo, materia);
        noticias.add(noticia);
        notificar();
        return noticia;
    }
   
    public Noticia obterUltima()
    {
        if( noticias.size() > 0 )
            return noticias.get(noticias.size() - 1);
        else
            return null;
    }
    
}
