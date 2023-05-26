package neyser.intereses.models;


import neyser.intereses.data.DataAnimal;

import java.util.ArrayList;
import java.util.Collections;

public class AnimalModel {
    private String ruta;
    private String tipo;
    private String nombre;

    public AnimalModel() {
    }

    public AnimalModel(String ruta, String tipo, String nombre) {
        this.ruta = ruta;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<AnimalModel> cargarData(){
        DataAnimal dataAnimal = new DataAnimal();

        ArrayList<AnimalModel> a = dataAnimal.cargarData();

        return a;

    }

    public String buscarAnimal(ArrayList<AnimalModel> anim, String tipo){
        //System.out.println("Prueba 1");

        Collections.shuffle(anim);

        ArrayList<AnimalModel> animalFinal = new ArrayList<>();

        for (AnimalModel x : anim) {
            if(x.getTipo().equalsIgnoreCase(tipo)){
                System.out.println("Ruta: "+ x.getRuta());
                animalFinal.add(x);
                //break;
            }
        }

        /*

        anim.forEach(x -> {
            if(x.getTipo().equalsIgnoreCase(tipo)){
                System.out.println("Ruta: "+ x.getRuta());
                animalFinal.add(x);
            }
        });

         */

        // Desordenar Lista


        // Crear variable para poder ingresar el HTML equivalente al resultado de la busqueda
        String resultado1 = "";

        // Dibujar div
        for (AnimalModel a: animalFinal) {
            String resultado ="";
            resultado+="<div class=\"card col-md-6 col-xl-3 p-1 m-1\" style=\"width: 18rem;\">";
            resultado+="<img src=\""+a.getRuta()+"\" class=\"card-img-top\" alt=\"...\">";
            resultado+="<h5 class=\"card-title\">"+a.getNombre().toUpperCase()+"</h5>";
            resultado+="</div>";
            resultado1 +=resultado;
        }

        // Enviar DATA
        return resultado1;
    }


}
