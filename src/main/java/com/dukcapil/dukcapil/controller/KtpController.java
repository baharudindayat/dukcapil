package com.dukcapil.dukcapil.controller;

import com.dukcapil.dukcapil.dto.DigiBankGetDto;
import com.dukcapil.dukcapil.dto.KtpDto;
import com.dukcapil.dukcapil.service.KtpService;
import com.dukcapil.dukcapil.utils.ResponseHandler;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/dukcapil")
public class KtpController {

    private KtpService ktpService;

    @PostMapping("/ktp/create")
    public ResponseEntity<Object> createKtp(@RequestBody KtpDto ktpDto) {
        KtpDto newKtp = ktpService.createKtp(ktpDto);
        return ResponseHandler.generateResponseCreate("KTP Berhasil Dibuat", HttpStatus.CREATED, newKtp);
    }

    @PostMapping("/ktp/validate")
    public ResponseEntity<Object> ValidateKtp(@RequestBody DigiBankGetDto digiBankGetDto){
        DigiBankGetDto newDigiBankGetDto = (DigiBankGetDto) ktpService.getKtpById(digiBankGetDto.getNik());
        return ResponseHandler.generateResponseCreate("KTP Valid", HttpStatus.OK, newDigiBankGetDto);
    }
}
