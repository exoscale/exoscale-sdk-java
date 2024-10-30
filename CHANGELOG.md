# Changelog

## [Unreleased]

### Enhancements
- **Javadoc Generation**: Improved automation and versioning of Javadoc generation (#6).
- **GitHub Actions**: Improved handling of versioning in workflows, including `SNAPSHOT` tags based on release status (#10).
- **README Updates**: Updated paths, contact email, and removed `withHTTPInfo` examples (#5).

### Bug Fixes
- **Documentation**: Enhanced examples in `api_doc.mustache` for API methods such as `getInstance`, `createInstance`, `deleteInstance`, and `updateInstance` (#9).

### Changes
- **`WithHttpInfo` Visibility Update**: Set `WithHttpInfo` methods to private (#8).

### Removed/Deprecated
- **Documentation**: Removed all `WithHttpInfo` method examples from the API documentation (#7).
- **Generation**: Removed timestamp generation from SDK classes for consistency (#5).


## [0.0.2-ALPHA] - 2024-08-20

### Features

- **GitHub Actions**: Added automation for regenerating the SDK when the specification changes.
- **GitHub Actions**: Added automation to create a new release when a tag is pushed, and automatically publish it to Maven Central. 

### Changes

- **Documentation**: Moved the SDK README to the root directory and relocated the `exoscale4j` README to the `generator` directory. 
- **Maven Configuration**: Changed the group ID and artifact ID from `exoscale4j` to `sdk`.

## [0.0.1-ALPHA] - 2024-06-10

### Added
- Initial release.
