package com.gincol.springboot.webflux.app.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.gincol.springboot.webflux.app.models.documents.Categoria;

public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String> {

}
