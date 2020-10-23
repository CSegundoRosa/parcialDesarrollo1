package domain.tipoArma;

import domain.tipoPersonaje.Personaje;

public class FlechaDeFuego implements ElementoDeAtaque{

    //Atributos
    private Integer unidadesDeDanio = 7;

    //Metodos
    public Integer haceDanioA(Personaje personaje) {
        return personaje.getVida() - unidadesDeDanio;
    }
}
