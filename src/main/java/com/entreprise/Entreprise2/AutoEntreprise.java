package com.entreprise.Entreprise2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe des AutoEntreprise
 */
@Data
public class AutoEntreprise extends Entreprise{

    public AutoEntreprise(int chiffreAffaires, String siret, String denomination) {
        super(chiffreAffaires, siret, denomination);
    }

    public double calculerImpot(){
        return chiffreAffaires*0.25;
    }

}