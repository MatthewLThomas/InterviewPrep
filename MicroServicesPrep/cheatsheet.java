//start.spring.io
//spring web
//spring data jpa
//lombok
//Eureka client / server

//configure server port
//app.prop
//  server.port = 808X

//Add to all models
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private field;

}

//swagger ui

//main
private ApiInfo apiDetails(){
		return new ApiInfo(
				"NAME",
				"DESCRIPTION",
				"0.1",
				"All Rights Reserved",
				new springfox.documentation.service.Contact(
						"INTERVIEW",
						"revature.com",
						"matthew.thomas@revature.net"),
				"API Licence",
				"",
				Collections.emptyList()
		);
	}

	@Bean
	public Docket swaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.regex("^/(?!error)\\S+"))
				.build()
				.apiInfo(apiDetails());
	}

<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-boot-starter</artifactId>
			<version>3.0.0</version>
</dependency>


// Eureka Server
// use 1.8
// app.props
server.port = 8081
eureka.client.register-with-eureka=false   
eureka.client.fetch-registry=false

