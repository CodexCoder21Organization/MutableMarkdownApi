package community.kotlin.markdown.api

import java.util.UUID

/**
 * Represents a markdown file stored in the service.
 *
 * Each file has a unique identifier, a name (filename), and content.
 */
interface MarkdownFile {
    /**
     * Unique identifier for this file.
     */
    val id: UUID

    /**
     * The filename (e.g., "readme.md").
     */
    var name: String

    /**
     * The markdown content of the file.
     */
    var content: String

    /**
     * Last modification timestamp in milliseconds since epoch.
     */
    val lastModified: Long
}
