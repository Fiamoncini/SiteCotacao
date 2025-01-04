package cotacaodolarsite.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String index(Model model){
		CotacaoDolar cotacaoDolar = new CotacaoDolar();
		String cotacao = cotacaoDolar.cotacaoDolar();
		model.addAttribute("cotacao", cotacao);

		return "index";
	}

}
