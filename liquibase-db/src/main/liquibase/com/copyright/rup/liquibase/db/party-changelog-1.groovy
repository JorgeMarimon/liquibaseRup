package com.copyright.rup.liquibase.db

databaseChangeLog {

    changeSet(id: '2024-08-12-01', author: 'Jorge Marimón <jmarimon@copyright.com>',runInTransaction: true) {
        comment('Creating the table OldSystemPOC')

        createTable(schemaName: dbLogStructure, tableName: 'OldSystemPOC') {
            column(name: 'id', type: 'SERIAL', autoIncrement: true) {
                constraints(primaryKey: true, nullable: false)
            }
            column(name: 'name', type: 'VARCHAR(255)') {
                constraints(nullable: false)
            }
            column(name: 'surname', type: 'VARCHAR(255)') {
                constraints(nullable: false)
            }
            column(name: 'email', type: 'VARCHAR(255)') {
                constraints(nullable: false)
            }
        }

        rollback {
            dropTable(tableName: 'OldSystemPOC')
        }
    }

    changeSet(id: '2024-08-12-02', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Inserting a record into OldSystemPOC')

        insert(schemaName: dbLogStructure, tableName: 'OldSystemPOC') {
            column(name: 'name', value: 'Jorge')
            column(name: 'surname', value: 'Marimon')
            column(name: 'email', value: 'jmarimon@copyright.com')
        }

        rollback {
            delete(schemaName: dbLogStructure, tableName: 'OldSystemPOC') {
                where("email = 'jmarimon@copyright.com'")
            }
        }
    }
}
