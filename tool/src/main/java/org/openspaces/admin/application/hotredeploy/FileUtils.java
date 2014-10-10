package org.openspaces.admin.application.hotredeploy;

import java.io.File;

/**
 * @author Anna_Babich
 */
public class FileUtils {
    /**
     * Deletes directory with subdirs and subfolders
     */
    public static void deleteDirectory(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (String aChildren : children) {
                File f = new File(dir, aChildren);
                deleteDirectory(f);
            }
            dir.delete();
        } else dir.delete();
    }
}