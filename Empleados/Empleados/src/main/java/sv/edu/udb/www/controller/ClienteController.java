package sv.edu.udb.www.controller;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class ClienteController implements Serializable {
    private static final long serialVersionUID = 1L;

    private Cliente nuevoCliente; // Cliente para ingresar nuevos clientes
    private List<Cliente> clientes; // Lista de clientes
    private Cliente clienteSeleccionado; // Cliente seleccionado para editar o eliminar

    // Constructor
    public ClienteController() {
        this.nuevoCliente = new Cliente(); // Inicializar el nuevo cliente
        this.clientes = new ArrayList<>(); // Inicializar la lista de clientes (puedes obtenerla de una base de datos)
        cargarClientes(); // Método para cargar la lista de clientes (simulado aquí, debes implementar la lógica real)
    }

    // Métodos para gestionar clientes
    public void guardarCliente() {
        this.clientes.add(this.nuevoCliente);
        this.nuevoCliente = new Cliente(); // Limpiar el formulario después de guardar
    }

    public void editarCliente(Cliente cliente) {
        this.clienteSeleccionado = cliente;
        // Aquí puedes implementar la lógica para editar el cliente seleccionado
    }

    public void eliminarCliente(Cliente cliente) {
        this.clientes.remove(cliente);
        // Aquí puedes implementar la lógica para eliminar el cliente seleccionado
    }

    private void cargarClientes() {
        // Aquí puedes implementar la lógica para cargar la lista de clientes desde una base de datos o cualquier otro origen
    }

    // Getters y setters
}


