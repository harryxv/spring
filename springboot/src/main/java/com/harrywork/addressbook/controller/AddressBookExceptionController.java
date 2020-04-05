package com.harrywork.addressbook.controller;

import com.harrywork.addressbook.exception.ContactNotFoundException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Log4j2
@ControllerAdvice
public class AddressBookExceptionController {
    public ResponseEntity handleContactNotFoundException(ContactNotFoundException ex) {
        log.error(ex.getMessage());
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
