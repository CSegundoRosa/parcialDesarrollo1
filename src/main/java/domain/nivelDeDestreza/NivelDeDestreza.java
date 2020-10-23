package domain.nivelDeDestreza;

import com.sun.org.apache.xpath.internal.operations.Bool;
import domain.tipoPersonaje.Personaje;

public interface NivelDeDestreza {

    Boolean esBaja();
    Boolean esMedia();
    Boolean esAlta();
    void entrenarA(Personaje personaje);
    void practicaAtaques(Personaje personaje);
}
