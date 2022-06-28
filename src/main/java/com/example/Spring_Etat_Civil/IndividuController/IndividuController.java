package com.example.Spring_Etat_Civil.IndividuController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Etat_Civil.IndividuPackage.Individu;
//import com.example.Spring_Etat_Civil.IndividuRepository.IndividuRepository;
import com.example.Spring_Etat_Civil.IndividuService.ServiceIndivu;

import java.util.List;

@RestController
public class IndividuController {

    @Autowired
    private ServiceIndivu serviceIndivu;

    // Inserer un individu
    @PostMapping("/Ajouter")
    public void ajouterIndividu(@RequestBody Individu individu){
        serviceIndivu.ajouterIndividu(individu);
    }

    //voir tous les individus
    @GetMapping("/Voirtous")
    public List<Individu> trouverIndividu(){
        return serviceIndivu.trouverIndividu();     

    //Touver un indvidu par Id
    }
    @GetMapping("/byId/{id}")
    public Individu trouverById(@PathVariable Long id){
        return serviceIndivu.findById(id);
    }
    // Supprimer tous les individus
    @DeleteMapping("/futa")    
    public void delete(Individu individu){
         serviceIndivu.delete(individu);
    }

    ///Modifier le nom d individu Individu
    
    @PutMapping("byId/{id}/nom/{nom_individu}")
    public void momo(@PathVariable Long id,@PathVariable("nom_individu") String nom_individu){
        serviceIndivu.modifierLeNom(id,nom_individu);
    }
    @PutMapping("byId/{id}/prenom/{prenom_individu}")
        public void prenom(@PathVariable Long id,@PathVariable("prenom_individu") String prenom_individu){
            serviceIndivu.modifierLePrenom(id,prenom_individu);
    }
    @PutMapping("byId/{id}/etat_civil/{etat_civil}")
        public void etat_civil(@PathVariable Long id,@PathVariable("etat_civil") String etat_civil){
        serviceIndivu.modifierEtatCivil(id,etat_civil);
    }
    }



