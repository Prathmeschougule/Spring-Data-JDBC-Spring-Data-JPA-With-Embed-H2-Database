Dependencies and Annotations:

@RestController: Marks the class as a RESTful web service controller.
@Autowired: Injects the MyRepository dependency.
@Repository: Marks the class as a Spring Data repository.
Creating the Table:

CreateTable(): Executes a SQL statement to create my_table with an auto-incrementing ID and a name column.
Inserting Data:

insertData(): Inserts a row with the name 'Prathmesh' into my_table.
Deleting Data:

deletetable(int id): Deletes a row from my_table where the ID matches the provided id.
Updating Data:

upadatedata(int id, String newname): Updates the name of the row with the specified ID.
Retrieving Data:

getAllName(): Retrieves all names from my_table and returns them as a list of strings.
Using H2 Database:
H2 is an in-memory database that is perfect for development, testing, and small applications. It doesn't require installation or configuration, and it runs within the application's memory.
