package com.kushalobroy.apivault.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/logs")
public class LogController {

    private static final String LOG_FILE_PATH = "logs/app.log"; // Path to log file

    @GetMapping
    public List<String> getApplicationLogs() throws IOException {
        Path path = Path.of(LOG_FILE_PATH);
        if (!Files.exists(path)) {
            return List.of("Log file not found!");
        }

        List<String> allLines = Files.readAllLines(path);
        return allLines.stream()
                .skip(Math.max(0, allLines.size() - 100)) // Return last 100 lines
                .collect(Collectors.toList());
    }
}

