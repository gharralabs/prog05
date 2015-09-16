package app;

import java.util.ArrayList;
import java.util.List;


public class FonteDeDados extends Observável {
    
    private List<Integer> lista = new ArrayList<>();

    public List<Integer> getLista()
    {
        return lista;
    }
    
    public void adicionar(Integer valor)
    {
        lista.add(valor);
        notificar();
    }
}
