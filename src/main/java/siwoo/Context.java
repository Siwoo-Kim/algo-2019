package siwoo;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by sm123tt@gmail.com on 2019-10-30
 * Project : algosiwoo
 * Github : http://github.com/Siwoo-Kim
 */

public class Context {

    public static final Path DATA_SOURCE = Paths.get("./src/main/resources/data/algs4-data");

    public static File getDataSource() {
        return DATA_SOURCE.toFile();
    }
}
