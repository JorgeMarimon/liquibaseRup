databaseChangeLog {

    changeSet(id: '2024-08-12-03', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Updating a record in OldSystemPOC')

        sql('UPDATE OldSystemPOC SET name = \'Jorge L\', surname = \'Marimón Moreno\' WHERE id = 1;')

        rollback {
            sql('UPDATE OldSystemPOC SET name = \'Jorge\', surname = \'Marimon\' WHERE id = 1;')
        }
    }
}



