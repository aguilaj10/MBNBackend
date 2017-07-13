/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author annelkaren
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @OneToMany(mappedBy = "usuarioId")
    private Collection<AlmacenUrls> almacenUrlsCollection;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUsuario")
    @SequenceGenerator(allocationSize = 1, sequenceName = "usuarios_id_seq", name = "seqUsuario")
    @Column(name = "usuario_id")
    private Integer usuarioId;
    @Basic(optional = false)
    @Column(name = "contrasena")
    private String contrasena;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "estado")
    private String estado;
    @Column(name = "usuario")
    private String usuario;
    @OneToMany(mappedBy = "usuarioId")
    private Collection<Reserva> reservasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioId")
    private Collection<Automovil> automovilesCollection;

    public Usuario() {
    }

    public Usuario(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Usuario(Integer usuarioId, String contrasena) {
        this.usuarioId = usuarioId;
        this.contrasena = contrasena;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient @JsonIgnore
    public Collection<Reserva> getReservasCollection() {
        return reservasCollection;
    }

    public void setReservasCollection(Collection<Reserva> reservasCollection) {
        this.reservasCollection = reservasCollection;
    }

    @XmlTransient @JsonIgnore
    public Collection<Automovil> getAutomovilesCollection() {
        return automovilesCollection;
    }

    public void setAutomovilesCollection(Collection<Automovil> automovilesCollection) {
        this.automovilesCollection = automovilesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioId != null ? usuarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuarioId == null && other.usuarioId != null) || (this.usuarioId != null && !this.usuarioId.equals(other.usuarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mbn.movil.model.entities.Usuarios[ usuarioId=" + usuarioId + " ]";
    }

     @XmlTransient @JsonIgnore
    public Collection<AlmacenUrls> getAlmacenUrlsCollection() {
        return almacenUrlsCollection;
    }

    public void setAlmacenUrlsCollection(Collection<AlmacenUrls> almacenUrlsCollection) {
        this.almacenUrlsCollection = almacenUrlsCollection;
    }
}
