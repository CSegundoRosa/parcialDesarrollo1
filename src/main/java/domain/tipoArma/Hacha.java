package domain.tipoArma;

import domain.tipoPersonaje.Personaje;

public class Hacha implements ElementoDeAtaque{

    //Atributos
    private Integer unidadesDeDanio = 4;

    //Metodos
    public Integer haceDanioA(Personaje personaje) {
        return personaje.getVida() - unidadesDeDanio;
    }
}
