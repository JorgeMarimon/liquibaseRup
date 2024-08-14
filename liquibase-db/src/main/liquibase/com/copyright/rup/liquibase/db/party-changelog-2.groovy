package com.copyright.rup.liquibase.db

databaseChangeLog {

    changeSet(id: '2024-08-12-03', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Updating a record in OldSystemPOC')

        update(schemaName: dbLogStructure, tableName: 'OldSystemPOC') {
            column(name: 'name', value: 'Jorge L')
            column(name: 'surname', value: 'Marimón Moreno')
            where("email = 'jmarimon@copyright.com'")
        }

        rollback {
            update(schemaName: dbLogStructure, tableName: 'OldSystemPOC') {
                column(name: 'name', value: 'Jorge')
                column(name: 'surname', value: 'Marimon')
                where("email = 'jmarimon@copyright.com'")
            }
        }
    }

    changeSet(id: '2024-08-12-04', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Inserting another record into OldSystemPOC')

        insert(schemaName: dbLogStructure, tableName: 'OldSystemPOC') {
            column(name: 'name', value: 'Manuel')
            column(name: 'surname', value: 'Quintero Rodriguez')
            column(name: 'email', value: 'mquintero@copyright.com')
        }

        rollback {
            delete(schemaName: dbLogStructure, tableName: 'OldSystemPOC') {
                where("email = 'mquintero@copyright.com'")
            }
        }
    }
}
