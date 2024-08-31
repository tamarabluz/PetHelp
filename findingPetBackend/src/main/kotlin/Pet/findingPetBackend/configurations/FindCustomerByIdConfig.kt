package Pet.findingPetBackend.configurations

import Pet.findingPetBackend.app.adapters.output.domain.FindCustomerAdapter
import Pet.findingPetBackend.applications.core.useCase.FindCustomerByIdUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FindCustomerByIdConfig {

    @Bean
    fun findCustomerByIdUseCase(findCustomerByIdAdapter: FindCustomerAdapter): FindCustomerByIdUseCase {
        return FindCustomerByIdUseCase(findCustomerByIdAdapter)
    }
}
