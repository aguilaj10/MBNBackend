/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author annelkaren
 */
@Entity
@Table(name = "viajes")
public class Viaje implements Serializable {

    @Basic(optional = false)
    @Column(name = "lugares_disponibles")
    private int lugaresDisponibles;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "viajeId")
    private Collection<ViajeUsuario> viajesUsuariosCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "viaje_id")
    private Integer viajeId;
    @Basic(optional = false)
    @Column(name = "fecha_regreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegreso;
    @Basic(optional = false)
    @Column(name = "fecha_salida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Basic(optional = false)
    @Column(name = "origen")
    private String origen;
    @Basic(optional = false)
    @Column(name = "destino")
    private String destino;
    @JoinColumn(name = "automovil_id", referencedColumnName = "automovil_id")
    @ManyToOne(optional = false)
    private Automovil automovilId;

    public Viaje() {
    }

    public Viaje(Integer viajeId) {
        this.viajeId = viajeId;
    }

    public Viaje(Integer viajeId, Date fechaRegreso, Date fechaSalida, String origen, String destino) {
        this.viajeId = viajeId;
        this.fechaRegreso = fechaRegreso;
        this.fechaSalida = fechaSalida;
        this.origen = origen;
        this.destino = destino;
    }

    public Integer getViajeId() {
        return viajeId;
    }

    public void setViajeId(Integer viajeId) {
        this.viajeId = viajeId;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Automovil getAutomovilId() {
        return automovilId;
    }

    public void setAutomovilId(Automovil automovilId) {
        this.automovilId = automovilId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (viajeId != null ? viajeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Viaje)) {
            return false;
        }
        Viaje other = (Viaje) object;
        if ((this.viajeId == null && other.viajeId != null) || (this.viajeId != null && !this.viajeId.equals(other.viajeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.movil.model.entities.Viajes[ viajeId=" + viajeId + " ]";
    }

    public int getLugaresDisponibles() {
        return lugaresDisponibles;
    }

    public void setLugaresDisponibles(int lugaresDisponibles) {
        this.lugaresDisponibles = lugaresDisponibles;
    }

    @XmlTransient @JsonIgnore
    public Collection<ViajeUsuario> getViajesUsuariosCollection() {
        return viajesUsuariosCollection;
    }

    public void setViajesUsuariosCollection(Collection<ViajeUsuario> viajesUsuariosCollection) {
        this.viajesUsuariosCollection = viajesUsuariosCollection;
    }
    
}
