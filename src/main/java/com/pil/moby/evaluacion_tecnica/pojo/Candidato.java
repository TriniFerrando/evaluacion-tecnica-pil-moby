package main.java.com.pil.moby.evaluacion_tecnica.pojo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Candidato implements Comparable<Candidato>{
    private Long id;
    private String nombre;
    private String apellido;
    private Double pretensionSalarial;
    private Integer aniosExperiencia;
    private List<Tecnologia> tecnologias;

    public Candidato(Long id, String nombre, String apellido, Double pretensionSalarial, Integer aniosExperiencia, List<Tecnologia> tecnologias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.aniosExperiencia = aniosExperiencia;
        this.pretensionSalarial = pretensionSalarial;
        this.tecnologias = tecnologias;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getPretensionSalarial() {
        return pretensionSalarial;
    }

    public void setPretensionSalarial(Double pretensionSalarial) {
        this.pretensionSalarial = pretensionSalarial;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public String toString() {
        return "Candidato: \n" +
                "id=" + id +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", pretensionSalarial=" + pretensionSalarial +
                ", aniosExperiencia=" + aniosExperiencia +
                ", tecnologias=" + tecnologias;
    }

    public int compareTo(Candidato o) {
        return this.id.compareTo(o.id);
    }
    public List<Tecnologia> ordenarTecnologias() {
        Collections.sort(this.tecnologias, Comparator.comparing(Tecnologia::getNombre));
        return this.tecnologias;
    }

}
