package com.appGefa.gefa.Utils;

import lombok.Data;

import java.util.Date;
@Data
public class VentePayload {
    private Long numVente;
    private Date dateVente;
    private int montant;
    private Long produitId;
    private int quantite;
    private int prixVente;
}
