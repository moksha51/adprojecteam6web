package iss.team6.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iss.team6.web.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
    User findByName(String name); 
    
}
