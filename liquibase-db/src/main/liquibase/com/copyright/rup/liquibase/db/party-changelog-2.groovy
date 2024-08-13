databaseChangeLog {

    changeSet(id: '2024-08-12-03', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Updating a record in OldSystemPOC')

        sql('UPDATE OldSystemPOC SET name = \'Jorge L\', surname = \'Marimón Moreno\' WHERE email = \'jmarimon@copyright.com\';')

        rollback {
            sql('UPDATE OldSystemPOC SET name = \'Jorge\', surname = \'Marimon\' WHERE email = \'jmarimon@copyright.com\';')
        }
    }

    changeSet(id: '2024-08-12-04', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Inserting another record into OldSystemPOC')

        sql('INSERT INTO OldSystemPOC (name, surname, email) VALUES (\'Manuel\', \'Quintero Rodriguez\', \'mquintero@copyright.com\');')

        rollback {
            sql('DELETE FROM OldSystemPOC WHERE email = \'mquintero@copyright.com\';')
        }
    }

}
