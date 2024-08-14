package com.copyright.rup.liquibase.db

databaseChangeLog {

    changeSet(id: '2024-08-12-03', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Updating a record in OldSystemPOC')

        update(tableName: 'OldSystemPOC') {
            column(name: 'name', value: 'Jorge L')
            column(name: 'surname', value: 'Marimón Moreno')
            where("email = 'jmarimon@copyright.com'")
        }

        rollback {
            update(tableName: 'OldSystemPOC') {
                column(name: 'name', value: 'Jorge')
                column(name: 'surname', value: 'Marimon')
                where("email = 'jmarimon@copyright.com'")
            }
        }
    }
}
