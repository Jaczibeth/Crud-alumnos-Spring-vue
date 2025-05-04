package com.Jaczibeth.alumnos.model;

import jakarta.persistence.Entity;

@Entity
public class Alumno {

private Long id;
private String nombre;
private String apellido;
private String telefono;
private String email;
private String carrera;
private String imagenURL;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
private String numeroControl;
public String getNumeroControl() {
    return numeroControl;
}
public void setNumeroControl(String numeroControl) {
    this.numeroControl = numeroControl;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public String getTelefono() {
    return telefono;
}
public void setTelefono(String telefono) {
    this.telefono = telefono;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getCarrera() {
    return carrera;
}
public void setCarrera(String carrera) {
    this.carrera = carrera;
}
public String getImagenURL() {
    return imagenURL;
}
public void setImagenURL(String imagenURL) {
    this.imagenURL = imagenURL;
}
}

