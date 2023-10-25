package com.utn.jpa1.services;

import com.utn.jpa1.entities.Rubro;
import com.utn.jpa1.repositories.BaseRepository;
import com.utn.jpa1.repositories.RubroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroServiceImpl extends BaseServiceImpl<Rubro, Long> implements RubroService {
    @Autowired
    private final RubroRepositorio rubroRepositorio;

    public RubroServiceImpl(BaseRepository<Rubro, Long> baseRepository, RubroRepositorio rubroRepositorio){
        super(baseRepository);
        this.rubroRepositorio = rubroRepositorio;
    }
}
