package com.appGefa.gefa.Utils;

import lombok.Data;

import java.util.Date;

@Data
public class ActivitePayload {
    private Long numActivite;
    private String nomActivite;
    private Date dateDebutAct;
    private Date dateFinAct;
    private String productivite;
    private String descriptionAct;
    private Long numDomaine;
}
