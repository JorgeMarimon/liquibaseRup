package com.copyright.rup.liquibase.party.db

databaseChangeLog {
    property(file: 'database.properties')

    include(file: 'party-changelog-1.groovy', relativeToChangelogFile: true)
    include(file: 'party-changelog-2.groovy', relativeToChangelogFile: true)
}