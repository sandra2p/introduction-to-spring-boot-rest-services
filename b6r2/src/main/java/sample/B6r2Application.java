package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class B6r2Application {
	
	@RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	public String home() {
	   return "Nothing here. Go to <a href='/sample'>/sample</a>";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(B6r2Application.class, args);
	}

}
