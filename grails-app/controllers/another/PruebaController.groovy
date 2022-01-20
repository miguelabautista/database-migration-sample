package another

import javax.transaction.Transactional

class PruebaController {

    def prService

    def index() {
        def va = prService.create()

        render "my name is ${va}"
    }
}
