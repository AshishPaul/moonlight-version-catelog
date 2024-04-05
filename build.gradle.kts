plugins {
    `version-catalog`
    `maven-publish`
}

group = "com.zerogravity.moonlight"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
}

catalog {
    versionCatalog {
        from(files("./gradle/moonlight.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("moonlight") {
            from(components["versionCatalog"])
        }
    }
}