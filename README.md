# Getting Started

Compares SpringBoot behaviour when externalizing configuration properties.

## Module `test-using-profile`

Tests SpringBoot properties externalization behaviour using Spring profile `@ActiveProfiles("test")` and therefore files like:

- `src/main/resources/application.yml` <- contains default values
- `src/test/resources/application-test.yml` <- should contain *only overridden* values during testing

## Module `test-using-replica`

Tests SpringBoot properties externalization behaviour using a replica of `application.yml`:

- `src/main/resources/application.yml` <- contains default values
- `src/test/resources/application.yml` <- should contain *every value* defined on original file during testing (more error-prone)
