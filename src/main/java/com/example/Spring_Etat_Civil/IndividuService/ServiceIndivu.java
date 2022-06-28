package com.example.Spring_Etat_Civil.IndividuService;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Spring_Etat_Civil.IndividuPackage.Individu;
import com.example.Spring_Etat_Civil.IndividuRepository.IndividuRepository;

@Service
public class ServiceIndivu {

    @Autowired
    private IndividuRepository individuRepository;



    public Individu ajouterIndividu(Individu individu){
        return individuRepository.save(individu);
    }
 
    public List<Individu>  trouverIndividu(){
        return  individuRepository.findAll();
        
    } 

    // Trouver le premier element par id
    public Individu findById(Long id){
        Individu ind = individuRepository.findById(id).get();
        if(ind==null){
            throw new IllegalStateException("on n aps encore enregistrer cet id");
        }
        else{
            return ind;

        }
        


    }
    // public Individu deleteById(@PathVariable Long id){
    //     Individu sup = individuRepository.deleteById();
    //     return sup;
    // }

    public void delete(Individu individu){
        individuRepository.deleteAll();
    }
    public Individu modifierLeNom(Long id,String a){
        Individu individu = individuRepository.findById(id).get();
        individu.setNom_individu(a);
        return individuRepository.save(individu);

    }
    public Individu modifierLePrenom(Long id,String b){
        Individu individu = individuRepository.findById(id).get();
        individu.setPrenom_individu(b);
        return individuRepository.save(individu);

    }
    public Individu modifierEtatCivil(Long id,String c){
        Individu individu = individuRepository.findById(id).get();
        individu.setEtat_civil(c);
        return individuRepository.save(individu);
    }
 

}
    
    

    

