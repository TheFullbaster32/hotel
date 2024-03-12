package com.mycompany.hotel.objetos;

public class Cliente {

    /**
     * @return El id del cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente El valor de idCliente a dar
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return El nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Le da el valor de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Los apellidos de la persona
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos El apellidos se lo da a otra variable
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return Devuelve el DNI de la persona
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI El valor del DNI a dar
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return El numero de telefono
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * @param numeroTelefono El numero de telefono a dar
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    private int idCliente;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
