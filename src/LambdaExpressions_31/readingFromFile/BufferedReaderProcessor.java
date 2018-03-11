package LambdaExpressions_31.readingFromFile;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by CC on 11.03.2018.
 */

@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}
