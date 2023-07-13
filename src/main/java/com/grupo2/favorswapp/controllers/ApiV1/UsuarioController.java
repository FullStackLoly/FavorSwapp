package com.grupo2.favorswapp.controllers.ApiV1;

import com.grupo2.favorswapp.models.Direccion;
import com.grupo2.favorswapp.models.Usuario;
import com.grupo2.favorswapp.service.DireccionService;
import com.grupo2.favorswapp.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Restcontroller para controlar las acciones de usuarios.
 */
@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
    /**
     * Parámetro para inyectar UsuarioService
     */
    private final UsuarioService usuarioService;
    /**
     * Parámetro para inyectar DireccionService
     */
    private final DireccionService direccionService;

    /**
     * Controlador para inyectar UsuarioService y DireccionService
     * @param usuarioService es el servicio de usuarios
     * @param direccionService es el servicio de direcciones
     */
    public UsuarioController(UsuarioService usuarioService, DireccionService direccionService) {
        this.usuarioService = usuarioService;
        this.direccionService = direccionService;
    }

    /**
     * Se encarga de gestionar las peticiones get a /api/v1/usuarios
     * @return lista con todos los usuarios de la base de datos, o null si no hay.
     */
    @GetMapping("/usuarios")
    public List<Usuario> obtenerTodos(){
        System.out.println("metodo get");
        return usuarioService.obtenerTodosUsuarios();
    }

    /**
     * Se encarga de recibir petición get de un usuario por url amigable.
     * @param id la id del usuario a entregar
     * @return el usuario que tenga esa id, o null si no existe
     */
    @GetMapping("/usuarios/{id}")
    public Usuario UsuarioPorId(@PathVariable int id){
        return usuarioService.obtenerUsuarioPorId(id);
    }

    /**
     * Recibe un json por método post con un usuario, y lo inserta en la base de datos
     * @param usuario usuario a insertar
     * @return el usuario insertado, o null si no se ha podido insertar
     */
    @PostMapping("/usuarios")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        usuario.getDireccion().setId(0);    // Aseguramos que la id de dirección es 0 para crear nueva
        Direccion direccionRecibida = usuario.getDireccion();
        Direccion direccionAGuardar = direccionService.guardarDireccion(direccionRecibida); //Guardamos y obtenemos una nueva dirección
        usuario.setDireccion(direccionAGuardar);    // Añadimos la dirección creada al usuario
        return usuarioService.guardarUsuario(usuario); // Creamos el nuevo usuario con la nueva dirección.
    }

    /**
     * Obtiene un usuario a traves de su clave y email pasados por url amigable.
     * @param email el email del usuario a buscar
     * @param clave la clave del usuario a buscar
     * @return usuario que concuerde con email y clave, o null si no existe.
     */
    @GetMapping("/usuarios/{email}/{clave}")
    public Usuario obtenerUsuarioPorEmailClave(
            @PathVariable String email,
            @PathVariable String clave){
        return usuarioService.obtenerUsuarioPorEmailClave(email, clave);
    }
}
