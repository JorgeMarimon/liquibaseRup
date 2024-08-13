databaseChangeLog {
    changeSet(id: '2024-08-12-01', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Creating the table OldSystemPOC')

        sql('CREATE TABLE IF NOT EXISTS OldSystemPOC (id SERIAL PRIMARY KEY, name VARCHAR(255) NOT NULL, surname VARCHAR(255) NOT NULL, email VARCHAR(255) NOT NULL);')

        rollback {
            sql('DROP TABLE OldSystemPOC')
        }
    }
}
