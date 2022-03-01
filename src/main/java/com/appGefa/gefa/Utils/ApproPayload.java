package com.appGefa.gefa.Utils;

import lombok.Data;

import java.util.Date;

@Data
public class ApproPayload {
    private Long numCommande;
    private String designation;
    private Date dateCommande;
    private int montant;
    private Long campagne;
    private Long fournisseur;
    private Long produit;
}
