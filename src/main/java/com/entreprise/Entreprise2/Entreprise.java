package com.entreprise.Entreprise2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by meyna on 28/12/2019.
 * Classe abstraite Entreprise stockant les attributs communs à toutes les entreprises
 */
@Data
public abstract class Entreprise {

    protected int chiffreAffaires;
    protected String siret;
    protected String denomination;

    public Entreprise(int chiffreAffaires, String siret, String denomination) {
        this.chiffreAffaires = chiffreAffaires;
        this.siret = siret;
        this.denomination = denomination;
    }

    abstract double calculerImpot();

}
