# Chapter1_Challenge_1_4

## Description

This is a Java project for Chapter 1, Challenge 1.4, demonstrating configuration file reading and validation. The program reads a `config.txt` file, parses the version and file path, performs validation checks, and handles various exceptions gracefully.

The main functionality includes:
- Reading configuration from `config.txt`
- Validating the config version (must be >= 2)
- Checking if the specified file path exists
- Providing detailed error messages for different failure scenarios
- Proper resource cleanup in the `finally` block

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Ant (for building via `build.xml`)
- NetBeans IDE (recommended, as the project is set up for NetBeans)

## Project Structure

- `src/chapter1_challenge_1_4/Chapter1_Challenge_1_4.java`: Main Java class containing the application logic
- `config.txt`: Configuration file with version and file path
- `build.xml`: Ant build script
- `manifest.mf`: JAR manifest file
- `nbproject/`: NetBeans project files

## How to Build and Run

### Using NetBeans
1. Open the project in NetBeans IDE
2. Right-click the project and select "Build"
3. Right-click the project and select "Run"

### Using Command Line
1. Ensure Apache Ant is installed
2. Run `ant compile` to compile the project
3. Run `ant jar` to create a JAR file
4. Run `ant run` to execute the program

## Usage

The program expects a `config.txt` file in the project root with the following format:
```
2
/path/to/some/file.txt
```

- First line: Version number (integer, must be >= 2)
- Second line: File path to validate

Example output when successful:
```
Configuration loaded successfully!
Version: 2
Target file: /path/to/some/file.txt
Config read attempt finished.
```

## Error Handling

The program handles several error scenarios:
- Missing `config.txt` file
- Empty or malformed config file
- Invalid version number
- Non-existent file path
- General exceptions

All errors are caught and user-friendly messages are displayed.

## Dependencies

This project has no external dependencies beyond the standard Java libraries.

## License

This project is for educational purposes. Feel free to use and modify as needed.
