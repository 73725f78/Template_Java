plugins {
    application
	eclipse
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.0.1-jre")

	testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter:5.9.0")

	implementation("org.apache.logging.log4j:log4j-api:2.18.0")
	implementation("org.apache.logging.log4j:log4j-core:2.18.0")
}

application {
    mainClass.set("templatejava.App")
}


tasks.test {
	useJUnitPlatform()
}
