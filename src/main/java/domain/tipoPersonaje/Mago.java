package domain.tipoPersonaje;

import domain.personalidad.Personalidad;

public class Mago extends Personaje{

    //Atributos
    private Integer unidadesDeHabilidadOfensiva = 20;
    private Integer unidadesDeHabilidadDefensiva = 33;


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
        super.setEstamina(1700);
    }

    @Override
    public Boolean esHabilidoso() {
        if(this.getHabilidadDefensiva() < unidadesDeHabilidadDefensiva){
            return true;
        }
        return false;
    }

    @Override
    public Boolean esSiniestro() {
        if(this.getHabilidadOfensiva() <= unidadesDeHabilidadOfensiva){
            return true;
        }
        return false;
    }

    public Mago(String nombre, Integer habilidadDefensiva, Integer habilidadOfensiva, Integer velocidadDeAtaque, Personalidad personalidad) {
        super(nombre, habilidadDefensiva, habilidadOfensiva, velocidadDeAtaque, personalidad);
    }
}
