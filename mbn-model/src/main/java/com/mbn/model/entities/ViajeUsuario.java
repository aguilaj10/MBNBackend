/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author MBN USER
 */
@Entity
@Table(name = "viajes_usuarios")
public class ViajeUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "viajes_usuarios_id")
    private Integer viajesUsuariosId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuarioId;
    @JoinColumn(name = "viaje_id", referencedColumnName = "viaje_id")
    @ManyToOne(optional = false)
    private Viaje viajeId;

    public ViajeUsuario() {
    }

    public ViajeUsuario(Integer viajesUsuariosId) {
        this.viajesUsuariosId = viajesUsuariosId;
    }

    public Integer getViajesUsuariosId() {
        return viajesUsuariosId;
    }

    public void setViajesUsuariosId(Integer viajesUsuariosId) {
        this.viajesUsuariosId = viajesUsuariosId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Viaje getViajeId() {
        return viajeId;
    }

    public void setViajeId(Viaje viajeId) {
        this.viajeId = viajeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (viajesUsuariosId != null ? viajesUsuariosId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ViajeUsuario)) {
            return false;
        }
        ViajeUsuario other = (ViajeUsuario) object;
        if ((this.viajesUsuariosId == null && other.viajesUsuariosId != null) || (this.viajesUsuariosId != null && !this.viajesUsuariosId.equals(other.viajesUsuariosId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.model.entities.ViajesUsuarios[ viajesUsuariosId=" + viajesUsuariosId + " ]";
    }
    
}
