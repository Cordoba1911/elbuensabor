package com.utn.jpa1.services;

import com.utn.jpa1.entities.Producto;
import com.utn.jpa1.entities.Rubro;
import com.utn.jpa1.repositories.BaseRepository;
import com.utn.jpa1.repositories.RubroRepositorio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class RubroServiceImpl extends BaseServiceImpl<Rubro,Long> implements RubroService {

    private final RubroRepositorio rubroRepositorio;

    public RubroServiceImpl(BaseRepository<Rubro, Long> baseRepository, RubroRepositorio rubroRepositorio) {
        super(baseRepository);
        this.rubroRepositorio=rubroRepositorio;
    }

    @Override
    public List<Rubro> search(String filtro) throws Exception {
        try{
            List<Rubro> rubros = rubroRepositorio.findByDenominacionContaining(filtro);
            return rubros;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public Page<Rubro> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Rubro> rubros = rubroRepositorio.findByDenominacionContaining(filtro, pageable);
            return rubros;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
