@file:WithArtifact("community.kotlin.markdown:api:0.0.1")
@file:WithArtifact("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
@file:WithArtifact("org.jetbrains.kotlin:kotlin-test:1.9.22")
package mutablemarkdownapi

import build.kotlin.withartifact.WithArtifact
import kotlin.test.assertNotNull

/**
 * Smoke tests for MutableMarkdownApi interfaces.
 * These verify the API classes are properly compiled and accessible.
 */

fun testMarkdownServiceInterfaceIsAccessible() {
    val serviceClass = MarkdownService::class
    assertNotNull(serviceClass, "MarkdownService class should exist")
}

fun testMarkdownFileInterfaceIsAccessible() {
    val fileClass = MarkdownFile::class
    assertNotNull(fileClass, "MarkdownFile class should exist")
}
