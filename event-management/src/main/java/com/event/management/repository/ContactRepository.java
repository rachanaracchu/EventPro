package com.event.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.management.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
