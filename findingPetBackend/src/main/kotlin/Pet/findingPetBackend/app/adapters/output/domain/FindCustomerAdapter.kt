package Pet.findingPetBackend.app.adapters.output.domain

import Pet.findingPetBackend.app.adapters.input.controllers.mappers.CustomerMapper
import Pet.findingPetBackend.app.adapters.output.domain.repositories.CustomerRepository
import Pet.findingPetBackend.applications.core.dtos.CustomerDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class FindCustomerAdapter(
    @Autowired private val customerRepository: CustomerRepository,
    @Autowired private val customerMapper: CustomerMapper
) : FindCustomerByIdOutputPort {

    override fun find(id: UUID): Optional<CustomerDto> {
        val customerEntity = customerRepository.findById(id)
        return customerEntity.map { entity -> customerMapper.toCustomerDto(entity) }
    }
}
