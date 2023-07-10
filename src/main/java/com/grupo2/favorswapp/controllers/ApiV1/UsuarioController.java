package com.grupo2.favorswapp.controllers.ApiV1;

import com.grupo2.favorswapp.models.Favor;
import com.grupo2.favorswapp.models.Usuario;
import com.grupo2.favorswapp.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @GetMapping("/usuarios")
    public List<Usuario> obtenerTodos(){
        System.out.println("metodo get");
        return usuarioService.obtenerTodosUsuarios();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario obtenerProvincia(@PathVariable int id){
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @PostMapping("/usuarios")
    public void guardarFavor(@RequestBody Usuario usuario){
        System.out.println(usuario);
    }

}
