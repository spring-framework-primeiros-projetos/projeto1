package ratam.io.Projeto1.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import ratam.io.Projeto1.entity.User;
import ratam.io.Projeto1.entity.repository.UserRepository;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    UserRepository userRepository;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("entrou aqui!!!!");
		User user = new User();
                user.setEmail("nataniel.paiva@gmail.com");
                user.setName("Nataniel");
                userRepository.save(user);
                
                        
	}

}
