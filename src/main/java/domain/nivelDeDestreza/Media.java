package domain.nivelDeDestreza;

import domain.tipoPersonaje.Personaje;

public class Media implements NivelDeDestreza {

    private Integer habilidadDefensiva;
    private Integer unidadDeHabilidadDef = 1;

    public Boolean esMedia(){
        return true;
    }

    public Boolean esBaja() {
        return false;
    }

    public Boolean esAlta() {
        return false;
    }

    public void entrenarA(Personaje personaje) {
        if (personaje.getNivelDeDestreza().esMedia()) {
            habilidadDefensiva = personaje.getHabilidadDefensiva() + unidadDeHabilidadDef;
        }
    }

    public void practicaAtaques(Personaje personaje) {
        if (personaje.getNivelDeDestreza().esMedia()){
            personaje.getNivelDeDestreza().esAlta();
        }
    }
}
