package main.java.com.pil.moby.evaluacion_tecnica.pojo;

import java.util.List;

public class Candidato {
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


}
