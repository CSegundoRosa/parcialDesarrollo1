package domain.nivelDeDestreza;

import domain.tipoPersonaje.Personaje;

public class Baja implements NivelDeDestreza {

    private Integer nivelEstamina;
    private Integer nuevoNivelEstamina = 300;

    public Boolean esBaja() {
        return true;
    }

    public Boolean esMedia() {
        return false;
    }

    public Boolean esAlta() {
        return false;
    }

    public void entrenarA(Personaje personaje) {
        if(personaje.getNivelDeDestreza().esBaja()){
            personaje.getNivelDeDestreza().esMedia();
        }
    }

    public void practicaAtaques(Personaje personaje) {
        if (personaje.getNivelDeDestreza().esBaja()){
            nivelEstamina = personaje.getEstamina() + nuevoNivelEstamina;
        }
    }

    /*public Boolean afectarA(Personaje personaje) {
        if(personaje.getNivelDeDestreza(Alta) || personaje.getNivelDeDestreza(Media)){
            return true;
        }
        return false;
    }*/
    //Ya se que esta mal pensado porque sintacticamente es un boolean que afecta A un personaje.

}
