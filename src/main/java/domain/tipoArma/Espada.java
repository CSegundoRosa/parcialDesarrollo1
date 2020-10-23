package domain.tipoArma;

import domain.tipoPersonaje.Personaje;

public class Espada implements ElementoDeAtaque{

    //Atributos
    private Integer unidadesDeDanio = 5;

    //G&S
    public Integer getUnidadesDeDanio() {
        return unidadesDeDanio;
    }

    public void setUnidadesDeDanio(Integer unidadesDeDanio) {
        this.unidadesDeDanio = unidadesDeDanio;
    }

    //Metodos
    public Integer haceDanioA(Personaje personaje) {
        return personaje.getVida() - unidadesDeDanio;
    }

}
