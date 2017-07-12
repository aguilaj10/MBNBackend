/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author annelkaren
 */
@Entity
@Table(name = "almacen_urls")
@NamedQueries({
    @NamedQuery(name = "AlmacenUrls.findAll", query = "SELECT a FROM AlmacenUrls a")})
public class AlmacenUrls implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "almacen_id")
    private Integer almacenId;
    @Column(name = "cadena")
    private String cadena;
    @Column(name = "fecha_expiracion")
    @Temporal(TemporalType.DATE)
    private Date fechaExpiracion;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuario usuarioId;

    public AlmacenUrls() {
    }

    public AlmacenUrls(Integer almacenId) {
        this.almacenId = almacenId;
    }

    public Integer getAlmacenId() {
        return almacenId;
    }

    public void setAlmacenId(Integer almacenId) {
        this.almacenId = almacenId;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
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
        hash += (almacenId != null ? almacenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlmacenUrls)) {
            return false;
        }
        AlmacenUrls other = (AlmacenUrls) object;
        if ((this.almacenId == null && other.almacenId != null) || (this.almacenId != null && !this.almacenId.equals(other.almacenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.model.entities.AlmacenUrls[ almacenId=" + almacenId + " ]";
    }
    
}
