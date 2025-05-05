plugins {
    java
   // id("com.github.spotbugs") version "5.0.13"
    id("jacoco")
}

group = "org.apache.rocketmq"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
 /*   implementation("org.apache.rocketmq:rocketmq-client:4.9.1")
    implementation("org.apache.rocketmq:rocketmq-tools:4.9.1")*/
    //implementation("io.openmessaging:openmessaging-api:0.1.0")
    implementation(group = "io.openmessaging", name = "openmessaging-api", version = "0.3.0-alpha")
    implementation(group = "org.apache.rocketmq", name = "rocketmq-proto", version = "2.0.4")
    implementation(group = "org.apache.rocketmq", name = "rocketmq-rocksdb", version = "1.0.2")
    implementation(group = "org.apache.rocketmq", name = "rocketmq-client", version = "4.9.2")
    implementation(group = "org.apache.rocketmq", name = "rocketmq-remoting", version = "5.2.0")

    //implementation(group = "io.openmessaging", name = "openmessaging-api", version = "2.2.1-pubsub")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("commons-cli:commons-cli:1.4")
    implementation("com.google.guava:guava:32.0.1-android")
    implementation("org.reflections:reflections:0.10.2")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.4.2")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-core:4.7.0")
    testImplementation("org.assertj:assertj-core:3.22.0")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-Xlint:unchecked")
    options.compilerArgs.add("-Xlint:deprecation")
}


tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

jacoco {
    toolVersion = "0.8.7"
}

/*
spotbugs {
    toolVersion.set("4.7.3")
    ignoreFailures.set(false)
    //effort.set(com.github.spotbugs.snom.Effort.MAX)
    //reportLevel.set(com.github.spotbugs.snom.ReportLevel.HIGH)
}*/
