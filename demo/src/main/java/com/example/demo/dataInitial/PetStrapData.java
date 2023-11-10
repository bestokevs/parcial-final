package com.example.demo.dataInitial;

import com.example.demo.domain.*;
import com.example.demo.repositories.ropaRepositories;
import com.example.demo.repositories.personalizadosRepositories;
import com.example.demo.repositories.accesoriosRepositories;
import com.example.demo.repositories.figurasRepositories;
import com.example.demo.repositories.peluchesRepositories;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class PetStrapData implements CommandLineRunner {

    private final accesoriosRepositories AccesoriosRepository;
    private final personalizadosRepositories PersonalizadosRepository;
    private final figurasRepositories FigurasRepository;
    private final peluchesRepositories PeluchesRepository;
    private final ropaRepositories RopaRepository;

    public PetStrapData(accesoriosRepositories accesoriosRepository, personalizadosRepositories personalizadosRepository, figurasRepositories figurasRepository, peluchesRepositories peluchesRepository, ropaRepositories ropaRepository) {
        AccesoriosRepository = accesoriosRepository;
        PersonalizadosRepository = personalizadosRepository;
        FigurasRepository = figurasRepository;
        PeluchesRepository = peluchesRepository;
        RopaRepository = ropaRepository;
    }


    @Override
    public void run(String... args) {

        accesoriosEntity acc1 = new accesoriosEntity("Collar par corazon","collar", "aleacion",35000);
        accesoriosEntity acc2 = new accesoriosEntity("Anillo buho","anillo", "acero inoxidable",30000);
        accesoriosEntity acc3 = new accesoriosEntity("Aretes puas","aretes", "aleacion",20000);
        accesoriosEntity acc4 = new accesoriosEntity("Aretes serpiente","aretes", "acero inoxidable",20000);
        accesoriosEntity acc5 = new accesoriosEntity("Aretes Zoro","aretes", "aleacion",22000);
        accesoriosEntity acc6 = new accesoriosEntity("Pulseras kuromi","pulsera", "aleacion",20000);
        accesoriosEntity acc7 = new accesoriosEntity("Anillo par mariposa","anillo", "acero inoxidable",20000);
        accesoriosEntity acc8 = new accesoriosEntity("Anillo par dino","anillo", "acero inoxidable",20000);
        accesoriosEntity acc9 = new accesoriosEntity("collar par gato","collar", "aleacion",20000);
        accesoriosEntity acc10 = new accesoriosEntity("aretes hongo","aretes", "resina",20000);

        AccesoriosRepository.save(acc1);
        AccesoriosRepository.save(acc2);
        AccesoriosRepository.save(acc3);
        AccesoriosRepository.save(acc4);
        AccesoriosRepository.save(acc5);
        AccesoriosRepository.save(acc6);
        AccesoriosRepository.save(acc7);
        AccesoriosRepository.save(acc8);
        AccesoriosRepository.save(acc9);
        AccesoriosRepository.save(acc10);



        figurasEntity fig1 = new figurasEntity("Chainsaw 1", "15cm", "anime", 30000);
        figurasEntity fig2 = new figurasEntity("Chainsaw 2", "15cm", "anime", 30000);
        figurasEntity fig3 = new figurasEntity("Chainsaw 3", "15cm", "anime", 30000);
        figurasEntity fig4 = new figurasEntity("Luffy", "26CM", "anime", 65000);
        figurasEntity fig5 = new figurasEntity("Evangelion 1", "12CM", "anime", 15000);
        figurasEntity fig6 = new figurasEntity("Evangelion 2", "12CM", "anime", 15000);
        figurasEntity fig7 = new figurasEntity("Evangelion 3", "12CM", "anime", 15000);
        figurasEntity fig8 = new figurasEntity("Horsea", "15cm", "Funko", 65000);
        figurasEntity fig9 = new figurasEntity("IronMan", "15cm", "Funko", 80000);
        figurasEntity fig10 = new figurasEntity("Luffy 2", "20cm", "anime", 65000);


        FigurasRepository.save(fig1);
        FigurasRepository.save(fig2);
        FigurasRepository.save(fig3);
        FigurasRepository.save(fig4);
        FigurasRepository.save(fig5);
        FigurasRepository.save(fig6);
        FigurasRepository.save(fig7);
        FigurasRepository.save(fig8);
        FigurasRepository.save(fig9);
        FigurasRepository.save(fig10);


        peluchesEntity pel1 = new peluchesEntity("Kuromi","35cm","sanrio",45000,"felpa y algodon");
        peluchesEntity pel2 = new peluchesEntity("HelloKitty","35cm","sanrio",55000,"felpa y algodon");
        peluchesEntity pel3 = new peluchesEntity("Bonnie","35cm","FNAF",55000,"felpa y algodon");
        peluchesEntity pel4 = new peluchesEntity("Freddy","35cm","FNAF",55000,"felpa y algodon");
        peluchesEntity pel5 = new peluchesEntity("Foxy","35cm","FNAF",55000,"felpa y algodon");
        peluchesEntity pel6 = new peluchesEntity("Puppet","35cm","sanrio",55000,"felpa y algodon");
        peluchesEntity pel7 = new peluchesEntity("Isaac","35cm","juegos",45000,"felpa y algodon");
        peluchesEntity pel8 = new peluchesEntity("Spiderman","35cm","comics",65000,"felpa y algodon");
        peluchesEntity pel9 = new peluchesEntity("Totoro","35cm","anime",65000,"felpa y algodon");
        peluchesEntity pel10 = new peluchesEntity("Miku","35cm","anime",45000,"felpa y algodon");


        PeluchesRepository.save(pel1);
        PeluchesRepository.save(pel2);
        PeluchesRepository.save(pel3);
        PeluchesRepository.save(pel4);
        PeluchesRepository.save(pel5);
        PeluchesRepository.save(pel6);
        PeluchesRepository.save(pel7);
        PeluchesRepository.save(pel8);
        PeluchesRepository.save(pel9);
        PeluchesRepository.save(pel10);

        personalizadosEntity per1 = new personalizadosEntity("Cuaderno","spiderman",25000);
        personalizadosEntity per2 = new personalizadosEntity("Crochet","rana",35000);
        personalizadosEntity per3 = new personalizadosEntity("Hama llavero","hongo",15000);
        personalizadosEntity per4 = new personalizadosEntity("Posillo","kuromi",25000);
        personalizadosEntity per5 = new personalizadosEntity("Poster","anime",3000);
        personalizadosEntity per6 = new personalizadosEntity("Mousepad","anime",25000);
        personalizadosEntity per7 = new personalizadosEntity("Hama Iman","ave",20000);
        personalizadosEntity per8 = new personalizadosEntity("Hama aretes","pokemon",20000);
        personalizadosEntity per9 = new personalizadosEntity("Pintura","sanrio",25000);
        personalizadosEntity per10 = new personalizadosEntity("Tula","spiderman",40000);

        PersonalizadosRepository.save(per1);
        PersonalizadosRepository.save(per2);
        PersonalizadosRepository.save(per3);
        PersonalizadosRepository.save(per4);
        PersonalizadosRepository.save(per5);
        PersonalizadosRepository.save(per6);
        PersonalizadosRepository.save(per7);
        PersonalizadosRepository.save(per8);
        PersonalizadosRepository.save(per9);
        PersonalizadosRepository.save(per10);


        ropaEntity ropa1 = new ropaEntity("blusa","Blusa gatos",40000,"S");
        ropaEntity ropa2 = new ropaEntity("falda","Falda plisada",40000,"m");
        ropaEntity ropa3 = new ropaEntity("vestido","Vestido flores",60000,"xl");
        ropaEntity ropa4 = new ropaEntity("boina","Boina negra",40000,"S");
        ropaEntity ropa5 = new ropaEntity("medias","Medias Kirby",40000,"S");
        ropaEntity ropa6 = new ropaEntity("camiseta","Camiseta estampada",40000,"S");
        ropaEntity ropa7 = new ropaEntity("cosplay","Personaje",100000,"S");
        ropaEntity ropa8 = new ropaEntity("chaqueta","Chaqueta dama",650000,"m");
        ropaEntity ropa9 = new ropaEntity("sudadera","Hoddie dino",50000,"S");
        ropaEntity ropa10 = new ropaEntity("pijama","Pijama sanrio",75000,"S");

        RopaRepository.save(ropa1);
        RopaRepository.save(ropa2);
        RopaRepository.save(ropa3);
        RopaRepository.save(ropa4);
        RopaRepository.save(ropa5);
        RopaRepository.save(ropa6);
        RopaRepository.save(ropa7);
        RopaRepository.save(ropa8);
        RopaRepository.save(ropa9);
        RopaRepository.save(ropa10);


    }

}
