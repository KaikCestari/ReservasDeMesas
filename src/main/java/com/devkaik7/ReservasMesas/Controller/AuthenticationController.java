package com.devkaik7.ReservasMesas.Controller;

import com.devkaik7.ReservasMesas.Dtos.AuthenticationDto;
import com.devkaik7.ReservasMesas.Dtos.RegisterDto;
import com.devkaik7.ReservasMesas.Entity.Usuarios;
import com.devkaik7.ReservasMesas.Repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {

    @Autowired
    public AuthenticationManager authenticationManager;
    @Autowired
    private UsuarioRepository repository;



@PostMapping("/admin")
    public ResponseEntity admin(@RequestBody @Valid AuthenticationDto dto ){
var userName = new UsernamePasswordAuthenticationToken(dto.email(),dto.senha());
var auth = authenticationManager.authenticate(userName); // autentication
return ResponseEntity.ok().build();
    }
    @PostMapping("/register")
public ResponseEntity register(@RequestBody @Valid RegisterDto data){
if(this.repository.findByLogin(data.login())!= null)return ResponseEntity.badRequest().build();
String password = new BCryptPasswordEncoder().encode(data.senha());
        Usuarios usuarios = new Usuarios(data.login(), data.senha(), data.role());
 this.repository.save(usuarios);
 return ResponseEntity.ok().build();
    }

}
