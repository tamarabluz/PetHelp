package Pet.findingPetBackend.applications.ports.input

import Pet.findingPetBackend.applications.core.dtos.CustomerDto
import java.util.UUID

interface FindCustomerByIdInputPort {
    fun find(id: UUID):  CustomerDto
}
