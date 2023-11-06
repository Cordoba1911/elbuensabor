package com.utn.jpa1.services;


import com.utn.jpa1.entities.TipoArticulo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TipoArticuloService extends BaseService<TipoArticulo,Long> {
    List<TipoArticulo> search(String filtro) throws Exception;
    Page<TipoArticulo> search(String filtro, Pageable pageable) throws Exception;
}
