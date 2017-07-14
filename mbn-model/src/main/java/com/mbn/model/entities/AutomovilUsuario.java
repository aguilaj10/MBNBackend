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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author MBN USER
 */
@Entity
@Table(name = "automoviles_usuarios")
public class AutomovilUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "automoviles_usuarios_id")
    private Integer automovilesUsuariosId;
    @JoinColumn(name = "automovil_id", referencedColumnName = "automovil_id")
    @ManyToOne(optional = false)
    private Automovil automovilId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuarioId;

    public AutomovilUsuario() {
    }

    public AutomovilUsuario(Integer automovilesUsuariosId) {
        this.automovilesUsuariosId = automovilesUsuariosId;
    }

    public Integer getAutomovilesUsuariosId() {
        return automovilesUsuariosId;
    }

    public void setAutomovilesUsuariosId(Integer automovilesUsuariosId) {
        this.automovilesUsuariosId = automovilesUsuariosId;
    }

    public Automovil getAutomovilId() {
        return automovilId;
    }

    public void setAutomovilId(Automovil automovilId) {
        this.automovilId = automovilId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (automovilesUsuariosId != null ? automovilesUsuariosId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AutomovilUsuario)) {
            return false;
        }
        AutomovilUsuario other = (AutomovilUsuario) object;
        if ((this.automovilesUsuariosId == null && other.automovilesUsuariosId != null) || (this.automovilesUsuariosId != null && !this.automovilesUsuariosId.equals(other.automovilesUsuariosId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.model.entities.AutomovilesUsuarios[ automovilesUsuariosId=" + automovilesUsuariosId + " ]";
    }
    
}
