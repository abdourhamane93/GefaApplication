package com.appGefa.gefa.api;

import com.appGefa.gefa.Utils.VentePayload;
import com.appGefa.gefa.domain.LigneVente;
import com.appGefa.gefa.domain.Produit;
import com.appGefa.gefa.domain.Vente;
import com.appGefa.gefa.service.LigneVenteService;
import com.appGefa.gefa.service.ProduitService;
import com.appGefa.gefa.service.VenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController @RequiredArgsConstructor
public class VenteRessource {
    private final VenteService venteService;
    private final LigneVenteService ligneVenteService;
    private final ProduitService produitService;

    @GetMapping("api/ventes")
    public List<LigneVente> getAllVentes(){
        return ligneVenteService.getLigneVentes();
    }

    @PostMapping("api/ventes/save")
    public void addVente(@RequestBody VentePayload ventePayload){
        Optional<Produit> produit = produitService.getProduitById(ventePayload.getProduitId());
        int montantVente = ventePayload.getQuantite() * ventePayload.getPrixVente();
        System.out.println(montantVente);
        Vente vente = new Vente(
                null,
                ventePayload.getDateVente(),
                montantVente
        );
        venteService.saveVente(vente);
        LigneVente lv = new LigneVente(null,ventePayload.getQuantite(),ventePayload.getPrixVente(),vente,produit.get());
        ligneVenteService.saveLigneVente(lv);
    }
}
