plugins {
    id("ear")
}

group = "javaeetutorial.cart"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    deploy( project(path: ':my-war', configuration: 'archives'))
    deploy(project(path = ":cart-appclient", configuration = "archives"))
    deploy(project(path = ":MojeCartEjbTuto"))
    deploy(project(path = ":cart-common", configuration = "archives"))
}

tasks.ear {
    appDirectory = file("src/main/app")  // use application metadata found in this folder
//    libDirName = "APP-INF/lib" // put dependent libraries into APP-INF/lib inside the generated EAR
    deploymentDescriptor {  // custom entries for application.xml:
//      fileName = "application.xml"  // same as the default value
//      version = "6"  // same as the default value
        applicationName = "customear"
        initializeInOrder = true
        displayName = "Custom Ear"  // defaults to project.name
        // defaults to project.description if not set
        description = "My customized EAR for the Gradle documentation"
//      libraryDirectory = "APP-INF/lib"  // not needed, above libDirName setting does this
//      module("my.jar", "java")  // won't deploy as my.jar isn't deploy dependency
//      webModule("cart-appclient", "/cart-appclient")  // won't deploy as my.war isn't deploy dependency
//      webModule("MojeCartEjbTuto", "/MojeCartEjbTuto")  // won't deploy as my.war isn't deploy dependency
//        securityRole("admin")
//        securityRole("superadmin")
//        withXml { // add a custom node to the XML
//            asElement().apply {
//                appendChild(ownerDocument.createElement("data-source").apply { textContent = "my/data/source" })
//            }
//        }
    }
}