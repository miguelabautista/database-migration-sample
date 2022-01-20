databaseChangeLog = {
    changeSet(author: "migue (generated)", id: "1642701640759-1") {
        createTable(tableName: "prueba") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "pruebaPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }
}
