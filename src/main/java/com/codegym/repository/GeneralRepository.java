package com.codegym.repository;

import java.util.List;

public interface GeneralRepository<E> {
    List<E> findAll();
    E findById(Long id);
    void remove(Long id);
    void save(E e);
}
