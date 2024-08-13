package com.copyright.rup.liquibase.party.db

databaseChangeLog {
    property(file: 'database.properties')

    include(file: 'changelog-1.groovy', relativeToChangelogFile: true)
    include(file: 'changelog-2.groovy', relativeToChangelogFile: true)
}