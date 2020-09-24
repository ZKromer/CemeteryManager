package application.cma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import application.cma.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
