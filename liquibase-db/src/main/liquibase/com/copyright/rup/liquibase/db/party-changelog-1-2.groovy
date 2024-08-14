package com.copyright.rup.liquibase.db

databaseChangeLog {

    changeSet(id: '2024-08-12-02', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Inserting a record into OldSystemPOC')

        insert(tableName: 'OldSystemPOC') {
            column(name: 'name', value: 'Jorge')
            column(name: 'surname', value: 'Marimon')
            column(name: 'email', value: 'jmarimon@copyright.com')
        }

        rollback {
            delete(tableName: 'OldSystemPOC') {
                where("email = 'jmarimon@copyright.com'")
            }
        }
    }
}
