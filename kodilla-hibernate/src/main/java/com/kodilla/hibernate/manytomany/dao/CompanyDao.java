package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> retrieveCompaniesByFragmentOfTheName(@Param("FRAGMENT_OF_THE_NAME") String fragmentOfTheName);
    
    @Query
    List<Company> retrieveCompaniesByAnyFragmentOfTheName(@Param("ARG") String arg);
}
