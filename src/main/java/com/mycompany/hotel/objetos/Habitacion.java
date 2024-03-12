package com.mycompany.hotel.objetos;

public class Habitacion {

    /**
     * @return Devuelve el id de la habitacion
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * @param idHabitacion le damos el valor de idHabitacion al setter
     */
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    /**
     * @return Devuelve el tipo de habitacion
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo le damos el valor de tipo al setter
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return Devuelve el numeroDeCamas de la habitacion
     */
    public int getNumeroCamas() {
        return numeroCamas;
    }

    /**
     * @param numeroCamas le damos el valor de tipo al setter
     */
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    /**
     * @return Devuelve el coste/dia de la habitacion
     */
    public double getCostePorDia() {
        return costePorDia;
    }

    /**
     * @param costePorDia le damos el valor de tipo al setter
     */
    public void setCostePorDia(double costePorDia) {
        this.costePorDia = costePorDia;
    }
    private int idHabitacion;
    private String tipo;
    private int numeroCamas;
    private double costePorDia;

    public Habitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
}
