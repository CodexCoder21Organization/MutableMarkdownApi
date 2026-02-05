# MutableMarkdownApi

API interfaces for the MutableMarkdown service, providing contracts for managing markdown files.

## Interfaces

### MarkdownService

Service interface for CRUD operations on markdown files:

- `createFile(name: String, content: String): MarkdownFile` - Create a new file
- `getAllFiles(): Collection<MarkdownFile>` - List all files
- `getFile(id: UUID): MarkdownFile` - Get a file by ID
- `getFileByName(name: String): MarkdownFile?` - Get a file by name
- `deleteFile(file: MarkdownFile)` - Delete a file

### MarkdownFile

Represents a stored markdown file:

- `id: UUID` - Unique identifier
- `name: String` - Filename (mutable)
- `content: String` - Markdown content (mutable)
- `lastModified: Long` - Timestamp of last modification

## Building

```bash
./scripts/build.bash mutablemarkdownapi.buildMaven
```

## Usage

```kotlin
import community.kotlin.markdown.api.MarkdownService
import community.kotlin.markdown.api.MarkdownFile

// Implementations are provided by MutableMarkdownServiceServer
val service: MarkdownService = // obtain from server

// Create a file
val file = service.createFile("readme.md", "# Hello World")

// Read content
println(file.content)

// Update content
file.content = "# Updated Content"

// List all files
val allFiles = service.getAllFiles()

// Delete a file
service.deleteFile(file)
```

## Maven Coordinates

```
community.kotlin.markdown:api:0.0.1
```

## Related Projects

- **MutableMarkdownServiceServer** - Server implementation of these interfaces
- **MutableMarkdownCli** - Command-line tool for interacting with the service
