/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author annelkaren
 */
@Entity
@Table(name = "habitaciones")
public class Habitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Id
    @Basic(optional = false)
    @Column(name = "habitacion_id")
    private Integer habitacionId;
    @Basic(optional = false)
    @Column(name = "capacidad")
    private int capacidad;
    @Column(name = "internet")
    private Boolean internet;
    @Column(name = "reuniones")
    private Boolean reuniones;
    @Column(name = "habitable")
    private Boolean habitable;
    @JoinColumn(name = "edificio_id", referencedColumnName = "edificio_id")
    @ManyToOne
    private Edificio edificioId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "habitacionId")
    private Collection<Reserva> reservasCollection;

    public Habitacion() {
    }

    public Habitacion(Integer habitacionId) {
        this.habitacionId = habitacionId;
    }

    public Habitacion(Integer habitacionId, String nombre, int capacidad) {
        this.habitacionId = habitacionId;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getHabitacionId() {
        return habitacionId;
    }

    public void setHabitacionId(Integer habitacionId) {
        this.habitacionId = habitacionId;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Boolean getInternet() {
        return internet;
    }

    public void setInternet(Boolean internet) {
        this.internet = internet;
    }

    public Boolean getReuniones() {
        return reuniones;
    }

    public void setReuniones(Boolean reuniones) {
        this.reuniones = reuniones;
    }

    public Boolean getHabitable() {
        return habitable;
    }

    public void setHabitable(Boolean habitable) {
        this.habitable = habitable;
    }

    public Edificio getEdificioId() {
        return edificioId;
    }

    public void setEdificioId(Edificio edificioId) {
        this.edificioId = edificioId;
    }
    
    @XmlTransient @JsonIgnore
    public Collection<Reserva> getReservasCollection() {
        return reservasCollection;
    }

    public void setReservasCollection(Collection<Reserva> reservasCollection) {
        this.reservasCollection = reservasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (habitacionId != null ? habitacionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitacion)) {
            return false;
        }
        Habitacion other = (Habitacion) object;
        if ((this.habitacionId == null && other.habitacionId != null) || (this.habitacionId != null && !this.habitacionId.equals(other.habitacionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.movil.model.entities.Habitaciones[ habitacionId=" + habitacionId + " ]";
    }
    
}
