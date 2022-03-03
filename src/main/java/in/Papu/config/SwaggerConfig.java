package in.Papu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket apiDocGen() {
		return new Docket(DocumentationType.SWAGGER_2)
				  .select()
				  .apis(RequestHandlerSelectors.basePackage("in.Papu.rest"))
				  .paths(PathSelectors.any())
				  .build();
				  //this is the code that we are using for the documentation
		          //for our rest api.
		      //localhost:2525/swagger-ui.html
	    }

}
