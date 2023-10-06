package com.utn.jpa1.services;

import com.utn.jpa1.entities.ClienteEntity;
import com.utn.jpa1.repositories.BaseRepository;
import com.utn.jpa1.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImpl extends BaseServiceImpl<ClienteEntity, Long> implements ClienteService {

    @Autowired
    private final ClienteRepository clienteRepository;
    public ClienteServiceImpl(BaseRepository<ClienteEntity, Long> baseRepository, ClienteRepository clienteRepository) {
        super(baseRepository);
        this.clienteRepository = clienteRepository;
    }
}
