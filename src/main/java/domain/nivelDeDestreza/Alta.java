package domain.nivelDeDestreza;

import domain.tipoPersonaje.Personaje;
import org.omg.PortableInterceptor.INACTIVE;

public class Alta implements NivelDeDestreza{
    /*public Boolean afectarA(Personaje personaje) {
        if (personaje.esSiniestro() && personaje.esHabilidoso() && personaje.esAgil()){
        return true;
        }
        return false;
    }*/
    private Integer unidadesDeHabilidadDefensiva = 3;
    private Integer habilidadDefensiva;
    private Integer unidadesDeHabilidadOfensiva = 4;
    private Integer habilidadOfensiva;
    private Integer velDeAtaque;
    private Integer unidadesDeVelDeAtaque = 1;

    public Boolean esBaja() {
        return false;
    }

    public Boolean esMedia() {
        return false;
    }

    public Boolean esAlta() {
        return true;
    }

    public void entrenarA(Personaje personaje) {
        if (personaje.getNivelDeDestreza().esAlta()){
            habilidadDefensiva = personaje.getHabilidadDefensiva() + unidadesDeHabilidadDefensiva;
        }
    }

    public void practicaAtaques(Personaje personaje) {
        if (personaje.getNivelDeDestreza().esAlta()){
            habilidadOfensiva = personaje.getHabilidadOfensiva() + unidadesDeHabilidadOfensiva;
            velDeAtaque = personaje.getVelocidadDeAtaque() + unidadesDeVelDeAtaque;
        }

    }
}
