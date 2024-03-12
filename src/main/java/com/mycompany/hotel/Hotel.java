package com.mycompany.hotel;

import com.mycompany.hotel.objetos.Cliente;
import com.mycompany.hotel.objetos.Empleado;
import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    private static Scanner sca = new Scanner(System.in);
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private static ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

    public static void main(String[] args) {
        int opcion = 10;

        do {
            mostrarMenu();
            opcion = sca.nextInt();
            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    darDeBajaCliente();
                    break;
                case 3:
                    registrarEmpleado();
                    break;
                case 4:
                    darDeBajaEmpleado();
                    break;
                case 5:
                    agregarHabitacion();
                    break;
                case 6:
                    eliminarHabitacion();
                    break;
                case 7:
                    mostrarClientes();
                    break;
                case 8:
                    mostrarEmpleados();
                    break;
                case 9:
                    mostrarHabitaciones();
                    break;
                case 10:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("La opción seleccionada no existe...");
            }
        } while (opcion != 10);
    }

    private static void mostrarMenu() {
        System.out.println("1. Registrar cliente.");
        System.out.println("2. Dar de baja a un cliente.");
        System.out.println("3. Registrar empleado.");
        System.out.println("4. Dar de baja a un empleado.");
        System.out.println("5. Agregar nueva habitación.");
        System.out.println("6. Eliminar una habitación.");
        System.out.println("7. Mostrar todos los clientes.");
        System.out.println("8. Mostrar todos los empleados.");
        System.out.println("9. Mostrar todas las habitaciones.");
        System.out.println("10. Salir del programa.");
        System.out.println("Introduce el número de la opcion deseadas: ");
    }

    private static void registrarCliente() {
        System.out.println("Introduzca el id del nuevo cliente: ");
        int idCliente = sca.nextInt();
        Cliente cliente = new Cliente(idCliente);
        sca.nextLine();
        System.out.println("Introduzca el nombre del nuevo cliente: ");
        String nombre = sca.nextLine();
        cliente.setNombre(nombre);
        System.out.println("Introduzca los apellidos del nuevo cliente: ");
        String apellidos = sca.nextLine();
        cliente.setApellidos(apellidos);
        System.out.println("Introduzca el DNI del nuevo cliente: ");
        cliente.setDNI(sca.nextLine());
        System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
        int numeroTelefono = sca.nextInt();
        cliente.setNumeroTelefono(numeroTelefono);
        clientes.add(cliente);
    }

    private static void darDeBajaCliente() {
        System.out.println("Introduzca el id del cliente a dar de baja: ");
        int idCliente = sca.nextInt();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para dar de baja...");
        } else {
            clientes.removeIf(cliente -> cliente.getIdCliente() == idCliente);
        }
    }

    private static void registrarEmpleado() {
        System.out.println("Introduzca el id del nuevo empleado: ");
        int idEmpleado = sca.nextInt();
        Empleado empleado = new Empleado(idEmpleado);
        sca.nextLine();
        System.out.println("Introduzca el nombre del nuevo empleado: ");
        String nombre = sca.nextLine();
        empleado.setNombre(nombre);
        System.out.println("Introduzca los apellidos del nuevo empleado: ");
        String apellidos = sca.nextLine();
        empleado.setApellidos(apellidos);
        System.out.println("Introduzca el DNI del nuevo empleado: ");
        String DNI = sca.nextLine();
        empleado.setDNI(DNI);
        System.out.println("Introduzca el número de teléfono del nuevo empleado: ");
        int numeroTelefono = sca.nextInt();
        empleado.setNumeroTelefono(numeroTelefono);
        empleados.add(empleado);
    }

    private static void darDeBajaEmpleado() {
        System.out.println("Introduzca el id del empleado a dar de baja: ");
        int idEmpleado = sca.nextInt();
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para dar de baja...");
        } else {
            empleados.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);
        }
    }

    private static void agregarHabitacion() {
        System.out.println("Introduzca el id de la nueva habitación: ");
        int idHabitacion = sca.nextInt();
        Habitacion habitacion = new Habitacion(idHabitacion);
        sca.nextLine();
        System.out.println("Introduzca el tipo de la nueva habitación: ");
        String tipo = sca.nextLine();
        habitacion.setTipo(tipo);
        System.out.println("Introduzca número de camas de la nueva habitación: ");
        int numeroCamas = sca.nextInt();
        habitacion.setNumeroCamas(numeroCamas);
        System.out.println("Introduzca el coste por día de la nueva habitación: ");
        double costePorDia = sca.nextDouble();
        habitacion.setCostePorDia(costePorDia);
        sca.nextLine();
        habitaciones.add(habitacion);
    }

    private static void eliminarHabitacion() {
        System.out.println("Introduzca el id de la habitación a eliminar: ");
        int idHabitacion = sca.nextInt();
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para borrar...");
        } else {
            habitaciones.removeIf(habitacion -> habitacion.getIdHabitacion() == idHabitacion);
        }
    }

    private static void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar...");
        } else {
            clientes.forEach(cliente -> {
                System.out.println("ID: " + cliente.getIdCliente());
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Apellidos: " + cliente.getApellidos());
                System.out.println("DNI: " + cliente.getDNI());
                System.out.println("Número de teléfono: " + cliente.getNumeroTelefono());
                System.out.println("");
            });
        }
    }

    private static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para mostrar...");
        } else {
            empleados.forEach(empleado -> {
                System.out.println("ID: " + empleado.getIdEmpleado());
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellidos: " + empleado.getApellidos());
                System.out.println("DNI: " + empleado.getDNI());
                System.out.println("Número de teléfono: " + empleado.getNumeroTelefono());
                System.out.println("");
            });
        }
    }

    private static void mostrarHabitaciones() {
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para mostrar...");
        } else {
            habitaciones.forEach(habitacion -> {
                System.out.println("ID: " + habitacion.getIdHabitacion());
                System.out.println("Tipo: " + habitacion.getTipo());
                System.out.println("Número de camas: " + habitacion.getNumeroCamas());
                System.out.println("Coste por día: " + habitacion.getCostePorDia());
                System.out.println("");
            });
        }
    }
}
