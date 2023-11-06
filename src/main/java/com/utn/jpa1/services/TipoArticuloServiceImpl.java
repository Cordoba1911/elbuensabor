package com.utn.jpa1.services;

import com.utn.jpa1.entities.TipoArticulo;
import com.utn.jpa1.repositories.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class TipoArticuloServiceImpl extends BaseServiceImpl<TipoArticulo,Long> implements TipoArticuloService {
    public TipoArticuloServiceImpl(BaseRepository<TipoArticulo, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<TipoArticulo> search(String filtro) throws Exception {
        return null;
    }

    @Override
    public Page<TipoArticulo> search(String filtro, Pageable pageable) throws Exception {
        return null;
    }
}
