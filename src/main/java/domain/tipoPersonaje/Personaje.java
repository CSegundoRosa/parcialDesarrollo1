package domain.tipoPersonaje;

import domain.Baul;
import domain.nivelDeDestreza.NivelDeDestreza;
import domain.personalidad.Personalidad;

public abstract class Personaje {
    //Atributos
    private String nombre;
    private Integer vida;
    private Integer estamina;
    private Integer habilidadDefensiva;
    private Integer habilidadOfensiva;
    private Integer velocidadDeAtaque;
    private NivelDeDestreza nivelDeDestreza;
    private Personalidad personalidad; //No me convence demasiado que digamos
    private Baul baul; //despues veo que hago con esto

    //Setters&Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getEstamina() {
        return estamina;
    }

    public void setEstamina(Integer estamina) {
        this.estamina = estamina;
    }

    public Integer getHabilidadDefensiva() {
        return habilidadDefensiva;
    }

    public void setHabilidadDefensiva(Integer habilidadDefensiva) {
        this.habilidadDefensiva = habilidadDefensiva;
    }

    public Integer getHabilidadOfensiva() {
        return habilidadOfensiva;
    }

    public void setHabilidadOfensiva(Integer habilidadOfensiva) {
        this.habilidadOfensiva = habilidadOfensiva;
    }

    public Integer getVelocidadDeAtaque() {
        return velocidadDeAtaque;
    }

    public void setVelocidadDeAtaque(Integer velocidadDeAtaque) {
        this.velocidadDeAtaque = velocidadDeAtaque;
    }

    public NivelDeDestreza getNivelDeDestreza() {
        return nivelDeDestreza;
    }

    public void setNivelDeDestreza(NivelDeDestreza nivelDeDestreza) {
        this.nivelDeDestreza = nivelDeDestreza;
    }

    public Personalidad getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(Personalidad personalidad) {
        this.personalidad = personalidad;
    }

    //Constructor
    public Personaje(String nombre, Integer habilidadDefensiva, Integer habilidadOfensiva, Integer velocidadDeAtaque, Personalidad personalidad) {
        this.nombre = nombre;
        this.vida = 100;
        this.estamina = estamina;
        this.habilidadDefensiva = habilidadDefensiva;
        this.habilidadOfensiva = habilidadOfensiva;
        this.velocidadDeAtaque = velocidadDeAtaque;
        this.personalidad = personalidad;
    }

    //Metodos
    public void entrenar(){}

    public Double puntosInteligencia(){
        Double inteligencia;
        Double unidadesVariablesA = 5.00;
        Double unidadesVariablesB = 10.00;

        inteligencia = ((unidadesVariablesA * habilidadDefensiva) + (unidadesVariablesB * velocidadDeAtaque)) / habilidadOfensiva;

        return inteligencia;
    }

    public Boolean esAgil(){
        return true;
    }

    public Boolean esHabilidoso(){
        return true;
    }

    public Boolean esSiniestro(){
        return true;
    }

    //Inicializar las destrezas
    //Inicializar habilidades al ppio
    //Trabajar el baul
    //Puntos de vida 0 y contador


}
