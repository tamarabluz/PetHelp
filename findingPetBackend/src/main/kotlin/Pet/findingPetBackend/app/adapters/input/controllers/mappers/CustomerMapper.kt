package Pet.findingPetBackend.app.adapters.input.controllers.mappers

import Pet.findingPetBackend.app.adapters.input.controllers.requests.CustomerRequest
import Pet.findingPetBackend.app.adapters.input.controllers.responses.CustomerResponse
import Pet.findingPetBackend.app.adapters.output.domain.entities.CustomerEntity
import Pet.findingPetBackend.applications.core.dtos.CustomerDto
import org.springframework.stereotype.Component

@Component
class CustomerMapper {

    fun toCustomer(customerRequest: CustomerRequest): CustomerDto {
        return CustomerDto(
            id = null,
            name = customerRequest.name,
            breed = customerRequest.breed,
            age = customerRequest.age,
            owner = customerRequest.owner,
            email = customerRequest.email,
            phoneNumber = customerRequest.phoneNumber,
            apartNumber = customerRequest.apartNumber,
            blockNumber = customerRequest.blockNumber
        )
    }

    fun toCustomerDto(customerEntity: CustomerEntity): CustomerDto {
        return CustomerDto(
            id = customerEntity.id,
            name = customerEntity.name,
            breed = customerEntity.breed,
            age = customerEntity.age,
            owner = customerEntity.owner,
            email = customerEntity.email,
            phoneNumber = customerEntity.phoneNumber,
            apartNumber = customerEntity.apartNumber,
            blockNumber = customerEntity.blockNumber
        )
    }
    fun toCustomerEntity(customerDto: CustomerDto): CustomerEntity {
        return CustomerEntity(
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
    }

    fun toCustomerResponse(customerDto: CustomerDto): CustomerResponse {
        return CustomerResponse(
            name = customerDto.name,
            breed = customerDto.breed,
            age = customerDto.age,
            owner = customerDto.owner,
            email = customerDto.email,
            phoneNumber = customerDto.phoneNumber,
            apartNumber = customerDto.apartNumber,
            blockNumber = customerDto.blockNumber
        )
    }
}
