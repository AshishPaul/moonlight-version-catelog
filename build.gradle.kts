plugins {
    `version-catalog`
    `maven-publish`
}

group = "com.zerogravity.moonlight"
version = "1.0-SNAPSHOT"

catalog {
    versionCatalog {
        from(files("./gradle/moonlight.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("moonlight") {
            artifactId = rootProject.name
            from(components["versionCatalog"])
        }
    }
}
