@KotlinBuildScript("https://tools.kotlin.build/")
@file:WithArtifact("community.kotlin.markdown:api:0.0.1")
@file:WithArtifact("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
@file:WithArtifact("org.jetbrains.kotlin:kotlin-test:1.9.22")
package mutablemarkdownapi

import build.kotlin.withartifact.WithArtifact
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

/**
 * Smoke tests for MutableMarkdownApi interfaces.
 * These verify the API classes are properly compiled and accessible.
 */

// Test: MarkdownService interface exists and is accessible
println("Test: MarkdownService interface is accessible")
val serviceClass = MarkdownService::class
assertNotNull(serviceClass, "MarkdownService class should exist")
println("  PASSED")

// Test: MarkdownFile interface exists and is accessible
println("Test: MarkdownFile interface is accessible")
val fileClass = MarkdownFile::class
assertNotNull(fileClass, "MarkdownFile class should exist")
println("  PASSED")

println()
println("All tests passed!")
