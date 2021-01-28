//start.spring.io
//spring web
//lombok
//H2
//Spring Data JPA & Rest
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
@Builder
public class model {
	@Id
	@GenerationValue(strategy = GenerationType.IDENTITY)
	int id;

}

//swagger ui


		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-boot-starter</artifactId>
			<version>3.0.0</version>
		</dependency>




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

@EnableEurekaServer
// app.props
server.port = 8761
eureka.client.register-with-eureka=false   
eureka.client.fetch-registry=false

//Eureka Client
spring.application.name = "NAME"
server.port = 808X
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.datasource.url=jdbc:h2:file:/data/demo


//Consuming SpringData Rest

@Bean
public RestTemplate restTemplate() {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jackson2HalModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MappingJackson2HttpMessageConverter messageConverter =
                    new MappingJackson2HttpMessageConverter();
        messageConverter.setObjectMapper(objectMapper);
        messageConverter.setSupportedMediaTypes(Arrays.asList(MediaTypes.HAL_JSON, MediaType.APPLICATION_JSON_UTF8));
        return new RestTemplate(Arrays.asList(messageConverter));

}

ResponseEntity<PagedResources<Object>> resultResponse = restTemplate.exchange(uri, HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<PagedResources<Producto>>(){});

if(resultResponse.getStatusCode() == HttpStatus.OK){
    Collection<Object> results = resultResponse.getBody().getContent();
}

@EnableEurekaClient
public class app{
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}

//restTemplate

object = restTemplate.getForObject("http://micro-service-name/object-path/", Object.class);

//ITERATING THROUGH LIST AND REPLACING EACH OBJECT IN LIST

objects.stream().map(object -> {
	//BLOCK OF CODE TO EXECUTE PER OBJECT
})

//------REACT-------//
//APP.css
@import "https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"

//axios
npm i axios

axios.post(`url`,object)
	.then(res => {
	console.log(res);
	console.log(res.data);
	})

axios.get(`url`)
	.then(res =>{
		const object = res.data;
		setState({... objectList, object}
	}, [Dependency])



//UseState
const [obj, setObj] = UseState(defaultValue)
//UseEffect
useEffect(/*sideEffect*/()=>{
	function()
	return /*whenKilled*/ function()
}
//UseContext
const AppContext = createContext(context)
const AppContext = useContext(context)
//UseLocation
const location = useLocation();

{location.pathname === "/pathname" && /*show*/ (<JSX>)}

//REACT-ROUTER-DOM
npm i reactRouterDom

<Router>
	<Route path = "/" exact render = {(props) =>{
		<>
			JSX TO RENDER
		</>
		}
	}}
	<Route path="/path" component = {Component}
</Router>

//instead of <a>, use <Link>
import {Link} from 'react-router-dom'
<Link to ="/path">TEXT</Link>

//Testing
npm install --save-dev jest babel-jest
npm install --save-dev enzyme enzyme-adapter-react-16 enzyme-to-json






import React from 'react'
import {shallow} from 'enzyme'
import App from "./../App"
import { beforeEach } from '@jest/globals';

describe('<Comp.>' , () => {
    let wrapper;
    
    beforeEach(()=>
        wrapper = shallow(<App/>)
    )

	it("Description", ()=> {
		const className = wrapper.find(".four");
		expect(className.text()).toEqual("Edit src/App.js and save to reload.")
	})

});