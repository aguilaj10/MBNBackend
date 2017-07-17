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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author annelkaren
 */
@Entity
@Table(name = "reservas")
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reserva_id")
    private Integer reservaId;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "estado")
    /*Propiedades de fechas formateadas*/
    @Transient
    private String fechaInicioFormateada;
    @Transient
    private String fechaFinFormateada;
    private String estado;
    @JoinColumn(name = "habitacion_id", referencedColumnName = "habitacion_id")
    @ManyToOne(optional = false)
    private Habitacion habitacionId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuario usuarioId;

    public Reserva() {
    }

    public Reserva(Integer reservaId) {
        this.reservaId = reservaId;
    }

    public Reserva(Integer reservaId, Date fechaInicio, Date fechaFin) {
        this.reservaId = reservaId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getReservaId() {
        return reservaId;
    }

    public void setReservaId(Integer reservaId) {
        this.reservaId = reservaId;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Habitacion getHabitacionId() {
        return habitacionId;
    }

    public void setHabitacionId(Habitacion habitacionId) {
        this.habitacionId = habitacionId;
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
        hash += (reservaId != null ? reservaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.reservaId == null && other.reservaId != null) || (this.reservaId != null && !this.reservaId.equals(other.reservaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.movil.model.entities.Reservas[ reservaId=" + reservaId + " ]";
    }

    /**
     * @return the fechaInicioFormateada
     */
    public String getFechaInicioFormateada() {
        return fechaInicioFormateada;
    }

    /**
     * @param fechaInicioFormateada the fechaInicioFormateada to set
     */
    public void setFechaInicioFormateada(String fechaInicioFormateada) {
        this.fechaInicioFormateada = fechaInicioFormateada;
    }

    /**
     * @return the fechaFinFormateada
     */
    public String getFechaFinFormateada() {
        return fechaFinFormateada;
    }

    /**
     * @param fechaFinFormateada the fechaFinFormateada to set
     */
    public void setFechaFinFormateada(String fechaFinFormateada) {
        this.fechaFinFormateada = fechaFinFormateada;
    }

}
