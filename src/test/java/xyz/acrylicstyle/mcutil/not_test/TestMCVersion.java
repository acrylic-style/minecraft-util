package xyz.acrylicstyle.mcutil.not_test;

import org.jetbrains.annotations.NotNull;
import xyz.acrylicstyle.mcutil.lang.MCVersion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestMCVersion {
    private static @NotNull String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            char c = (char) System.in.read();
            if (c == 10) return sb.toString();
            sb.append(c);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Please enter the number to execute the test.");
        System.out.println("1. Print the JSON of a random version");
        System.out.println("2. Print the JSON of ALL versions");
        System.out.println("3. Print the JSON of specified version");
        System.out.println("4. Save the JSON of ALL versions to versions.json");
        System.out.println("5. Save the JSON of ALL versions to versions.json (minified)");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        int action;
        while (true) {
            try {
                action = Integer.parseInt(readLine());
            } catch (NumberFormatException ex) {
                System.out.println("That's not an number. Please try again.");
                continue;
            }
            if (action < 1 || action > 5) {
                System.out.println("That's out of range.");
                continue;
            }
            break;
        }
        if (action == 1) {
            MCVersion version = MCVersion.values()[(int) (Math.random() * MCVersion.values().length - 1)];
            System.out.println(version.toJSONObject().toString(2));
        }
        if (action == 2) {
            System.out.println(MCVersion.getAllVersionsAsJSON().toString(2));
        }
        if (action == 3) {
            System.out.println("Please enter the version:");
            MCVersion v;
            w: while (true) {
                String line = readLine();
                for (MCVersion version : MCVersion.values()) {
                    if (version.name().equalsIgnoreCase(line)) {
                        v = version;
                        break w;
                    }
                    if (version.getId().equalsIgnoreCase(line)) {
                        v = version;
                        break w;
                    }
                    if (version.getName().equalsIgnoreCase(line)) {
                        v = version;
                        break w;
                    }
                }
                System.out.println("That doesn't look like valid version.");
            }
            System.out.println(v.toJSONObject().toString(2));
        }
        if (action == 4) {
            System.out.println("This command generates a large file. Are you sure want to continue? [y/N]");
            if (!readLine().equalsIgnoreCase("y")) {
                System.out.println("Aborted.");
                return;
            }
            long start = System.currentTimeMillis();
            File file = new File("./versions.json");
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            ps.print(MCVersion.getAllVersionsAsJSON().toString(2));
            ps.close();
            long time = System.currentTimeMillis() - start;
            System.out.println("Done: " + file.getAbsolutePath() + " (" + time + " ms)");
        }
        if (action == 5) {
            System.out.println("This command generates a large file. Are you sure want to continue? [y/N]");
            if (!readLine().equalsIgnoreCase("y")) {
                System.out.println("Aborted.");
                return;
            }
            long start = System.currentTimeMillis();
            File file = new File("./versions-min.json");
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            ps.print(MCVersion.getAllVersionsAsJSON());
            ps.close();
            long time = System.currentTimeMillis() - start;
            System.out.println("Done: " + file.getAbsolutePath() + " (" + time + " ms)");
        }
    }
}
