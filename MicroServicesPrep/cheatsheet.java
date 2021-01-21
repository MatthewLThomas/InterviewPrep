//start.spring.io
//spring web
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
@Builder
public class model {

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
server.port = 8761
eureka.client.register-with-eureka=false   
eureka.client.fetch-registry=false

//Eureka Client
spring.application.name = "NAME"
server.port = 8081


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
		thisState({... objectList, object}
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

