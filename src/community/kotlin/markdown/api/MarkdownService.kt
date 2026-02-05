package community.kotlin.markdown.api

import java.util.UUID

/**
 * Service interface for managing markdown files.
 *
 * Provides CRUD operations for markdown files stored by the service.
 */
interface MarkdownService {
    /**
     * Creates a new markdown file with the given name and content.
     *
     * @param name The filename (e.g., "readme.md")
     * @param content The markdown content
     * @return The created file
     */
    fun createFile(name: String, content: String): MarkdownFile

    /**
     * Retrieves all files in the service.
     *
     * @return Collection of all markdown files
     */
    fun getAllFiles(): Collection<MarkdownFile>

    /**
     * Retrieves a file by its unique identifier.
     *
     * @param id The file's UUID
     * @return The file if found
     * @throws IllegalArgumentException if the file does not exist
     */
    fun getFile(id: UUID): MarkdownFile

    /**
     * Retrieves a file by its name.
     *
     * @param name The filename to search for
     * @return The file if found, or null if no file with that name exists
     */
    fun getFileByName(name: String): MarkdownFile?

    /**
     * Deletes a file.
     *
     * @param file The file to delete
     */
    fun deleteFile(file: MarkdownFile)
}
