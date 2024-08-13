databaseChangeLog {

    changeSet(id: '2024-08-12-01', author: 'Jorge Marimón <jmarimon@copyright.com>', runInTransaction: true) {
        comment('Creating the table OldSystemPOC')

        preConditions(onFail: 'MARK_RAN', onError: 'CONTINUE', onFailMessage: 'The table OldSystemPOC already exists') {
            sqlCheck(expectedResult: '0', sql: "SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = 'public' AND table_name = 'OldSystemPOC'")
        }

        sql('''
            DO $$
            BEGIN
                IF NOT EXISTS (SELECT 1 FROM information_schema.tables WHERE table_schema = 'public' AND table_name = 'OldSystemPOC') THEN
                        CREATE TABLE OldSystemPOC (id SERIAL PRIMARY KEY, name VARCHAR(255) NOT NULL, surname VARCHAR(255) NOT NULL, email VARCHAR(255) NOT NULL
                    );
                END IF;
            END
            $$;
        ''')

        rollback {
            sql('DROP TABLE IF EXISTS OldSystemPOC;')
        }
    }

}
