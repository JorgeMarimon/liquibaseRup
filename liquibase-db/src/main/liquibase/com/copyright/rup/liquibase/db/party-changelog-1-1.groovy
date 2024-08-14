package com.copyright.rup.liquibase.db

databaseChangeLog {

    changeSet(id: '2024-08-12-01', author: 'Jorge Marimón <jmarimon@copyright.com>',runInTransaction: true) {
        comment('Creating the table OldSystemPOC')

        createTable(tableName: 'OldSystemPOC') {
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
}
