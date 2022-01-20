package another

import grails.gorm.transactions.Transactional

@Transactional
class PrService {

    def create() {
        new Prueba(name: 'miguel', lastName: 'bautista').save(flush: true)

        Prueba.last().name
    }
}
