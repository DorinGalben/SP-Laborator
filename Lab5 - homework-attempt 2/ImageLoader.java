package com.company;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface ImageLoader {
    BufferedImage load() throws IOException;
}
