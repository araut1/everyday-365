class Solution {
    public int[][] kClosest(int[][] points, int K) {
        
        
        
        
        
         int k = K;
        int len = points.length;
        int[][] rslt = new int[k][2];
        int[] dist = new int[len];
        int[] pos = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {

            dist[i] = (int) Math.pow(points[i][0], 2) + (int) Math.pow(points[i][1], 2);

        }

        for (int i = 0; i < len; i++) {

            map.put(i, dist[i]);

        }

        Arrays.sort(dist);

        for (int i = 0; i < k; i++) {

            int find = dist[i];

            for (Map.Entry e : map.entrySet()) {

                if ((int) e.getValue() == find) {
                    pos[i] = (int) e.getKey();
                    map.put(pos[i] , Integer.MAX_VALUE);
                    break;
                }

            }


        }

        for (int i = 0; i < k; i++) {

            int index = pos[i];

            rslt[i][0] = points[index][0];
            rslt[i][1] = points[index][1];

        }


        return rslt;
        
        
        
        
        
        
    }
}
