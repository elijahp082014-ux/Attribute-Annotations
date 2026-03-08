package io.elijahsonicboy.annotator;

import net.fabricmc.api.ModInitializer;

public class Annotator implements ModInitializer {

    @Override
    public void onInitialize() {
        AnnotationProcessor.process();
    }
}