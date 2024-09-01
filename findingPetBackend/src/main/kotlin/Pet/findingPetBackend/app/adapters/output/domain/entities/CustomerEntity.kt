package Pet.findingPetBackend.app.adapters.output.domain.entities

import jakarta.persistence.*
import lombok.NoArgsConstructor
import org.springframework.boot.autoconfigure.domain.EntityScan
import java.util.UUID


@Entity
@Table(name = "Customer")
@NoArgsConstructor
data class CustomerEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    val id: UUID? = null,

    @Column(name= "names", nullable = false, updatable = true)
    val name: String? = null,

    @Column(name= "breed", nullable = false, updatable = true)
    val breed: String? = null,

    @Column(name= "age", nullable = false, updatable = true)
    val age: String? = null,

    @Column(name= "owner", nullable = false, updatable = true)
    val owner: String? = null,

    @Column(name= "email", nullable = false, updatable = true)
    val email: String? = null,

    @Column(name= "phoneNumber", nullable = false, updatable = true)
    val phoneNumber: String? = null,

    @Column(name= "apartNumber", nullable = false, updatable = true)
    val apartNumber: String? = null,

    @Column(name= "blockNumber", nullable = false, updatable = true)
    val blockNumber: String? = null,
)
