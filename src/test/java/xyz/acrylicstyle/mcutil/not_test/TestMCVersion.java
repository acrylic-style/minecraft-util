package xyz.acrylicstyle.mcutil.not_test;

import org.jetbrains.annotations.NotNull;
import xyz.acrylicstyle.mcutil.lang.MCVersion;

import java.io.IOException;

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
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        int action;
        while (true) {
            try {
                action = Integer.parseInt(readLine());
            } catch (NumberFormatException ex) {
                System.out.println("That's not an number. Please try again.");
                continue;
            }
            if (action < 1 || action > 3) {
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
                    if (version.getName().equalsIgnoreCase(line)) {
                        v = version;
                        break w;
                    }
                }
                System.out.println("That doesn't look like valid version.");
            }
            System.out.println(v.toJSONObject().toString(2));
        }
    }

    private static void outputAllValuesAsJSON() {
        //
    }
}
