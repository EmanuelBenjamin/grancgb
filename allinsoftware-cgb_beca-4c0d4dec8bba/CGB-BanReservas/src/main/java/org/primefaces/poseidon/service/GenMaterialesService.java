/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.primefaces.poseidon.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import org.primefaces.poseidon.domain.GenMateriales;

/**
 *
 * @author Asus
 */
@Named
@ApplicationScoped
public class GenMaterialesService {
    private final Client client;
    private final WebTarget webTarget;
    
public GenMaterialesService(){
    this.client = ClientBuilder.newClient();
    this.webTarget = client.target( "http://localhost:8080/CGB-BanReservas/gen_Material/");
}


public GenMateriales getById(Long id){
    Response response = webTarget.path("buscar/"+id)
            .request(MediaType.APPLICATION_JSON)
            .get();
    
    if (response.getStatus() == Response.Status.OK.getStatusCode()){
        return response.readEntity(GenMateriales.class);
    } else {
        throw new RuntimeException("Error al obtener Material");
    }           
}

public List<GenMateriales>getMateriales(){
    Response response = webTarget.path("buscar todo")
            .request(MediaType.APPLICATION_JSON)
            .get();
    
    if (response.getStatus()== Response.Status.OK.getStatusCode()){
        return response.readEntity(new GenericType<List<GenMateriales>>(){});    
    } else {
        throw new RuntimeException("Error al obtener Materiales");        
    }
}
public void guardar(GenMateriales materiales){
    Response response;
    if (materiales.getIdMateriales()== null){
        Response response = webTarget.path("guardar")
    }
}

    
    


   
}
    

