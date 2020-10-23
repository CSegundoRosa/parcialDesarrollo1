package domain.tipoPotenciador;

import domain.tipoArma.ElementoDeAtaque;
import domain.tipoPersonaje.Personaje;

public class PocionRoja implements ElementoPotenciador {

    //Atributos
    private Integer unidadesEstaminaDisminuida = 200;
    private Integer unidadesDeDanio = 4;

    public Integer disminuyeEstaminaA(Personaje personaje) {
        return personaje.getEstamina() - unidadesEstaminaDisminuida;
    }

    public Integer haceDanioA(Personaje personaje) {
        return null;
    }
    //Falta algo asi como personaje.getvida - elementodeataque.getDanio
}
