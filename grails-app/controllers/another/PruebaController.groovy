package another

class PruebaController {

    def index() {
        new Prueba(name: 'miguel', lastName: 'bautista').save(flush: true)

        render "my name is ${Prueba.last().name}"
    }
}
