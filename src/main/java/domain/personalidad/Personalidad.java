package domain.personalidad;

import domain.tipoPersonaje.Personaje;

public class Personalidad {
    public Boolean esDesafiante(Personaje personaje){
        if (personaje.esHabilidoso() && personaje.esSiniestro()){
            return true;
        }
        return false;
    }

    public Boolean esSumiso(Personaje personaje){
        if (!personaje.esHabilidoso() && personaje.esSiniestro()){
            return true;
        }
        return false;
    }
}
