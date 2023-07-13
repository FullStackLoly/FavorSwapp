package com.grupo2.favorswapp.controllers.ApiV1;

import com.grupo2.favorswapp.models.Direccion;
import com.grupo2.favorswapp.models.Usuario;
import com.grupo2.favorswapp.service.DireccionService;
import com.grupo2.favorswapp.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
    private final UsuarioService usuarioService;
    private final DireccionService direccionService;

    public UsuarioController(UsuarioService usuarioService, DireccionService direccionService) {
        this.usuarioService = usuarioService;
        this.direccionService = direccionService;
    }


    @GetMapping("/usuarios")
    public List<Usuario> obtenerTodos(){
        System.out.println("metodo get");
        return usuarioService.obtenerTodosUsuarios();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario UsuarioPorId(@PathVariable int id){
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @PostMapping("/usuarios")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        usuario.getDireccion().setId(0);    // Aseguramos que la id de dirección es 0 para crear nueva
        Direccion direccionRecibida = usuario.getDireccion();
        Direccion direccionAGuardar = direccionService.guardarDireccion(direccionRecibida); //Guardamos y obtenemos una nueva dirección
        usuario.setDireccion(direccionAGuardar);    // Añadimos la dirección creada al usuario
        return usuarioService.guardarUsuario(usuario); // Creamos el nuevo usuario con la nueva dirección.
    }

    @GetMapping("/usuarios/{email}/{clave}")
    public Usuario obtenerUsuarioPorEmailClave(
            @PathVariable String email,
            @PathVariable String clave){
        System.out.println("hola");
        System.out.println("email: "+email);
        System.out.println("clave: "+clave);
        return usuarioService.obtenerUsuarioPorEmailClave(email, clave);
    }
}
