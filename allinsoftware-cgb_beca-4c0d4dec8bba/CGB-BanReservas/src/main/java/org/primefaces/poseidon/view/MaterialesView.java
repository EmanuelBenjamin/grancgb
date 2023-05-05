/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package org.primefaces.poseidon.view;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;
import org.primefaces.poseidon.domain.Materiales;
import org.primefaces.poseidon.service.MaterialesService;

/**
 *
 * @author Asus
 */
@Named(value = "materialesView")
@ViewScoped
public class MaterialesView implements Serializable {

    private List<Materiales> listaMateriales;
    private Materiales materialSeleccionado;

    @Inject
    private MaterialesService materialesService;

    @PostConstruct
    public void init() {
        listaMateriales = materialesService.obtenerTodos();
    }

    public void guardarMaterial() {
        if (materialSeleccionado.getId() == null) {
            materialesService.crear(materialSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Material creado correctamente"));
        } else {
            materialesService.actualizar(materialSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Material actualizado correctamente"));
        }
        RequestContext.getCurrentInstance().execute("PF('dlgMaterial').hide()");
        listaMateriales = materialesService.obtenerTodos();
    }

    public void eliminarMaterial() {
        materialesService.eliminar(materialSeleccionado.getId());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Material eliminado correctamente"));
        listaMateriales = materialesService.obtenerTodos();
    }

    public List<Materiales> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(List<Materiales> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    public Materiales getMaterialSeleccionado() {
        return materialSeleccionado;
    }

    public void setMaterialSeleccionado(Materiales materialSeleccionado) {
        this.materialSeleccionado = materialSeleccionado;
    }
    
}
