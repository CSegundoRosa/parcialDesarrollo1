package domain.tipoPersonaje;

import domain.personalidad.Personalidad;

public class Bruja extends Personaje {

    //atributos
    private Integer unidadesDeVelAtaque = 6;
    private Integer unidadesDeHabilidadDefensiva = 3;

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
        super.setEstamina(2000);
    }

    @Override
    public Boolean esAgil() {
        if(this.getVelocidadDeAtaque() > unidadesDeVelAtaque){
            return true;
        }
        return false;
    }

    @Override
    public Boolean esHabilidoso() {
        if(this.getHabilidadDefensiva() > unidadesDeHabilidadDefensiva){
            return true;
        }
        return false;
    }


    public Bruja(String nombre, Integer habilidadDefensiva, Integer habilidadOfensiva, Integer velocidadDeAtaque, Personalidad personalidad) {
        super(nombre, habilidadDefensiva, habilidadOfensiva, velocidadDeAtaque, personalidad);
    }
}
