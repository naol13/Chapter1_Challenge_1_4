
package chapter1_challenge_1_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Chapter1_Challenge_1_4 {

    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Attempt to open and read config.txt
            reader = new BufferedReader(new FileReader("config.txt"));

            // Read first line (version)
            String versionLine = reader.readLine();
            if (versionLine == null) {
                throw new IOException("Config file is empty.");
            }
            int version = Integer.parseInt(versionLine.trim());

            // Read second line (file path)
            String filePath = reader.readLine();
            if (filePath == null) {
                throw new IOException("Config file missing second line.");
            }

            // Validate config version
            if (version < 2) {
                throw new Exception("Config version too old!");
            }

            // Check if the file at the given path exists
            File targetFile = new File(filePath);
            if (!targetFile.exists()) {
                throw new IOException("Specified file path does not exist: " + filePath);
            }

            // If we reach here, everything is valid
            System.out.println("Configuration loaded successfully!");
            System.out.println("Version: " + version);
            System.out.println("Target file: " + filePath);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Configuration file 'config.txt' not found.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Config version too old! .");
        } catch (Exception e) {
            // Catches our custom "Config version too old!" exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Always execute
            System.out.println("Config read attempt finished.");

            // Clean up resource
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // Ignore cleanup errors in finally
                }
            }
        }
    }
}