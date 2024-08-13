databaseChangeLog {

    changeSet(id: '2024-08-12-04', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Inserting another record into OldSystemPOC')

        sql('INSERT INTO OldSystemPOC (name, surname, email) VALUES (\'Manuel\', \'Quintero Rodriguez\', \'mquintero@copyright.com\');')

        rollback {
            sql('DELETE FROM OldSystemPOC WHERE email = \'mquintero@copyright.com\';')
        }
    }

}



