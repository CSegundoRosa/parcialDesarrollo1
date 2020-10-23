package domain.tipoPotenciador;

import domain.tipoArma.ElementoDeAtaque;
import domain.tipoPersonaje.Personaje;

public class PocionVioleta implements ElementoPotenciador{

    //Atributos
    private Integer unidadesEstaminaDisminuida = 0;
    private Integer unidadesDeDanio = 10;

    //Metodos
    public Integer disminuyeEstaminaA(Personaje personaje) {
        return personaje.getEstamina() - unidadesEstaminaDisminuida;
    }

    public Integer haceDanioA(Personaje personaje) {
        return personaje.getVida() - unidadesDeDanio;
    }

    //Falta hacer lo del daño del arma que usa
    //Disminuye diez de daño al atacado + el daño que hace el arma donde se aplica



}
