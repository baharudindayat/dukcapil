package com.dukcapil.dukcapil.service;

import com.dukcapil.dukcapil.dto.KtpDto;

public interface KtpService {

    KtpDto createKtp(KtpDto ktpDto);

    Object getKtpById(String id);


}
