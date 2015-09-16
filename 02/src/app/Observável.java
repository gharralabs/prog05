package app;

import java.util.ArrayList;
import java.util.List;


public abstract class Observável 
{
    private final List<Observador> observadores = new ArrayList<>();
    
    public void anexar(Observador observador)
    {
        observadores.add(observador);
    }

    public void desanexar(Observador observador)
    {
        observadores.remove(observador);
    }
    
    public void notificar()
    {
        for( Observador observador : observadores )
            observador.atualizar(this);
    }
    
}
