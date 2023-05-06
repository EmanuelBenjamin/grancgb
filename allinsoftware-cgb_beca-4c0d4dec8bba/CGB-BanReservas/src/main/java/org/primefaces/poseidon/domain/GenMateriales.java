/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.primefaces.poseidon.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Asus
 */
public class GenMateriales implements Serializable {

    private Long idMat;
    private String DescripcionMat;
    private String EliminadoMat;
    private String UsuarioMat;
    private Date FechaMat;
    private String IpMat;

    public Long getIdMat() {
        return idMat;
    }

    public void setIdMat(Long idMat) {
        this.idMat = idMat;
    }

    public String getDescripcionMat() {
        return DescripcionMat;
    }

    public void setDescripcionMat(String DescripcionMat) {
        this.DescripcionMat = DescripcionMat;
    }

    public String getEliminadoMat() {
        return EliminadoMat;
    }

    public void setEliminadoMat(String EliminadoMat) {
        this.EliminadoMat = EliminadoMat;
    }

    public String getUsuarioMat() {
        return UsuarioMat;
    }

    public void setUsuarioMat(String UsuarioMat) {
        this.UsuarioMat = UsuarioMat;
    }

    public Date getFechaMat() {
        return FechaMat;
    }

    public void setFechaMat(Date FechaMat) {
        this.FechaMat = FechaMat;
    }

    public String getIpMat() {
        return IpMat;
    }

    public void setIpMat(String IpMat) {
        this.IpMat = IpMat;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.idMat);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GenMateriales other = (GenMateriales) obj;
        return Objects.equals(this.idMat, other.idMat);
    }

    @Override
    public String toString() {
        return "GenMateriales{" + "idMat=" + idMat + ", DescripcionMat=" + DescripcionMat + ", EliminadoMat=" + EliminadoMat + ", UsuarioMat=" + UsuarioMat + ", FechaMat=" + FechaMat + ", IpMat=" + IpMat + '}';
    }
    
}
