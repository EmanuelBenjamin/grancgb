/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package org.primefaces.poseidon.view;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.event.ToggleEvent;
import org.primefaces.poseidon.domain.GenMateriales;
import org.primefaces.poseidon.service.GenMaterialesService;

/**
 *
 * @author Asus
 */
@Named(value = "GenMaterialesView")
@RequestScoped
public class GenMaterialesView implements Serializable {

    private List<GenMateriales> Materiales;
    private List<GenMateriales> selectedMateriales;
    
    private GenMateriales selectedMaterial;
    
    @Inject
    private GenMaterialesService materialesService;

    @PostConstruct
    public void init() {
        List<GenMateriales> materiales = materialesService.getMateriales();
        ArrayList<Object> selectedMaterialesList = new ArrayList<>();
    }
    public List<GenMateriales> getMateriales() {
        return Materiales;
    }
    public void setMateriales(List<GenMateriales> materiales) {
        this.Materiales= materiales;
    }
    
    public GenMateriales getSelectedMateriales(){
        return selectedMaterial;
    }
    public void SelectedMateriales(GenMateriales selectedMateriales){
        this.selectedMaterial = selectedMateriales;
    }
    public String guardar(){
        materialesService.guardar(selectedMaterial);
        return "crud";
    }
    public List<GenMateriales> getSelectedMaterialesList() {
        List<GenMateriales> name = (List<GenMateriales>) selectedMaterial;
        return null;
    }
    public void SetSelectedMateriales (List<GenMateriales> selectedMateriales){
        this.selectedMaterial = (GenMateriales) selectedMateriales;
    }
    public void onRowToggle(ToggleEvent event){
    }
}
    