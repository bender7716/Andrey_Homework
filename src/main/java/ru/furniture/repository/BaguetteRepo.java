package ru.furniture.repository;

import ru.furniture.entity.Baguette;

import java.util.List;

public interface BaguetteRepo {
    void create (Baguette baguette, Long id);
    Baguette update (Baguette baguette);
    void delete (Long id);
    List<Baguette> getAll();
}
