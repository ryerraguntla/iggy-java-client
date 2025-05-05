plugins {
    id("java")
}

group = "rs.iggy"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
    maven ("https://oss.sonatype.org/content/repositories/snapshots" )

}

dependencies {
    implementation(project(":java-sdk"))
    implementation("org.slf4j:slf4j-api:2.0.9")
    implementation ("io.openmessaging:openmessaging-api:2.2.1-pubsub")
    implementation ("org.apache.rocketmq:rocketmq-client:5.2.0")
    runtimeOnly("ch.qos.logback:logback-classic:1.4.12")
}
