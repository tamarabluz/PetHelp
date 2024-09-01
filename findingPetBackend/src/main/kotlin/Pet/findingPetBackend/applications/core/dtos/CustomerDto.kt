package Pet.findingPetBackend.applications.core.dtos

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import java.util.UUID

@AllArgsConstructor
@NoArgsConstructor
data class CustomerDto(

    val id: UUID? = null,
    val name: String? = null,
    val breed: String? = null,
    val age: String? = null,
    val owner: String? = null,
    val email: String? = null,
    val phoneNumber: String? = null,
    val apartNumber: String? = null,
    val blockNumber: String? = null,
)
