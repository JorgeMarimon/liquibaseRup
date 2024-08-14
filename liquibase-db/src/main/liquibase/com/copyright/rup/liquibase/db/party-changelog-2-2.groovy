package com.copyright.rup.liquibase.db

databaseChangeLog {

    changeSet(id: '2024-08-12-04', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Inserting another record into OldSystemPOC')

        insert(tableName: 'OldSystemPOC') {
            column(name: 'name', value: 'Manuel')
            column(name: 'surname', value: 'Quintero Rodriguez')
            column(name: 'email', value: 'mquintero@copyright.com')
        }

        rollback {
            delete(tableName: 'OldSystemPOC') {
                where("email = 'mquintero@copyright.com'")
            }
        }
    }
}
