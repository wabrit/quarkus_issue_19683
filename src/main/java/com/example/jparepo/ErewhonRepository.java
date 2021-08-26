package com.example.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface ErewhonRepository extends JpaRepository<Erewhon, Long> {

}
