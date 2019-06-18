package ratam.io.Projeto1.config;
import java.util.List;
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
            List<User> users = userRepository.findAll();
            if (users.isEmpty()){
                System.out.println("Registrando no banco");
                criarUsuario("Nataniel","nataniel.paiva@gmail.com");
                criarUsuario("Alvaro Pereira do Nascimento","alvaropereira15@gmail.com");
                criarUsuario("Alvaro Pereira do Nascimento","alvaro.nascimentoapn@gmail.com");   
                criarUsuario("Alvaro Pereira do Nascimento","alvaropereira14@hotmail.com");
                System.out.println("Resgitrou tudo");
            }
            else System.out.println("Clientes registrados anteriormente");
        }
        public void criarUsuario( String nome, String email){
            User userk;
            userk = new User(nome, email);
            userRepository.save(userk);
        }

}
