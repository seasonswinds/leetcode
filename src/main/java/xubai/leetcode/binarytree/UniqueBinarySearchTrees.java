package xubai.leetcode.binarytree;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 *
 * For example, Given n = 3, there are a total of 5 unique BST's.
 *
 *  1      3   3   2   1
 *   \    /   /   / \   \
 *   3   2   1   1  3   2
 *  /   /     \          \
 * 2   1      2          3
 *
 * Created by xubai on 15/11/2.
 */
public class UniqueBinarySearchTrees {
    /**
     * 要求出1, 2, ……, n所能组成的所有的二叉搜索树，
     * 则分别需求出以1为根，以2为根，……，以n为根时分别能组成多少棵二叉搜索树，再求和。
     * 设k >= 1 && k <= n，以k为根所能组成的二叉搜索树的数目为：
     * (1, 2, ……, k - 1所能组成的所有二叉搜索树的数目) * (k + 1, k + 2, ……, n所能组成的所有二叉搜索树的数目)
     * (k + 1), (k + 2), ……, n所能组成的所有二叉搜索树的数目，
     * 等价于1, 2, ……, (n - k - 1)所能组成的所有二叉搜索树的数目。
     * 即：
     * f(0) = 1,
     * f(1) = 1,
     *        n-1
     * f(n) =  Σ  f(k) * f(n - k - 1);
     *        k=0
     *
     * @param n
     * @return
     */
    public int uniqueBinarySearchTrees(int n) {
        int[] results = new int[n + 1];
        results[0] = 1;
        results[1] = 1;
        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += results[j] * results[i - j - 1];
            }
            results[i] = sum;
        }
        return results[n];
    }
}
