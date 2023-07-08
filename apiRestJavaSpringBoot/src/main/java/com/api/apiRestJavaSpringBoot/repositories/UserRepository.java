package com.api.apiRestJavaSpringBoot.repositories;

import com.api.apiRestJavaSpringBoot.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    // Aquí puedes agregar métodos adicionales según tus necesidades

    // Ejemplo de método para buscar un usuario por su nombre de usuario

    // Otros métodos de consulta personalizados
}

