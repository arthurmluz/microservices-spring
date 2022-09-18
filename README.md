# microservices-spring
Microservices using springboot - Software Engineering 2 

**Objective:** Implement a solution using a microservices-based architecture. This work will aim to implement a solution using microservices

**Backend Features:**

1. Register the student: name, document number, address. To

register the student (avoiding duplication) a registration number is created

enrollment for the student.

2. Query a student by registration number;

3. Query a student for a piece of their name. if there is more

from a "match", returns a list;

4. Consult the list of all students;

5. register courses, with the data: course code, name of

discipline, discipline schedule (by codes: A, B, C, D ...., G), class

of the discipline (numerical code). Remember that the same

discipline (same code and name) can occur more than once

(different classes);

6. Enroll student in the discipline: inform the registration number of the

student, code and discipline class.

7. Consult the subjects/classes in which a student is

Registered;

8. Consult students enrolled in a discipline/class

9. Register system user, with your email, name and password;

10. Log in and out. Note: implements a simple functionality, it is not necessary to use an authentication/authorization framework.

![alt text](https://github.com/arthurmluz/microservices-spring/tree/main/img/microservices.png?raw=true)

# To excute

### Run docker first time:
	docker-compose up -d
		- roda o docker em modo detach (libera o terminal)
	docker exec -i microservices-spring_db_1 mysql -u root -p123 -f < ./microservices.sql
		- executa o script microservices.sql

## Running docker database:
	- 'docker-compose up'
		- will occupy the host terminal with a log
		- access internal docker bash: 'docker exec -it <container_id> bash' 
## Accessing the database:
	- 'psql -h localhost -p 5432 -U postgres -W -d college'
		- password = 123

### Data will be saved on ./data folder, do not delete it


## Shutdown docker:
	- 'docker-compose down'

## To connect on database
```
docker ps -a
docker exec -it <it>
show databases;
use <database_name>;
```

#### docker compose info
	- https://medium.com/codex/how-to-persist-and-backup-data-of-a-postgresql-docker-container-9fe269ff4334
	- https://www.baeldung.com/ops/docker-compose-expose-vs-ports

