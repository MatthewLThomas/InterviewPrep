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


// Eureka Server
// use 1.8
// app.props
server.port = 8081
eureka.client.register-with-eureka=false   
eureka.client.fetch-registry=false

