package com.gojek.parkinglot.core.utils;

/**
 * String util class to perform some utility string functions
 * @author Karthik
 */
public final class StringUtils {

    /**
     * The extension separator character.
     */
    private static final char EXTENSION_SEPARATOR = '.';

    /**
     * The Unix separator character.
     */
    private static final char UNIX_SEPARATOR = '/';

    /**
     * The Windows separator character.
     */
    private static final char WINDOWS_SEPARATOR = '\\';

    private static final String TEXT_FORMAT = "txt";

    /**
     * Private defualt constructor
     */
    private StringUtils(){}

    /**
     * Method to validate if given file is of txt format
     * @param filePath for which we need to validate
     * @return true if its txt file else false
     */
    public static boolean isValidFile(String filePath){
        if (filePath == null) {
            return false;
        }
        int index = indexOfExtension(filePath);
        if (index == -1) {
            return false;
        } else {
            return filePath.substring(index + 1).equals(TEXT_FORMAT);
        }
    }

    /**
     * Returns the index of the last extension separator character, which is a dot
     * @param filename  the filename to find the last path separator in, null returns -1
     * @return the index of the last separator character, or -1 if there
     * is no such character
     */
    private static int indexOfExtension(String filename) {
        if (filename == null) {
            return -1;
        }
        int extensionPos = filename.lastIndexOf(EXTENSION_SEPARATOR);
        int lastSeparator = indexOfLastSeparator(filename);
        return lastSeparator > extensionPos ? -1 : extensionPos;
    }

    /**
     * Returns the index of the last directory separator character.
     * @param filename  the filename to find the last path separator in, null returns -1
     * @return the index of the last separator character, or -1 if there
     * is no such character
     */
    private static int indexOfLastSeparator(String filename) {
        if (filename == null) {
            return -1;
        }
        int lastUnixPos = filename.lastIndexOf(UNIX_SEPARATOR);
        int lastWindowsPos = filename.lastIndexOf(WINDOWS_SEPARATOR);
        return Math.max(lastUnixPos, lastWindowsPos);
    }
}
