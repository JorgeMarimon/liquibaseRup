databaseChangeLog {
    property(file: 'database.properties')

    include(file: 'party-changelog-1-1.groovy', relativeToChangelogFile: true)
    include(file: 'party-changelog-1-2.groovy', relativeToChangelogFile: true)
    include(file: 'party-changelog-2-1.groovy', relativeToChangelogFile: true)
    include(file: 'party-changelog-2-2.groovy', relativeToChangelogFile: true)
}