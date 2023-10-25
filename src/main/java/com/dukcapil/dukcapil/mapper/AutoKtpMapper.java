package com.dukcapil.dukcapil.mapper;

import com.dukcapil.dukcapil.dto.DigiBankGetDto;
import com.dukcapil.dukcapil.dto.KtpDto;
import com.dukcapil.dukcapil.model.Ktp;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoKtpMapper {
    AutoKtpMapper MAPPER = Mappers.getMapper(AutoKtpMapper.class);

    KtpDto mapToKtpDto(Ktp ktp);

    Ktp mapToKtp(KtpDto ktpDto);

    DigiBankGetDto mapToDigibankDto(Ktp ktp);

    Ktp mapToDigibank(DigiBankGetDto DigibankDto);
}
