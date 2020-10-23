package domain.tipoPersonaje;

import domain.personalidad.Personalidad;

public class Ladron extends Personaje {

    //Atributo
    private Integer unidadesDeVelAtaque = 6;
    private Integer unidadesDeHabilidadOfensiva = 10;

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setVida(Integer vida) {
        super.setVida(100);
    }

    @Override
    public void setEstamina(Integer estamina) {
        super.setEstamina(500);
    }

    @Override
    public Boolean esAgil() {
        if(this.getHabilidadOfensiva() < unidadesDeVelAtaque){
            return true;
        }
        return false;
    }

    @Override
    public Boolean esSiniestro() {
        if(this.getHabilidadOfensiva() < unidadesDeHabilidadOfensiva){
            return true;
        }
        return false;
    }

    public Ladron(String nombre, Integer habilidadDefensiva, Integer habilidadOfensiva, Integer velocidadDeAtaque, Personalidad personalidad) {
        super(nombre, habilidadDefensiva, habilidadOfensiva, velocidadDeAtaque, personalidad);
    }
}
