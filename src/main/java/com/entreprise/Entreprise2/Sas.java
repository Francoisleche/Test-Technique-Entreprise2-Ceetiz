package com.entreprise.Entreprise2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe des SAS
 */
@Data
public class Sas extends Entreprise {

    private String adresse;

    public Sas(int chiffreAffaires, String siret, String denomination, String adresse) {
        super(chiffreAffaires, siret, denomination);
        this.adresse = adresse;
    }

    public double calculerImpot(){
        return chiffreAffaires*0.33;
    }
}