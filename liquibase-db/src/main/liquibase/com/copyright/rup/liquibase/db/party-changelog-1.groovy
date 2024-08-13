databaseChangeLog {

    changeSet(id: '2024-08-12-01', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Creating the table OldSystemPOC')

        sql('CREATE TABLE OldSystemPOC (id SERIAL PRIMARY KEY, name VARCHAR(255) NOT NULL, surname VARCHAR(255) NOT NULL, email VARCHAR(255) NOT NULL);')

        rollback {
            sql('DROP TABLE OldSystemPOC')
        }
    }

    changeSet(id: '2024-08-12-02', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Inserting a record into OldSystemPOC')

        sql('INSERT INTO OldSystemPOC (name, surname, email) VALUES (\'Jorge\', \'Marimon\', \'jmarimon@copyright.com\');')

        rollback {
            sql('DELETE FROM OldSystemPOC WHERE email = \'jmarimon@copyright.com\';')
        }
    }
}



