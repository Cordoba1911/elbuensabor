package com.utn.jpa1.services;

import com.utn.jpa1.entities.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends BaseEntity, ID extends Serializable> {
    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public Page<E> findAll(Pageable pageable) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
    List<E> search(String string) throws Exception;

    Page<E> search(String string, Pageable pageable) throws Exception;
}
