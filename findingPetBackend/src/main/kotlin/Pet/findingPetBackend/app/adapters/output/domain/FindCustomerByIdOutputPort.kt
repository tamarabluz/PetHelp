package Pet.findingPetBackend.app.adapters.output.domain

import Pet.findingPetBackend.applications.core.dtos.CustomerDto
import java.util.*

interface FindCustomerByIdOutputPort {
    fun find(id: UUID): Optional<CustomerDto>
}
