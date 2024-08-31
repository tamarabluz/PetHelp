package Pet.findingPetBackend.app.adapters

import Pet.findingPetBackend.app.adapters.input.controllers.mappers.CustomerMapper
import Pet.findingPetBackend.app.adapters.output.domain.repositories.CustomerRepository
import Pet.findingPetBackend.applications.core.dtos.CustomerDto
import Pet.findingPetBackend.applications.ports.output.InsertCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class InsertCustomerAdapter(
    private val customerRepository: CustomerRepository,
    private val customerMapper: CustomerMapper
) : InsertCustomerOutputPort {

    override fun insert(customerDto: CustomerDto) {
        val customerEntity = customerMapper.toCustomerEntity(customerDto)
        customerRepository.save(customerEntity)
    }
}






