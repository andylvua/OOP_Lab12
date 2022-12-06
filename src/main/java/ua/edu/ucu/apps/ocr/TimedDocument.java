package ua.edu.ucu.apps.ocr;

import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;

@AllArgsConstructor
public class TimedDocument implements Document {
    public String gcsPath;
    @Override
    public String parse() throws IOException, SQLException {
        long start_smart = System.currentTimeMillis();
        String text = new SmartDocument(gcsPath).parse();
        long end_smart = System.currentTimeMillis();
        System.out.println("SmartDocument time (s): " + (end_smart - start_smart) / 1000.0);

        long start_cached = System.currentTimeMillis();
        new CachedDocument(gcsPath).parse();
        long end_cached = System.currentTimeMillis();
        System.out.println("CachedDocument time (s): " + (end_cached - start_cached) / 1000.0);

        return text;
    }
}
