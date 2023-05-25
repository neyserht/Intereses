package neyser.intereses.data;

import neyser.intereses.models.AnimalModel;

import java.util.ArrayList;
import java.util.Collections;

public class DataAnimal {

    ArrayList<AnimalModel> animales = new ArrayList<>();

    //    animales.add(new AnimalModel("images/aves/aguila.jpg","AVE", "aguila"));

    public ArrayList<AnimalModel> cargarData(){

        // Ingresando AVES
        animales.add(new AnimalModel("images/aves/aguila.jpg","AVE", "aguila"));
        animales.add(new AnimalModel("images/aves/colibri.png","AVE", "colibri"));
        animales.add(new AnimalModel("images/aves/condor.jpg","AVE", "condor"));
        animales.add(new AnimalModel("images/aves/gaviota.jpg","AVE", "gaviota"));
        animales.add(new AnimalModel("images/aves/gaviota.jpg","AVE", "gaviota"));
        animales.add(new AnimalModel("images/aves/pato.jpg","AVE", "pato"));
        animales.add(new AnimalModel("images/aves/pato.jpg","AVE", "pato"));

        // Ingresando INSECTOS
        animales.add(new AnimalModel("./images/insectos/abeja.jpg","INSECTO", "abeja"));
        animales.add(new AnimalModel("./images/insectos/avispa.jpg","INSECTO", "avispa"));
        animales.add(new AnimalModel("./images/insectos/libelula.jpg","INSECTO", "libelula"));
        animales.add(new AnimalModel("./images/insectos/mariposa.jpg","INSECTO", "mariposa"));
        animales.add(new AnimalModel("./images/insectos/mosca.jpg","INSECTO", "mosca"));

        // Ingresando MAMIFEROS
        animales.add(new AnimalModel("./images/mamiferos/bufalo.jpg","MAMIFERO", "bufalo"));
        animales.add(new AnimalModel("./images/mamiferos/conejo.png","MAMIFERO", "conejo"));
        animales.add(new AnimalModel("./images/mamiferos/gato.jpg","MAMIFERO", "gato"));
        animales.add(new AnimalModel("./images/mamiferos/koala.jpg","MAMIFERO", "koala"));
        animales.add(new AnimalModel("./images/mamiferos/leon.jpg","MAMIFERO", "leon"));
        animales.add(new AnimalModel("./images/mamiferos/perro.jpg","MAMIFERO", "perro"));
        animales.add(new AnimalModel("./images/mamiferos/tigre.jpg","MAMIFERO", "tigre"));
        animales.add(new AnimalModel("./images/mamiferos/zebra.jpg","MAMIFERO", "zebra"));

        // Ingresando PECES
        animales.add(new AnimalModel("./images/peces/ballena.jpg","PEZ", "ballena"));
        animales.add(new AnimalModel("./images/peces/espada.jpg","PEZ", "espada"));
        animales.add(new AnimalModel("./images/peces/orca.jpg","PEZ", "orca"));
        animales.add(new AnimalModel("./images/peces/payaso.jpg","PEZ", "payaso"));
        animales.add(new AnimalModel("./images/peces/tiburon.jpg","PEZ", "tiburon"));

        // Ingresando REPTILES
        animales.add(new AnimalModel("./images/reptiles/camaleon.jpg","REPTIL", "camaleon"));
        animales.add(new AnimalModel("./images/reptiles/cascabel.jpg","REPTIL", "cascabel"));
        animales.add(new AnimalModel("./images/reptiles/iguana.jpg","REPTIL", "iguana"));
        animales.add(new AnimalModel("./images/reptiles/lagartija.jpg","REPTIL", "lagartija"));
        animales.add(new AnimalModel("./images/reptiles/python.jpg","REPTIL", "python"));

        return animales;

    }





}
