package xubai.util;

import java.util.List;

/**
 * Created by xubai on 15/9/11.
 */
public class CommonUtil {
    private static final String NULL = "null";

    public static String arrayToString(int[] array) {
        return arrayToString(array, 0, array.length);
    }

    public static String arrayToString(int[] array, int length) {
        return arrayToString(array, 0, length);
    }

    public static String arrayToString(int[] array, int start, int length) {
        if (array == null) {
            return NULL;
        }
        start = Math.min(start, array.length - 1);
        length = Math.min(length, array.length - start);
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = start; i < length - 1; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.append(array[i]);
        return sb.toString();
    }

    public static String listToString(List list) {
        if (list == null) {
            return NULL;
        }
        if (list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : list) {
            if (obj instanceof List) {
                sb.append("{").append(listToString((List)obj)).append("}");
            } else {
                sb.append(obj.toString());
            }
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public static String matrixToString(int[][] matrix) {
        if (matrix == null) {
            return NULL;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            int j;
            for (j = 0; j < matrix[i].length - 1; j++) {
                sb.append(matrix[i][j]).append(", ");
            }
            sb.append(matrix[i][j]);
            sb.append("\n");
        }
        return sb.toString();
    }
}
