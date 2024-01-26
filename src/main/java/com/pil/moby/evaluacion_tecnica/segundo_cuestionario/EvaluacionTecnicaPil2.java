package main.java.com.pil.moby.evaluacion_tecnica.segundo_cuestionario;

import main.java.com.pil.moby.evaluacion_tecnica.pojo.*;

import java.util.*;
import java.util.stream.Collectors;

public class EvaluacionTecnicaPil2 {
    public static void main(String[] args) {
        List<Candidato> listaCandidatos =inicializarCandidatos();
        resolverPunto1(listaCandidatos);
        resolverPunto2(listaCandidatos);
        resolverPunto3(listaCandidatos);
        resolverPunto4(listaCandidatos);
        resolverPunto5(listaCandidatos);
    }

    public static List<Candidato> inicializarCandidatos() {
        Tecnologia java = new Tecnologia(1L, "Java");
        Tecnologia angular = new Tecnologia(2L, "Angular");
        Tecnologia sql = new Tecnologia(3L, "SQL");
        Tecnologia noSql = new Tecnologia(4L, "NoSQL");
        Tecnologia vue = new Tecnologia(5L, "VUE");
        Tecnologia net = new Tecnologia(6L, ".NET");
        Tecnologia mongoDb = new Tecnologia(7L, "MongoDB");
        Tecnologia nodeJs = new Tecnologia(8L, "NodeJs");

        List<Candidato> candidatos = new ArrayList<>();

        Candidato candidato3 = new Candidato(3L, "Jhone", "Doe", 5000D, 2, Arrays.asList(java, angular, sql));
        Candidato candidato7 = new Candidato(7L, "Matías", "Otamendi", 3000D, 9, Arrays.asList(nodeJs, java, sql));
        Candidato candidato1 = new Candidato(1L, "Joaquin", "Tagliafico", 2000D, 6, Arrays.asList(mongoDb, noSql));
        Candidato candidato4 = new Candidato(4L, "Gastón", "Mac Allister", 5000.50, 1, Arrays.asList(vue, sql, java));
        Candidato candidato5 = new Candidato(5L, "Pablo", "De Paul", 9000.50, 4, Arrays.asList(java));
        Candidato candidato2 = new Candidato(2L, "Lucas", "Di Maria", 6000D, 7, Arrays.asList(java, angular, sql));
        Candidato candidato10 = new Candidato(10L, "Lionel", "Messi", 10000.10, 10, Arrays.asList(sql, vue, java));
        Candidato candidato9 = new Candidato(9L, "Julián", "Álvarez", 5000D, 3, Arrays.asList(noSql, mongoDb, sql, java));
        Candidato candidato8 = new Candidato(8L, "Lucia", "Martínez", 1000D, 2, Arrays.asList(net, java, angular));
        Candidato candidato6 = new Candidato(6L, "Agustín", "Dybala", 1000D, 2, Arrays.asList(java, net, angular));

        candidatos.add(candidato3);
        candidatos.add(candidato7);
        candidatos.add(candidato1);
        candidatos.add(candidato4);
        candidatos.add(candidato5);
        candidatos.add(candidato2);
        candidatos.add(candidato10);
        candidatos.add(candidato9);
        candidatos.add(candidato8);
        candidatos.add(candidato6);

        return candidatos;

    }
    public static void resolverPunto1(List<Candidato> candidatoList){
        for (Candidato candidato : candidatoList) {
            System.out.println(candidato);
        }
    }

    public static void resolverPunto2(List<Candidato> listaCandidatos) {
        List<Candidato> listaCandidatosOrdenados = listaCandidatos.stream().sorted().collect(Collectors.toList());
        for (Candidato candidato : listaCandidatosOrdenados) {
            System.out.println(candidato.getId() + " - " + candidato.getNombre() + " " + candidato.getApellido());
        }
    }

    public static void resolverPunto3(List<Candidato> listaCandidatos) {
        List<Candidato> listaCandidatosOrdenados = listaCandidatos.stream().sorted(Comparator.comparing(Candidato::getPretensionSalarial).reversed()).collect(Collectors.toList());
        for (Candidato candidato : listaCandidatosOrdenados) {
            System.out.println(candidato.getPretensionSalarial() + " - " + candidato.getNombre() + " " + candidato.getApellido());
        }
    }


    public static void resolverPunto4(List<Candidato> listaCandidatos) {
        Optional<Candidato> candidatoConMasExperiencia = listaCandidatos.stream().max(Comparator.comparingInt(Candidato::getAniosExperiencia));

        if (candidatoConMasExperiencia.isPresent()) {
            Candidato candidato = candidatoConMasExperiencia.get();
            System.out.println(candidato);

            List<Tecnologia> listaTecnologiasOrdenados = candidato.ordenarTecnologias();
            for (Tecnologia tecnologia : listaTecnologiasOrdenados) {
                System.out.println(tecnologia);
            }
        }
    }

    public static void resolverPunto5(List<Candidato> listaCandidatos) {
        Optional<Candidato> candidatoConMasTecnologias = listaCandidatos.stream().max(Comparator.comparingInt(c -> c.getTecnologias().size()));
        if (candidatoConMasTecnologias.isPresent()) {
            Candidato candidato = candidatoConMasTecnologias.get();
            System.out.println(candidato);

            Optional<Tecnologia> tecnologiaConIdPar = candidato.getTecnologias().stream().filter(Tecnologia::idPar).findFirst();
            tecnologiaConIdPar.ifPresent(System.out::println);
        }
    }
}
