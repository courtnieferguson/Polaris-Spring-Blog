import org.springframework.stereotype.Controller;
import org.springframework.web.bing.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }
}
