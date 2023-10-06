package com.utn.jpa1.services;

import com.utn.jpa1.entities.DomicilioEntity;
import com.utn.jpa1.repositories.BaseRepository;
import com.utn.jpa1.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<DomicilioEntity, Long> implements DomicilioService {
    @Autowired
    private final DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(BaseRepository<DomicilioEntity, Long> baseRepository, DomicilioRepository domicilioRepository) {
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }
}
