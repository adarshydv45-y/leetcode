
import java.util.*;

class Solution {
    int LOG;
    int[] tin, tout, depth, parent, bit;
    int[][] up;
    List<Integer>[] graph;
    char[] chars;
    int timer, n;

    public List<Boolean> palindromePath(int n, int[][] edges,
                                        String s, String[] queries) {
        this.n = n;
        chars = s.toCharArray();

        LOG = 1;
        while ((1 << LOG) <= n) LOG++;

        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        tin = new int[n];
        tout = new int[n];
        depth = new int[n];
        parent = new int[n];
        up = new int[LOG][n];
        bit = new int[n + 2];

        buildEulerAndLCA();
        buildFenwick();

        List<Boolean> ans = new ArrayList<>();

        for (String q : queries) {
            String[] p = q.split(" ");

            if (p[0].equals("update")) {
                int u = Integer.parseInt(p[1]);
                char c = p[2].charAt(0);

                int delta = (1 << (chars[u] - 'a'))
                          ^ (1 << (c - 'a'));

                if (delta != 0) {
                    add(tin[u], delta);
                    add(tout[u] + 1, delta);
                }

                chars[u] = c;

            } else {
                int u = Integer.parseInt(p[1]);
                int v = Integer.parseInt(p[2]);

                int lca = getLCA(u, v);

                int mask = prefixMask(u)
                         ^ prefixMask(v)
                         ^ (1 << (chars[lca] - 'a'));

                ans.add((mask & (mask - 1)) == 0);
            }
        }

        return ans;
    }

    void buildEulerAndLCA() {
        int[] stack = new int[2 * n + 5];
        int top = 0;

        Arrays.fill(parent, -1);
        stack[top++] = 0;

        while (top > 0) {
            int x = stack[--top];

            if (x < 0) {
                tout[~x] = timer;
                continue;
            }

            int u = x;
            tin[u] = ++timer;

            up[0][u] = (parent[u] == -1) ? u : parent[u];

            for (int j = 1; j < LOG; j++) {
                up[j][u] = up[j - 1][up[j - 1][u]];
            }

            stack[top++] = ~u;

            for (int v : graph[u]) {
                if (v == parent[u]) continue;

                parent[v] = u;
                depth[v] = depth[u] + 1;
                stack[top++] = v;
            }
        }
    }

    void buildFenwick() {
        for (int u = 0; u < n; u++) {
            int mask = 1 << (chars[u] - 'a');
            add(tin[u], mask);
            add(tout[u] + 1, mask);
        }
    }

    void add(int i, int mask) {
        while (i <= n + 1) {
            bit[i] ^= mask;
            i += i & -i;
        }
    }

    int prefixMask(int u) {
        int mask = 0;
        int i = tin[u];

        while (i > 0) {
            mask ^= bit[i];
            i -= i & -i;
        }

        return mask;
    }

    int getLCA(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int j = 0; j < LOG; j++) {
            if ((diff & (1 << j)) != 0) {
                u = up[j][u];
            }
        }

        if (u == v) return u;

        for (int j = LOG - 1; j >= 0; j--) {
            if (up[j][u] != up[j][v]) {
                u = up[j][u];
                v = up[j][v];
            }
        }

        return up[0][u];
    }
}
