import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {

        String msg = "You have entered valid ID";
        String msgErro = "You have entered invalid ID";
        return id > 0 && id <100? msg:msgErro;
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {

        String msg = "You have entered valid USERNAME";
        String msgErro = "You have entered invalid USERNAME";
        int len = userName.length();
        return len > 0 && len < 15? msg: msgErro;
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {
        String msg = "You have entered valid CPF";
        String msgErro = "You have entered invalid CPF";

        return isCPF(cpf)? msg: msgErro;

    }

    public boolean isCPF(String cpf) {
        int len = cpf.length();
        return len > 3 && len < 15;
    }
}