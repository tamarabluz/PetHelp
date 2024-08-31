package Pet.findingPetBackend.applications.core.handlers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody


@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException::class)
    @ResponseBody
    fun handleCustomerNotFoundException(ex: CustomerNotFoundException): ResponseEntity<String> {
        return ResponseEntity(ex.message, HttpStatus.NOT_FOUND)
    }
}

