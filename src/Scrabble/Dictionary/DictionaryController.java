package Scrabble.Dictionary;

import Scrabble.Logic.GameObjects.Exceptions.InvalidFileFormatException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DictionaryController {


    private Path path;
    private final List<String> dictionary = new ArrayList<>();
    private static final int headerLines = 3;

    public DictionaryController() {

    }

    public DictionaryController(String path) {
        this.path = Path.of(path);
    }

    public void importDictionary() throws IOException, InvalidFileFormatException, NullPointerException {
        if (path == null) {
            throw new NullPointerException("File path not set");
        } else {
            // path should be from repo/content root
            new File(String.valueOf(getPath()));
            try (Stream<String> stream = Files.lines(path)) {
                stream.forEach(this.dictionary::add);
            }
            // trim header fo the file
            if (dictionary.size() < headerLines) {
                throw new InvalidFileFormatException("file is not large enough to have header, please check file formatting");
            }
            else{
                dictionary.subList(0, headerLines).clear();
            }
        }
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public List<String> getDictionary() {
        return dictionary;
    }

    @Override
    public String toString() {
        return "DictionaryController{" +
                "path=" + path +
                ", dictionary=" + dictionary +
                '}';
    }
}
