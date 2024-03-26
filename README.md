# CRUD API in SPRING BOOT

This is a simple CRUD API project in Spring Boot. Understanding the structure of this project can enable you to build more advanced APIs in Spring Boot.

## Author
- [S M Shamim](https://github.com/smwithgithub)

Want to create spring boot project? [Create](https://start.spring.io)

# Stack Used
 - Backend : Spring Boot (JAVA-17)
 - Database Connectivity: [Hibernate, Data JPA, Ms-SQL Driver]
 - Database: Microsoft SQL Server

## Structure of codes

 - Controller example
 ```
 @RestController
public class MyController{
    @Autowired
	private MyServiceStandard myService;

    @GetMapping("/student/{studentId}")
	public MyEntity getStudent(@PathVariable String studentId) {
		return this.myService.getStudent(Integer.parseInt(studentId));
	}
}
 ```

 - Service example with abstruction
 ```
 public interface MyServiceStandard {
     public MyEntity getStudent(int studentId);
 }
 ```
 ```
 @Service
public class MyService implements MyServiceStandard {
    @Autowired
	public MyRepository repository;

    @Override
	public MyEntity getStudent(int studentId) {

		return repository.findById(studentId).orElse(null);
	}
}
 ```

 - Simple example of JPA repository
 ```
 public interface MyRepository extends JpaRepository<MyEntity, Integer> {
	
}
 ```

 - Model/ Entity example
 ```
@Entity
@Data
@Table(name = "Student_Table")
@NoArgsConstructor
@AllArgsConstructor
public class MyEntity{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int roll;
	private String name;
	private String dept;
```
