/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author annelkaren
 */
@Entity
@Table(name = "usuarios")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
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
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @ManyToMany(mappedBy = "usuariosCollection")
    private Collection<Automovil> automovilesCollection;
    @OneToMany(mappedBy = "usuarioId")
    private Collection<Reserva> reservasCollection;

    public Usuario() {
    }

    public Usuario(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Usuario(Integer usuarioId, String contrasena, String usuario) {
        this.usuarioId = usuarioId;
        this.contrasena = contrasena;
        this.usuario = usuario;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    @JsonIgnore @XmlTransient
    public Collection<Automovil> getAutomovilesCollection() {
        return automovilesCollection;
    }

    public void setAutomovilesCollection(Collection<Automovil> automovilesCollection) {
        this.automovilesCollection = automovilesCollection;
    }
    
    @JsonIgnore @XmlTransient
    public Collection<Reserva> getReservasCollection() {
        return reservasCollection;
    }

    public void setReservasCollection(Collection<Reserva> reservasCollection) {
        this.reservasCollection = reservasCollection;
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
        return "com.mbn.model.entities.Usuarios[ usuarioId=" + usuarioId + " ]";
    }
    
}
