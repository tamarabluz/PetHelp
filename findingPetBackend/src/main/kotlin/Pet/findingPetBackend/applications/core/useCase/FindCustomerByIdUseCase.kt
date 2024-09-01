package Pet.findingPetBackend.applications.core.useCase

import Pet.findingPetBackend.app.adapters.output.domain.FindCustomerByIdOutputPort
import Pet.findingPetBackend.applications.core.dtos.CustomerDto
import Pet.findingPetBackend.applications.core.handlers.CustomerNotFoundException
import Pet.findingPetBackend.applications.ports.input.FindCustomerByIdInputPort
import java.util.UUID


class FindCustomerByIdUseCase(
    private val findCustomerByIdOutputPort: FindCustomerByIdOutputPort
) : FindCustomerByIdInputPort {

    override fun find(id: UUID): CustomerDto {
        return findCustomerByIdOutputPort.find(id)
            .orElseThrow { CustomerNotFoundException("Customer with ID $id not found") }
    }
}


