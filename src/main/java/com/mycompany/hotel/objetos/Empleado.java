package com.mycompany.hotel.objetos;

public class Empleado {

    /**
     * @return Devuelve el id del empleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado le damos el valor de idEmpleado al setter
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return Devuelve el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre  le damos el valor de nombre al setter
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Devuelve el apellido del empleado
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos  le damos el valor de apellidos al setter
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return Devuelve el DNI del empleado
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI  le damos el valor de DNI al setter
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return Devuelve el numero de telefono del empleado
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * @param numeroTelefono  le damos el valor de numeroTelefono al setter
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

    public Empleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
