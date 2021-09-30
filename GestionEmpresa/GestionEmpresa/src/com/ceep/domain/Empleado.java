package com.ceep.domain;

public class Empleado extends Persona {

    int idEmpleado;
    double sueldo;
    private static int contadorEmpleado;

    /**
     *
     */
    public Empleado() {
//        super();
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(double sueldo, String nombre) {
        this();
        this.sueldo = sueldo;
        this.nombre = nombre;
    }
    public Empleado(double sueldo, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = +idEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        Empleado.contadorEmpleado = contadorEmpleado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "idEmpleado= " + idEmpleado + ",\nsueldo= " + sueldo + super.toString();
    }

}
