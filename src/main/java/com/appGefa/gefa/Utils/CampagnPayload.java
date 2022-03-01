package com.appGefa.gefa.Utils;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class CampagnPayload {
    private Long numCampagne;
    private String nomCampagne;
    private Date debutCampagne;
    private String responsable;
    private String objectif;
    private Long numActivite;
}
