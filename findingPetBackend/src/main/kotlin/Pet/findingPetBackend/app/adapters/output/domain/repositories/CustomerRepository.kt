package Pet.findingPetBackend.app.adapters.output.domain.repositories

import Pet.findingPetBackend.app.adapters.output.domain.entities.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface CustomerRepository : JpaRepository<CustomerEntity, UUID> {
}
