@KotlinBuildScript("https://tools.kotlin.build/")
@file:WithArtifact("kompile:build-kotlin-jvm:0.0.1")
package mutablemarkdownapi

import build.kotlin.withartifact.WithArtifact
import java.io.File
import build.kotlin.jvm.*
import build.kotlin.annotations.MavenArtifactCoordinates

val dependencies = resolveDependencies(
    MavenPrebuilt("org.jetbrains.kotlin:kotlin-stdlib:1.9.22"),
)

@MavenArtifactCoordinates("community.kotlin.markdown:api:")
fun buildMaven(): File {
    return buildSimpleKotlinMavenArtifact(
        // 0.0.1: Initial release
        //        - MarkdownService interface for CRUD operations
        //        - MarkdownFile interface for file representation
        coordinates = "community.kotlin.markdown:api:0.0.1",
        src = File("src"),
        compileDependencies = dependencies
    )
}

fun buildJar(): File {
    return buildMaven().jar
}

fun buildFatJar(): File {
    val manifest = Manifest(null)
    return BuildJar(manifest, dependencies.map { it.jar } + buildJar())
}
