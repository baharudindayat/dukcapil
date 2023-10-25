package com.dukcapil.dukcapil.service.impl;

import com.dukcapil.dukcapil.dto.KtpDto;
import com.dukcapil.dukcapil.exception.NikNotFoundException;
import com.dukcapil.dukcapil.mapper.AutoKtpMapper;
import com.dukcapil.dukcapil.model.Ktp;
import com.dukcapil.dukcapil.repository.KtpRepository;
import com.dukcapil.dukcapil.service.KtpService;
import com.dukcapil.dukcapil.utils.NikGenerator;
import lombok.AllArgsConstructor;
import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class KtpServiceImpl implements KtpService {

    private KtpRepository repository;
    private NikGenerator nikGenerator;

    @Override
    public KtpDto createKtp(KtpDto ktpDto) {

        Optional<Ktp> OptionalKtp = repository.findByNik(ktpDto.getNik());

        if (OptionalKtp.isPresent()) {
            throw new OpenApiResourceNotFoundException("NIK already exists");
        }

        String nikGenerator = this.nikGenerator.generateNik();
        ktpDto.setNik(nikGenerator);
        Ktp ktp = AutoKtpMapper.MAPPER.mapToKtp(ktpDto);
        Ktp savedKtp = repository.save(ktp);

        return AutoKtpMapper.MAPPER.mapToKtpDto(savedKtp);
    }

    @Override
    public Object getKtpById(String id) {
        Optional<Ktp> OptionalKtp = repository.findByNik(id);

        if (OptionalKtp.isPresent()) {
            Ktp ktp = OptionalKtp.get();
            return AutoKtpMapper.MAPPER.mapToDigibankDto(ktp);
        }else {
            throw new NikNotFoundException("NIK Tidak Ditemukan")  ;
        }
    }
}
