package Pet.findingPetBackend.applications.ports.output

import Pet.findingPetBackend.app.adapters.output.domain.entities.CustomerEntity
import Pet.findingPetBackend.applications.core.dtos.CustomerDto

interface InsertCustomerOutputPort {
    fun insert(customerDto: CustomerDto)
}