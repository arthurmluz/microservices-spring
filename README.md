# microservices-spring
Microservices using springboot - Software Engineering 2 

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


#### docker compose info
	- https://medium.com/codex/how-to-persist-and-backup-data-of-a-postgresql-docker-container-9fe269ff4334
	- https://www.baeldung.com/ops/docker-compose-expose-vs-ports

