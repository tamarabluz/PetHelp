package Pet.findingPetBackend.app.adapters.input.controllers.requests

data class CustomerRequest(

    val name: String? = null,
    val breed: String? = null,
    val age: String? = null,
    val owner: String? = null,
    val email: String? = null,
    val phoneNumber: String? = null,
    val apartNumber: String? = null,
    val blockNumber: String? = null,
)
