package com.cursoBuscador.curso.repositories;

import com.cursoBuscador.curso.entities.WebPage;

import java.util.List;

public interface SearchRepository {


    List<WebPage> search(String textSearch);
}
