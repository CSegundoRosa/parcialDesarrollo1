package domain.tipoPotenciador;

import domain.tipoArma.ElementoDeAtaque;
import domain.tipoPersonaje.Personaje;

public interface ElementoPotenciador {

    Integer disminuyeEstaminaA (Personaje personaje);
    Integer haceDanioA (Personaje personaje);


}
