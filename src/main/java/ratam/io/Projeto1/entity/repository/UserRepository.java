/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratam.io.Projeto1.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ratam.io.Projeto1.entity.User;

/**
 *
 * @author Alvaro
 */
public interface UserRepository  extends JpaRepository<User,Long>{
    
    User findByName(String name);
    
    @Query("select u from User u where u.name  like %?1%")
    User findByQualquercoisa(String name); 
    @Query("select u from User u where u.email  like %?1%")
    User findNameByEmail(String email);
    @Query("select u from User u  where UPPER(u.email) = UPPER(?1)")
    User findByEmailIgnoreCase(String email);
}
