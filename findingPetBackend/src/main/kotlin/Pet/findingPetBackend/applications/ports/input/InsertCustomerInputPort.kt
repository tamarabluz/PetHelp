package Pet.findingPetBackend.applications.ports.input

import Pet.findingPetBackend.applications.core.dtos.CustomerDto

interface InsertCustomerInputPort {
    fun insert(customerDto: CustomerDto)
}