package com.appGefa.gefa.Utils;

import lombok.Data;

import java.util.Date;

@Data
public class DepensePayload {
    private Long numDepense;
    private String designation;
    private Date dateDepense;
    private int montantDepense;
    private Long idProduit;
}
