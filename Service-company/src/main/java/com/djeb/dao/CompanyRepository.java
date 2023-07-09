package com.djeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.djeb.entities.Company;

// <Company, Long> : Company est le nom de l'entité, Long est le type de l'id
// @RepositoryRestResource : Spring Data Rest pour le web service
// @RepositoryRestResource : Il permet d'xposer le web service = Tout les méthodes de JpaRepository hérité par CompanyRepository sont accessible     
@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
