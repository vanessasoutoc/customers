package com.example.customer

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Entity;


@Entity
data class Customer (
    @Id @GeneratedValue
    var id: Long? = null,
    var firstName: String? = null,
    var surName: String? = null,
    var email: String? = null,
    var documentNumber: String? = null,
    var documetType: DocumentType? = null
)

enum class DocumentType{
    CPF, RF, CNH
}

@RepositoryRestResource
interface CustomerRepository: PagingAndSortingRepository<Customer, Long>