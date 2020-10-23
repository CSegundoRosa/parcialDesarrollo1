package domain.tipoPotenciador;

import domain.tipoArma.ElementoDeAtaque;
import domain.tipoPersonaje.Personaje;

public class HechizoLunatico implements ElementoPotenciador{

    //Atributos
    private Integer unidadesEstaminaDisminuida = 450;
    private Integer unidadesDeDanio = 12;

    public Integer disminuyeEstaminaA(Personaje personaje) {
        return personaje.getEstamina() - unidadesEstaminaDisminuida;
    }

    public Integer haceDanioA(Personaje personaje) {
        return personaje.getVida() - unidadesDeDanio;
    }
    //Disminuye 12 puntos de vida al atacado mas el daño que haga el arma.
    //Falta algo asi como personaje.getvida - elementodeataque.getDanio

}
