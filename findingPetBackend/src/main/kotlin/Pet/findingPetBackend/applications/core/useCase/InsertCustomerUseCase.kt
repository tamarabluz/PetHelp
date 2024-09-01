package Pet.findingPetBackend.applications.core.useCase

import Pet.findingPetBackend.app.adapters.output.domain.entities.CustomerEntity
import Pet.findingPetBackend.applications.core.dtos.CustomerDto
import Pet.findingPetBackend.applications.ports.input.InsertCustomerInputPort
import Pet.findingPetBackend.applications.ports.output.InsertCustomerOutputPort
import org.springframework.stereotype.Service

class InsertCustomerUseCase(
    private val insertCustomerOutputPort: InsertCustomerOutputPort
) : InsertCustomerInputPort {

    override fun insert(customerDto: CustomerDto) {
        val customerDto = CustomerDto(
            id = customerDto.id,
            name = customerDto.name,
            breed = customerDto.breed,
            age = customerDto.age,
            owner = customerDto.owner,
            email = customerDto.email,
            phoneNumber = customerDto.phoneNumber,
            apartNumber = customerDto.apartNumber,
            blockNumber = customerDto.blockNumber
        )

        insertCustomerOutputPort.insert(customerDto)
    }
}
