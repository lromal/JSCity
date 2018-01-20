package com.building.gr2l5st22;

import java.io.File;
import java.io.IOException;

import eu.printingin3d.javascad.exceptions.IllegalValueException;
import eu.printingin3d.javascad.utils.SaveScadFiles;

public class Main {

    /**
     * @param args
     * @throws IOException
     * @throws IllegalValueException
     */
    public static void main(String[] args) throws IllegalValueException, IOException {
        new SaveScadFiles(new File("./target")).
                addModel("building_gr2l5st22.scad", new Building()).
                saveScadFiles();
        System.out.println("Building was created!");
        System.out.println("You can find it in \"target\" directory");

    }
}
