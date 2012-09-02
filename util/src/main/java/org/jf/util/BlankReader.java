package org.jf.util;

import java.io.IOException;
import java.io.Reader;

public class BlankReader extends Reader {
    public static final BlankReader INSTANCE = new BlankReader();

    @Override
    public int read(char[] chars, int i, int i1) throws IOException {
        return -1;
    }

    @Override
    public void close() throws IOException {
    }
}
