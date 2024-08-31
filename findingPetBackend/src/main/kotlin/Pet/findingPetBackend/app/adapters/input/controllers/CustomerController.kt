package Pet.findingPetBackend.app.adapters.input.controllers

import Pet.findingPetBackend.app.adapters.input.controllers.mappers.CustomerMapper
import Pet.findingPetBackend.app.adapters.input.controllers.requests.CustomerRequest
import Pet.findingPetBackend.app.adapters.input.controllers.responses.CustomerResponse
import Pet.findingPetBackend.applications.core.handlers.CustomerNotFoundException
import Pet.findingPetBackend.applications.ports.input.FindCustomerByIdInputPort
import Pet.findingPetBackend.applications.ports.input.InsertCustomerInputPort
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("v1/customers")
class CustomerController(
    private val customerMapper: CustomerMapper,
    private val insertCustomerInputPort: InsertCustomerInputPort,
    private val findCustomerByIdInputPort: FindCustomerByIdInputPort
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun insert(@Valid @RequestBody customerRequest: CustomerRequest) {
        val customer = customerMapper.toCustomer(customerRequest)
        insertCustomerInputPort.insert(customer)
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getById(@PathVariable id: UUID): ResponseEntity<CustomerResponse> {

            val customer = findCustomerByIdInputPort.find(id)
            val customerResponse = customerMapper.toCustomerResponse(customer)
        return ResponseEntity.ok(customerResponse)
    }
}
