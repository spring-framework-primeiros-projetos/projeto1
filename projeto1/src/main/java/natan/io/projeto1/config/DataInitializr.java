package natan.io.projeto1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import natan.io.projeto1.entity.User;
import natan.io.projeto1.repository.Userrepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	Userrepository  userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("!!!!!!Entrou aqui!!!!!!!");
		User user = new User();
		user.setEmail("alvaropereira15@gmail.com");
		user.setName("Alvaro Pereira do Nascimento");
		User alvaro = new User();
		alvaro.setEmail("alvaro.nascimentoapn@gmail.com");
		alvaro.setName("Alvaro Pereira do Nascimento");
		userRepository.save(user);
		userRepository.save(alvaro);
		
	}
}
