package Pet.findingPetBackend.configurations
import Pet.findingPetBackend.app.adapters.input.controllers.mappers.CustomerMapper
import Pet.findingPetBackend.applications.core.useCase.InsertCustomerUseCase
import Pet.findingPetBackend.applications.ports.input.InsertCustomerInputPort
import Pet.findingPetBackend.applications.ports.output.InsertCustomerOutputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {

    @Bean(name = ["customInsertCustomerUseCase"])
    fun insertCustomerUseCase(
        insertCustomerOutputPort: InsertCustomerOutputPort
    ): InsertCustomerInputPort {
        return InsertCustomerUseCase(insertCustomerOutputPort)
    }

    @Bean
    fun customerMapper(): CustomerMapper {
        return CustomerMapper()
    }

}
