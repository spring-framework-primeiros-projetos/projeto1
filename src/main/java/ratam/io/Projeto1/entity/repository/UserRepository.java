/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratam.io.Projeto1.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ratam.io.Projeto1.entity.User;

/**
 *
 * @author Alvaro
 */
public interface UserRepository  extends JpaRepository<User,Long>{
    
}
