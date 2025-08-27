package com.devkaik7.ReservasMesas.Infra;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class ExceptionMesa extends ResponseEntityExceptionHandler {


    @ExceptionHandler(MesasException.class)
    public ResponseEntity<RestErrorMensagem> mesasCapacidade(MesasException exception){
        RestErrorMensagem resposta = new RestErrorMensagem(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resposta);
    }


}
